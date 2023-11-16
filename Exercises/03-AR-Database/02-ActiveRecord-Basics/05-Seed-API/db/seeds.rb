require "json"
require "rest-client"
require_relative "../app/models/post"

# TODO: Write a seed to insert 10 posts in the database fetched from the Hacker News API.
response = RestClient.get "https://hacker-news.firebaseio.com/v0/topstories.json"
repo_parse = JSON.parse(response)
repo_parse = repo_parse.first(10)


output = []
repo_parse.each do |entry|
  post = RestClient.get "https://hacker-news.firebaseio.com/v0/item/#{entry}.json"
  p result = JSON.parse(post)
  new_entry = Post.new(
    title: result["title"],
    url: result["url"],
    votes: result["score"]
  )
  new_entry.save
end
