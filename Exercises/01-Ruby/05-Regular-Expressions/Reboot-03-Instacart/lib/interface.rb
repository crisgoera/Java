# TODO: you can build your instacart program here!
# Display welcome message.
puts "--------------------
Welcome to Instacart
--------------------
In our store today:"

# Define and display daily stock.
stock = { kiwi: [1.25, 5], banana: [0.5, 4], mango: [4, 1], asparagus: [9, 5] }

stock.map { |key, value| puts "#{key}: #{value[0]}€ (#{value[1]} available)" }
puts "--------------------"

# Ask for item
puts "Which item? (or 'quit' to checkout)"
input = gets.chomp.downcase

# Generate shopping list and purchase history.
list = 0
p_history = {}

# Open loop.
until input == "quit"
  case stock.key?(input.to_sym)
  when true
    puts "How many do you want?"
    quant = gets.chomp.to_i

    # Check inventory available.
    if quant <= stock[input.to_sym][1]
      stock[input.to_sym][1] = stock[input.to_sym][1] - quant
      list = list + (stock[input.to_sym][0] * quant)
      # Generate hash with purchase history.
      if p_history.key?(input.to_sym) == false
        p_history[input.to_sym] = [stock[input.to_sym][0], quant]
      else
        p_history[input.to_sym][1] = p_history[input.to_sym][1] + quant
      end
    else
      puts "Sorry, there are only #{stock[input.to_sym][1]} #{input} available"
    end
  else
    puts "Sorry, we don't have #{input} today."
  end
  puts "Which item? (or 'quit' to checkout)"
  input = gets.chomp.downcase
end

puts "-------BILL---------"
p_history.map do |key, value|
  puts "#{key}: #{value[1]} X #{value[0]}€ = #{value[1] * value[0]}€"
end
puts "TOTAL: #{list}€
--------------------"
