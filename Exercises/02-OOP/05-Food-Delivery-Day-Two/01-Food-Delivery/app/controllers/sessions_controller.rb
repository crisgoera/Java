require_relative "../models/employee"
require_relative "../repositories/employee_repository"
require_relative "../views/employees_view"

class SessionsController
  def initialize(employee_repository)
    @repo = employee_repository
    @view = EmployeesView.new
  end

  def login
    username = @view.ask_user("username")
    password = @view.ask_user("password").to_s
    user = @repo.find_by_username(username)
    if user.password == password
      @view.welcome(username)
      user.manager?
    else
      @view.invalid
      login
    end
  end
end
