require_relative "../views/posts_view"
require_relative "../models/post"

class PostsController
  def initialize
    @view = PostsView.new
  end

  def index
    # DO NOT WRITE SQL QUERIES
    # TODO: gather all posts from the database
    # TODO: give them to the view to be printed
    results = Post.all
    @view.display(results)
  end

  def create
    # DO NOT WRITE SQL QUERIES
    # TODO: create a post
    title = @view.user_input("title")
    url = @view.user_input("url")
    votes = @view.user_input("votes").to_i

    new_post = Post.new(
      title: title,
      url: url,
      votes: votes
    )
    new_post.save
  end

  def update
    # DO NOT WRITE SQL QUERIES
    # TODO: update a post
    post_id = @view.user_input("post id to be modified").to_i
    post = Post.find(post_id)

    post.title = @view.user_input("new title")
    post.url = @view.user_input("new url")
    post.save
  end

  def destroy
    # DO NOT WRITE SQL QUERIES
    # TODO: destroy a post
    post_id = @view.user_input("post id to be erased").to_i
    post = Post.find(post_id)
    post.destroy
  end

  def upvote
    # DO NOT WRITE SQL QUERIES
    # TODO: increment the `votes` column for a post
    post_id = @view.user_input("post id to be upvoted").to_i
    post = Post.find(post_id)
    post.votes += 1
    post.save
  end
end
