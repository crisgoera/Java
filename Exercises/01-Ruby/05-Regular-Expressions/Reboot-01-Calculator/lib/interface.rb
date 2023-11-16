# TODO: you can build your calculator program here!

require_relative "calculator"
cond = "Y"

while cond == "Y"
  # Ask for 1st number
  puts "Please, enter the first number:"
  first_number = gets.chomp.to_i

  # Ask for 2nd number
  puts "Please, enter the second number:"
  last_number = gets.chomp.to_i

  # Ask for operator
  puts "Please, enter the operation you want to perform:[+][-][*][/]"
  operator = gets.chomp

  # Perform calculation
  result = calculator(first_number, last_number, operator)

  # Display result
  puts result
  puts "Do you wish to calculate again?[Y/N]"
  cond = gets.chomp.upcase

end
