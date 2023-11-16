def french_phone_number?(phone_number)
  # TODO: true or false?
/^\+33\s?[1-9]\d\s?\d{2}\s?\d{5}/.match?(phone_number) || /^0\s?\d\d\s?\d{2}\s?\d{5}/.match?(phone_number)
end
