require_relative "wagon_sort"

# TODO: Ask the user about students to add to the Wagon.
#       Remember, to read an input from the command line, use:
#       - `gets`:  https://ruby-doc.org/core-2.7.5/Kernel.html#method-i-gets
#       - `chomp`: https://ruby-doc.org/core-2.7.5/String.html#method-i-chomp
array = []
puts "Type a student name"
input = gets.chomp
while input != ""
  array.push(input)
  puts "Type another name"
  input = gets.chomp
end

# TODO: Then call `wagon_sort` method defined in the wagon_sort.rb
#       file and display the sorted student list
num_students = wagon_sort(array).size
message = "Congratulations! Your Wagon has #{num_students} students!:"
message_names = ""
if num_students == 1
  message_names << "#{array[0]}"
elsif num_students == 3
  message_names << "#{array[0]}, #{array[1]} and #{array[2]}"
else
  message_names << "#{array[0]}, #{array[1]}, #{array[2]} and #{array[3]}"
end

puts message
puts message_names
