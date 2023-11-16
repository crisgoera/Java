class EmployeesView
  def ask_user(entry)
    puts "Please introduce #{entry}:"
    gets.chomp
  end

  def invalid
    puts "Invalid credentials"
  end

  def welcome(user)
    puts "Welcome #{user}!"
  end
end
