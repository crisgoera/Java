require_relative "coach_answer"
# TODO: Implement the program that makes you discuss with your coach from the terminal.

puts "Type your message"
your_message = gets.chomp

puts coach_answer(your_message)