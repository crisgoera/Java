require_relative "../repositories/meal_repository"
require_relative "../models/meal"
require_relative "../views/meals_view"



class MealsController
  def initialize(meal_repository)
    @repo = meal_repository
    @view = MealsView.new
  end

  def list
    meals = @repo.all
    @view.display(meals)
  end

  def add
    name = @view.add_meal("name")
    price = @view.add_meal("price").to_i
    @new_meal = Meal.new({ name: name, price: price })
    @repo.create(@new_meal)
  end
end
