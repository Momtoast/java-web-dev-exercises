package org.launchcode.java.studio7inheritance.Main;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> fullQuiz = new ArrayList<Question>();

    private ArrayList<String> answers = new ArrayList<>();
    private double grade;
    private double possibleGrade;

    public Quiz(ArrayList<Question> fullQuiz, double possibleGrade) {
        this.fullQuiz = fullQuiz;
        this.possibleGrade = possibleGrade;
    }

    public ArrayList<Question> getFullQuiz() {
        return fullQuiz;
    }

    public void setFullQuiz(ArrayList<Question> fullQuiz) {
        this.fullQuiz = fullQuiz;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getPossibleGrade() {
        return possibleGrade;
    }

    public void setPossibleGrade(double possibleGrade) {
        this.possibleGrade = possibleGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return getFullQuiz().equals(quiz.getFullQuiz());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullQuiz());
    }

    public void addTrueFalseQuestion(TrueFalse question) {
        fullQuiz.add(question);
    }

    public void addMultipleChoiceQuestion(MultipleChoice question) {
        fullQuiz.add(question);
    }

    public void addCheckboxQuestion(Checkbox question) {
        fullQuiz.add(question);
    }

    public double runQuiz() {
        for (Question question : fullQuiz) {
            Scanner myObj = new Scanner(System.in);
            question.askQuestion();
            question.displayOptions();
            String choice = myObj.nextLine();
            if (question.checkAnswer(choice)) {
                grade = grade + 1;
            }
        }
        return grade;
    }
}
