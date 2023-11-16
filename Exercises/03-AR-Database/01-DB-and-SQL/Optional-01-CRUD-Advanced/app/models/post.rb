# You can use a global variable, DB, which is an instance of SQLite3::Database
# No need to create it, you can just use it!

class Post
  # TODO
  def initialize(attrs = {})
    @title = attrs[:title]
    @url = attrs[:url]
    @votes = attrs[:votes]
    @id = attrs[:id]
  end

  attr_reader :id, :votes
  attr_accessor :title, :url

  def self.find(id)
    query = "SELECT * FROM posts WHERE id = ?;"

    result = DB.execute(query, id).flatten
    if result.empty?
      nil
    else
      obj_builder(result)
    end
  end

  def self.obj_builder(result)
    attrs = { id: result[0], title: result[1], url: result[2], votes: result[3] }
    Post.new(attrs)
  end

  def self.all
    query = "SELECT * FROM posts"
    results = DB.execute(query)

    output = []
    results.each { |result| output << obj_builder(result) }
    output
  end

  def destroy
    query = <<~SQL
      DELETE FROM posts
      WHERE id = ?
    SQL
    DB.execute(query, @id)
  end
end
