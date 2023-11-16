# TODO: implement the router of your app.
require_relative "app/controllers/meals_controller"
require_relative "app/controllers/customers_controller"
require_relative "app/controllers/sessions_controller"

class Router
  def initialize(meals_controller, customers_controller, sessions_controller)
    @meals_controller = meals_controller
    @customers_controller = customers_controller
    @sessions_controller = sessions_controller
    @running = true
  end

  def run
    user_type = @sessions_controller.login
    while @running
      # Display menu based on user type.
      if user_type == true
        manager_menu
      else
        rider_menu
      end
    end
  end

  def manager_menu
    case display_actions_manager
      # Route user choice to controller
    when 1 then @meals_controller.list
    when 2 then @meals_controller.add
    when 3 then @customers_controller.list
    when 4 then @customers_controller.add
    when 5 then @running = false
    end
  end

  def rider_menu
    case display_actions_rider
      # Route user choice to controller
    when 1 then @meals_controller.list
    when 2 then @meals_controller.add
    when 3 then @customers_controller.list
    when 4 then @customers_controller.add
    when 5 then @running = false
    end
  end

  def display_actions_manager
    puts "Select the action you want to perform"
    puts "1- Display all meals"
    puts "2- Add new meal"
    puts "3- Display all customers"
    puts "4- Add new customer"
    puts "5- Quit"
    gets.chomp.to_i
  end

  def display_actions_rider
    puts "Select the action you want to perform"
    puts "1- Display all meals"
    puts "2- Add new meal"
    puts "3- Display all customers"
    puts "4- Add new customer"
    puts "5- Quit"
    gets.chomp.to_i
  end
end
