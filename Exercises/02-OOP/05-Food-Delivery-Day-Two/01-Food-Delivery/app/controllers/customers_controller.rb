require_relative "../repositories/customer_repository"
require_relative "../models/customer"
require_relative "../views/customers_view"

class CustomersController
  def initialize(customer_repository)
    @repo = customer_repository
    @view = CustomersView.new
  end

  def list
    @view.display(@repo.all)
  end

  def add
    @name = @view.add_customer("name")
    @address = @view.add_customer("address")
    new_customer = Customer.new({ name: @name, address: @address })
    @repo.create(new_customer)
  end
end
