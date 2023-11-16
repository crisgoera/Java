# lib/scraper.rb
require 'nokogiri'

filepath = "/home/crisgoera/code/crisgoera/fullstack-challenges/01-Ruby/06-Parsing/Reboot-01-Christmas-list/results.html"
# 1. We get the HTML page content
html_content = File.open(filepath)
# 2. We build a Nokogiri document from this file
doc = Nokogiri::HTML.parse(html_content)

# TODO: you can build your christmas list program here!

# Welcome message
puts "Welcome to your Christmas gift list"

# Initialize action
action = nil

# Initialize list array and hash
gift_list = []

# Loop starts
until action == "quit"
  # Break loop when action is "quit"

  # 1 Ask user to select an action and store it.
  puts "Which action [list|add|delete|mark|idea|quit]?"
  action = gets.chomp.downcase
  # 1.1 Execute chosen action #if statements
  case action
  when "list" # Display indexed gift list
    gift_list.each_with_index { |item, index| puts "#{index + 1}- #{item.keys[0]} #{item.values[0]}" }

  when "add" # Add new entry to the list
    puts "Which item do you wish to add?"
    item = gets.chomp.capitalize
    gift_list << { item.to_sym => "[ ]" }

  when "delete" # Removes entry from the list
    puts "Introduce the index of the item do you wish to delete:"
    gift_list.delete_at(gets.chomp.to_i - 1)

  when "mark" # Maks item as bought
    # Display list for UX
    puts "Which item have you bought? (Give the index)"
    index = gets.chomp.to_i - 1
    key = gift_list[index].keys
    gift_list[index] = { key[0] => "[X]" }

  when "idea" # Looks for ideas on Etsy"
    puts "What are you looking for on Etsy?"
    search = gets.chomp.capitalize
    results = []
    # 3. We search for the correct elements containing the items' title in our HTML doc
    doc.search('.v2-listing-card__info .v2-listing-card__title').first(5).each do |element|
      # 4. For each item found, we extract its title and print it
     element.text.strip.match?(search) == true

  when "quit"
    puts "Goodbye."
  else
    puts "The introduced action is not correct."
  end
end
