require_relative "animal"

class Cow < Animal
  def initialize
    super
    @milk = 0
  end

  attr_reader :milk

  def talk
    "moo"
  end

  def feed!
    super
    @milk += 2
  end
end
