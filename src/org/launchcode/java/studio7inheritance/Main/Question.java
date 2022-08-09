package org.launchcode.java.studio7inheritance.Main;

import java.util.Objects;

public abstract class Question {
    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionText.equals(question.questionText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionText);
    }

    public abstract String askQuestion();

    public abstract boolean checkAnswer(String answer);
}
