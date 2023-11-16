class Order
  def initialize(attrs = {})
    @id = attrs[:id]
    @delivered = attrs[:delivered]
    @meal = attrs[:meal]
    @customer = attrs[:customer]
    @employee = attrs[:employee]
  end

  attr_reader :meal, :customer, :employee
  attr_accessor :id, :delivered

  def delivered?
    @delivered == true
  end

  def deliver!
    @delivered = true
  end
end
