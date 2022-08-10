package org.launchcode.java.studio7inheritance.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studio7inheritance.Main.*;

import java.util.HashMap;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class QuizTest {

    Quiz test_quiz;
    double grade;
    ArrayList<Question> questions = new ArrayList<>();

    MultipleChoice test_question;
    HashMap<String, String> test_options = new HashMap<>();
    HashMap<String, String> test_answers = new HashMap<>();

    Checkbox test_question2;
    String correctAnswer;

    TrueFalse test_question3;

    @Before
    public void createQuestionsObjects() {
        test_options.put("A", "Yes");
        test_options.put("B", "No");
        test_options.put("C", "What is a question?");
        test_options.put("D", "There are no questions, only lost answers.");

        test_answers.put("A", "Yes");
        test_answers.put("D", "There are no questions, only lost answers.");
        test_question = new MultipleChoice("Is this a question?", test_answers, test_options);

        correctAnswer = "A";
        test_question2 = new Checkbox("Is this a question?", correctAnswer, test_options);

        test_question3 = new TrueFalse("This is a question.", true);

        questions.add(test_question);
        test_quiz = new Quiz(questions, 1);
    }

    @Test
    public void addsTrueFalseQuestionToQuiz() {
        test_quiz.addTrueFalseQuestion(test_question3);
        ArrayList<Question> samples = test_quiz.getFullQuiz();
        assertSame(test_question3, samples.get(1));
    }

    @Test
    public void runsTheQuiz() {
        test_quiz.addTrueFalseQuestion(test_question3);
        test_quiz.addCheckboxQuestion(test_question2);
        assertEquals(3, test_quiz.runQuiz(), .001);
    }

}
