package org.launchcode.java.studio7inheritance.Main;
import java.util.HashMap;
import java.util.Objects;

public class Checkbox extends Question{
    private String correctAnswer;
    private HashMap<String, String> options;

    public Checkbox(String questionText, String correctAnswer, HashMap<String, String> options) {
        super(questionText);
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public HashMap<String, String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Checkbox checkbox = (Checkbox) o;
        return getCorrectAnswer() == checkbox.getCorrectAnswer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCorrectAnswer());
    }

    public String askQuestion() {
        return super.getQuestionText() + " Type the letter of the correct answer:";
    };

    public boolean checkAnswer(String answer) {
        if (answer == correctAnswer) {
            return true;
        } else {return false;}
    }

    public HashMap<String, String> displayOptions() {
        return this.options;
    }
}
