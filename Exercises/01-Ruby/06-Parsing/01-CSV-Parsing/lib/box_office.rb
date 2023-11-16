require 'csv'
require "date"

file_path = "/lib/box_office.rbng/lib/movies.csv"

def most_successful(number = nil, max_year = nil, file_path)
  # TODO: return an array of most successful movies before `max_year`

  # Order earnings in a new array.
  earnings = []
  CSV.foreach(file_path) do |row|
    earnings << row[2]
  end
  


end
