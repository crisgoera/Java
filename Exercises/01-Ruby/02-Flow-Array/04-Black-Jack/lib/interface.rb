require_relative "croupier"

# TODO: make the user play from terminal in a while loop that will stop
#       when the user will not be asking for  a new card

player_score = 0
pick_bank_score

puts "Card? 'y' or 'yes' to get a new card"
input = gets.chomp

while input == "yes"
  player_score = player_score + pick_player_card
  puts state_of_the_game
  puts "Card? 'yes' to get a new card"
  input = gets.chomp
end

puts end_game_message
