require_relative "../controllers/meals_controller"
require_relative "../models/meal"

class MealsView
  def display(meals)
    meals.each { |meal| puts "#{meal.id}- #{meal.name}. #{meal.price}$" }
  end

  def add_meal(entry)
    puts "Introduce meal #{entry}:"
    gets.chomp
  end
end
