def sum_odd_indexed(array)
  # TODO: computes the sum of elements at odd indexes (1, 3, 5, 7, etc.)
  #       You should use Enumerable#each_with_index
  sum = 0
  array.each_with_index { |entry, index| sum = sum + entry if index.odd? == true }
  sum
end

def even_numbers(array)
  # TODO: Return the even numbers from a list of integers.
  #       You should use Enumerable#select
  array.select { |value| value.even? == true }
end

def short_words(array, max_length)
  # TODO: Take an array of words, return the array of words not exceeding max_length characters
  #       You should use Enumerable#reject
  array.reject { |entry| entry.size > max_length }
end

def first_under(array, limit)
  # TODO: Return the first number from an array that is less than limit.
  #       You should use Enumerable#find
  array.select { |value| value <= limit }.first
end

def add_bang(array)
  # TODO: Take an array of strings and return a new array with "!" appended to each string.
  #       You should use Enumerable#map
  append = "!"
  array.map { |entry| entry + append }
end

def concatenate(array)
  # TODO: Concatenate all strings given in the array.
  #       You should use Enumerable#reduce
  array.reduce(:+)
end

def sorted_pairs(array)
  # TODO: Reorganize an array into slices of 2 elements, and sort each slice alphabetically.
  #       You should use Enumerable#each_slice
  sorted_array = []
  array.each_slice(2) { |entry| sorted_array << entry.sort }
  return sorted_array
end
