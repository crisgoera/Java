class PostsView
  # TODO: implement some methods here when controller needs to `puts` or `gets`
  def display(posts)
    posts.each { |entry| puts entry.title }
  end

  def user_input(entry)
    puts "Please introduce the #{entry}"
    gets.chomp
  end
end
