def coach_answer(your_message)
  # TODO: return coach answer to your_message
  if your_message[-1] == "?"
    return "Silly question, get dressed and go to work!"
  elsif your_message == "I am going to work right now!"
    return ""
  else
    return "I don't care, get dressed and go to work!"
  end
end

def coach_answer_enhanced(your_message)
  # TODO: return coach answer to your_message, with additional custom rules of yours!
  if your_message.upcase == "I AM GOING TO WORK RIGHT NOW!"
    return ""
  else
    if your_message.upcase == your_message
      question_validation(your_message)

    elsif your_message.upcase != your_message
      sentence_validation(your_message)
    end
  end
end

def question_validation(your_message)
  if your_message[-1] == "?"
    return "I can feel your motivation! Silly question, get dressed and go to work!"
  else
    return "I can feel your motivation! I don't care, get dressed and go to work!"
  end
end

def sentence_validation(your_message)
  if your_message[-1] == "?"
    return "Silly question, get dressed and go to work!"
  else
    return "I don't care, get dressed and go to work!"
  end
end
