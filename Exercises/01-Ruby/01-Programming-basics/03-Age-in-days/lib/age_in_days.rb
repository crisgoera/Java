# This "require" line loads the contents of the "date" file from the standard
# Ruby library, giving you access to the Date class.
require "date"

def age_in_days(year, month, day)
  # TODO: return the age expressed in days given the day, month, and year of birth
  (Date.today - Date.parse("#{year}-#{month}-#{day}")).to_i
end
