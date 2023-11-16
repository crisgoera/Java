def wagon_sort(students)
  # TODO: return (not print!) a copy of students, sorted alphabetically
  if students[0] == ""
    return students
  else
    return students.sort_by(&:downcase)
  end
end
