def burger(patty, sauce, topping)
 order = (block_given? ? yield(patty) : patty)
 ["bread", order, sauce, topping, "bread"]
end
