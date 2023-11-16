class Meal
  def initialize(attrs = {})
    @name = attrs[:name]
    @price = attrs[:price]
    @id = attrs[:id]
  end
  attr_reader :name, :price
  attr_accessor :id
end
