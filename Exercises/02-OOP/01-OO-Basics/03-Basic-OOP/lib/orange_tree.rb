class OrangeTree
  # TODO: Implement all the specs defined in the README.md :)
  def initialize
    @age = 0
    @height = 0
    @fruits = 0
    @dead = false
  end

  def one_year_passes!
    @age = @age + 1 if @dead == false
    @height = @height + 1 if @age <= 10
    case @age
    when (6..9)
      @fruits = 100
    when (10..14)
      @fruits = 200
    else
      @fruits = 0
    end
  end

  def pick_a_fruit!
    @fruits = @fruits - 1 if @fruits.positive?
  end

  def dead?
    @dead = true if rand(51..100) <= @age
    return @dead
  end

  attr_accessor :age, :height, :dead, :fruits
end
