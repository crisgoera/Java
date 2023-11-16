def horse_racing_format!(race_array)
  # TODO: modify the given array so that it is horse racing consistent. This method should return nil.
  race_array.map! { |entry| "-" << entry << "!" }
  race_array.reverse!
  position = (1..race_array.size).to_a.reverse
  position.map! { |entry| entry.to_s }

  # for i in (0..race_array.size - 1)
  #   race_array[i] = position[i] << race_array[i]
  # end

  race_array.each_with_index do |_horse, index|
    race_array[index] = position[index] << race_array[index]
  end
end
