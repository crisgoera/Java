def colorful?(number)
  if number.is_a?(Integer) == false
    return false
  else
    validation(number)
  end
end

def validation(number)
  array = number.digits
  case array.size
  when 1
    response = true
  when 2
    array[2] = array[0] * array[1]
    response = array.uniq.size == array.size
  when 3
    array[3] = array[0] * array[1]
    array[4] = array[1] * array[2]
    array[5] = array[0] * array[1] * array[2]
    response = array.uniq.size == array.size
  end
  return response
end
