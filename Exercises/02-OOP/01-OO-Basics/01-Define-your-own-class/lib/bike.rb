class Bike
  def initialize(brand, model, year)
    @brand = brand
    @model = model
    @year = year
    @used = false
  end

  def used!
    @used = true
  end

  def used?
    return @used
  end

  attr_accessor :brand, :model, :year
end
