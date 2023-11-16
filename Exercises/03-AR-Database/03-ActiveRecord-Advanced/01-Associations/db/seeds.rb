# TODO: Write a seed
require "faker"

5.times do
  user = User.new(username: Faker::Internet.username, email: Faker::Internet.email)
  user.save

  rand(5..10).times do
    post = Post.new(title: Faker::ChuckNorris.fact, url: Faker::Internet.url, user_id: user.id)
    post.save
  end
end
