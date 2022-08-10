package org.launchcode.java.studio7inheritance.Main;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("1. Make Quiz, 2. Take Quiz");
        String option = number.nextLine();
        if (option == "1") {
            ArrayList<Question> fullQuiz = new ArrayList<>();
            Scanner question = new Scanner(System.in);
            System.out.println("Enter your question: ");
            question =
            Quiz newQuiz = newQuiz(fullQuiz, fullQuiz.size());
        }
    }
}
