class Restaurant
  # TODO: add relevant accessors if necessary

  def initialize(city, name)
    # TODO: implement constructor with relevant instance variables
    @city = city
    @name = name
    @rating = []
  end

  attr_reader :name, :city, :average_rating

  def rate(new_rate)
    @rating << new_rate
    @average_rating = @rating.reduce(:+) / @rating.size.to_f
  end

  # TODO: implement .filter_by_city and #rate methods
  def self.filter_by_city(restaurants, city)
    result = []
    restaurants.each { |restaurant| result << restaurant if restaurant.city == city }
    return result
  end
end
