require_relative "crop"

# TODO: code the Corn class
class Corn < Crop
  def water!
    @grains = super + 10
  end
end
