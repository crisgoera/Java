require_relative "animal"

class Chicken < Animal
  def initialize(sex)
    super()
    @gender = sex
    @eggs = 0
  end

  attr_reader :gender, :energy, :eggs

  def talk
    case @gender
    when 'male'
      return "cock-a-doodle-doo"
    when 'female'
      return "cluck cluck"
    else
      return nil
    end
  end

  def feed!
    super
    @eggs += 2 if @gender == "female"
  end
end
