def array_to_hash(array)
  # TODO: implement the method :)
  hash = {}
  if block_given?
    array.each_with_index { |entry, index| hash[yield(index)] = entry }
  else
    array.each_with_index { |entry, index| hash[index.to_s] = entry }
  end
  hash
end
