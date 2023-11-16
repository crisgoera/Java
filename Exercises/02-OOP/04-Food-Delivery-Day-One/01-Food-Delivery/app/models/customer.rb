class Customer
  def initialize(attrs = {})
    @name = attrs[:name]
    @address = attrs[:address]
    @id = attrs[:id]
  end
  attr_reader :name, :address
  attr_accessor :id
end
