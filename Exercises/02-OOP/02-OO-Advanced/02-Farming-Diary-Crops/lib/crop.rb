class Crop
  def initialize
    @grains = 0
  end

  attr_reader :grains

  def water!
    @grains += 0
  end

  def ripe?
    @grains >= 15
  end
end
