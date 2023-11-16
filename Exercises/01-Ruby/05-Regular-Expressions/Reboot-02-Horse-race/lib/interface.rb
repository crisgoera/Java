# TODO: you can build your horse race program here!
require_relative "race_result"

# Set player's balance.
user_balance = 100

# Initiate loop when balance > 10euro

while user_balance >= 10

  # Display welcome message and horse list.

  puts "Welcome to Horse Racing Simulator. Make your choice from the following list:
  Secretariat, Seattle Slew, Man of War, Citation Needed"

  # Register user's choice.
  user_sel = gets.chomp.capitalize

  # Randomize race winner.
  horse_list = ["Secretariat", "Seattle Slew", "Man of War", "Citation Needed"]
  rand_horse = horse_list.sample.capitalize

  # Compare winner with player choice, adjaust balance and display result.
  if race_result(rand_horse, user_sel) == true
    user_balance = user_balance + 50
    puts "The race winner is #{rand_horse}. You won!
    Your new balance is #{user_balance}."
  else
    user_balance = user_balance - 10
    puts "The race winner is #{rand_horse}. You lost!
    Your new balance is #{user_balance}."
  end
end
