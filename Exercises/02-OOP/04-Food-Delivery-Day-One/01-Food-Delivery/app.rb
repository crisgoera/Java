# TODO: require relevant files to bootstrap the app.
# Then you can test your program with:
#   ruby app
require_relative 'app/repositories/meal_repository'  # Repository filepath
require_relative 'app/controllers/meals_controller'  # Controller filepath
require_relative 'router'                            # Router filepath
require_relative 'app/repositories/customer_repository'  # Repository filepath
require_relative 'app/controllers/customers_controller'  # Controller filepath


customer_csv_filepath = "data/customers.csv"
csv_filepath = "data/meals.csv"
meal_repository = MealRepository.new(csv_filepath)
meals_controller = MealsController.new(meal_repository)
customer_repository = CustomerRepository.new(customer_csv_filepath)
customers_controller = CustomersController.new(customer_repository)



router = Router.new(meals_controller, customers_controller)

# Start the app
router.run
