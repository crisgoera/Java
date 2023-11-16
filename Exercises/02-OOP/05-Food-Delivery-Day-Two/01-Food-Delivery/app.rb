# TODO: require relevant files to bootstrap the app.
# Then you can test your program with:
#   ruby app
require_relative 'app/repositories/meal_repository'       # Meals Repository filepath
require_relative 'app/controllers/meals_controller'       # Meals Controller filepath
require_relative 'app/repositories/customer_repository'   # Customer Repository filepath
require_relative 'app/controllers/customers_controller'   # Customer Controller filepath
require_relative 'app/repositories/employee_repository'   # Employee Repository filepath
require_relative 'app/controllers/sessions_controller'    # Sessions Controller
require_relative 'router'                                 # Router filepath


csv_filepath = "data/meals.csv"
customer_csv_filepath = "data/customers.csv"
employee_csv_filepath = "data/employees.csv"

meal_repository = MealRepository.new(csv_filepath)
meals_controller = MealsController.new(meal_repository)
customer_repository = CustomerRepository.new(customer_csv_filepath)
customers_controller = CustomersController.new(customer_repository)
employee_repository = EmployeeRepository.new(employee_csv_filepath)
sessions_controller = SessionsController.new(employee_repository)



router = Router.new(meals_controller, customers_controller, sessions_controller)

# Start the app
router.run
