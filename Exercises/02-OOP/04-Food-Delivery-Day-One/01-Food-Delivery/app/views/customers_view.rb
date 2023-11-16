require_relative "../controllers/customers_controller"
require_relative "../models/customer"

class CustomersView
  def display(customers)
    customers.each { |customer| puts "#{customer.id}- #{customer.name} with address #{customer.address}." }
  end

  def add_customer(entry)
    puts "Please introduce customer's #{entry}:"
    gets.chomp
  end
end
