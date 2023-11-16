def calculator(first_number, last_number, operator)
  case operator
  when "+" then first_number + last_number
  when "-" then first_number - last_number
  when "*" then first_number * last_number
  when "/" then (first_number / last_number.to_f).round(2)
  else puts "The introduced operator is not valid."
  end
end
