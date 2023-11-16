require 'csv'
require_relative "../models/meal"

class MealRepository
  def initialize(csv_filepath)
    @csv_filepath = csv_filepath
    @meals = []
    @next_id = 1
    load_csv if File.exist?(@csv_filepath)
  end

  attr_reader :id
  attr_writer :meals

  def create(meal)
    meal.id = @next_id
    @next_id += 1
    @meals << meal
    save_csv
  end

  def save_csv
    CSV.open(@csv_filepath, "wb") do |csv|
      csv << ["id", "name", "price"]
      @meals.each do |meal|
        csv << [meal.id, meal.name, meal.price]
      end
    end
  end

  def all
    @meals
  end

  def find(sample_id)
    @meals.find { |meal| meal.id == sample_id }
  end

  def load_csv
    CSV.foreach(@csv_filepath, headers: :first_row, header_converters: :symbol) do |row|
      row[:price] = row[:price].to_i
      row[:id] = row[:id].to_i
      @meals << Meal.new(row)
    end
    @next_id = @meals.last.id + 1 unless @meals.empty?
  end
end
