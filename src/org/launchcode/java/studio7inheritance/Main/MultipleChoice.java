package org.launchcode.java.studio7inheritance.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MultipleChoice extends Question {
    private HashMap<String, String> correctAnswers;
    private HashMap<String, String> options;

    public MultipleChoice(String questionText, HashMap<String, String> correctAnswers, HashMap<String, String> options) {
        super(questionText);
        this.correctAnswers = correctAnswers;
        this.options = options;
    }

    public HashMap<String, String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(HashMap<String, String> correctAnswers) {
        this.correctAnswers = correctAnswers;
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
        MultipleChoice that = (MultipleChoice) o;
        return getCorrectAnswers().equals(that.getCorrectAnswers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCorrectAnswers());
    }

    public String askQuestion() {
        return super.getQuestionText() + " Choose all that apply. Type the letters separated by only commas. (ie. A,D)";
    };

    public boolean checkAnswer(String answer) {
        String[] answers = answer.split(",");
        int total = 0;
        if (this.correctAnswers.size() == answers.length) {
            for (String choice : answers) {
                if (this.correctAnswers.containsKey(choice)) {
                    total = total +1;
                }
            }
        }

        if (total == this.correctAnswers.size()) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, String> displayOptions() {
        return this.options;
    }
}
