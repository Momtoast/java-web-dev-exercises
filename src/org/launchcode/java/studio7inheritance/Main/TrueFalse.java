package org.launchcode.java.studio7inheritance.Main;

import java.util.HashMap;
import java.util.Objects;

public class TrueFalse extends Question{
    boolean correctAnswer;

    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrueFalse trueFalse = (TrueFalse) o;
        return isCorrectAnswer() == trueFalse.isCorrectAnswer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCorrectAnswer());
    }

    public String askQuestion() {
        return super.getQuestionText() + " Type T or F for True or False";
    };

    public boolean checkAnswer(String answer) {
        if (answer == "T" && correctAnswer) {
            return true;
        } else if (answer == "F" && correctAnswer == false) {
            return true;
        } else {
            return false;}
    }

    @Override
    public HashMap<String, String> displayOptions() {
        return null;
    }
}
