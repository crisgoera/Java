require_relative "crop"

# TODO: code the Rice class
class Rice < Crop
  def transplant!
    @grains += 10
  end

  def water!
    @grains = super + 5
  end
end
