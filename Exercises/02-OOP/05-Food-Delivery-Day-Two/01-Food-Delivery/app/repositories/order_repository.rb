require "csv"
require_relative "../models/order"

class OrderRepository
  def initialize(csv_file, meal_repository, customer_repository, employee_repository)
    @csv_file = csv_file
    @meal_repository = meal_repository
    @customer_repository = customer_repository
    @employee_repository = employee_repository

    @orders = []
    @next_id = 1

    load_csv if File.exist?(@csv_file)
  end

  def load_csv
    CSV.foreach(@csv_file, headers: :first_row, header_converters: :symbol) do |row|
      row[:id] = row[:id].to_i
      row[:delivered] = row[:delivered] == "true"
      row[:meal] = row[:meal_id].to_i
      row[:customer] = row[:customer_id].to_i
      row[:employee] = row[:employee_id].to_i
      @orders << Order.new(row)
    end
    @next_id = @orders.last.id + 1 unless @orders.empty?
  end
end
