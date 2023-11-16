# TODO: implement the router of your app.
require_relative "app/controllers/meals_controller"
require_relative "app/controllers/customers_controller"

class Router
  def initialize(meals_controller, customers_controller)
    @meals_controller = meals_controller
    @customers_controller = customers_controller
    @running = true
  end

  def run
    while @running
      # Route user choice to controller
      case display_actions
      when 1 then @meals_controller.list
      when 2 then @meals_controller.add
      when 3 then @customers_controller.list
      when 4 then @customers_controller.add
      when 5 then @running = false
      end
    end
  end

  def display_actions
    puts "Select the action you want to perform"
    puts "1- Display all meals"
    puts "2- Add new meal"
    puts "3- Display all customers"
    puts "4- Add new customer"
    puts "5- Quit"
    gets.chomp.to_i
  end
end
