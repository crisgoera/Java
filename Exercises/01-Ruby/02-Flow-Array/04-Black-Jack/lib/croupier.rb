require_relative 'black_jack'

def state_of_the_game(player_score, bank_score)
  # TODO: return (not print!) a message containing the player's score and bank's score
  return "Your score is #{player_score}, bank is #{bank_score}."
end

def end_game_message(player_score, bank_score)
  # TODO: return (not print!) a message telling if the user won or lost.
  case player_score
  when 21
    return "Black Jack"
  when ((bank_score + 1)..20)
    return "You won"
  when bank_score
    return "Push"
  else
    return "You lost"
  end
end
