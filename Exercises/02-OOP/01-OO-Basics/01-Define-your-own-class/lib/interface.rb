require_relative "bike"

new_bike = Bike.new("Batavus", "Sprint", 2005)
old_bike = Bike.new("Decathlon", "Sport", 2012)

p new_bike
p old_bike

new_bike.used!

p new_bike
