package org.launchcode.java.studio7inheritance.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studio7inheritance.Main.Checkbox;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CheckboxTest {
    Checkbox test_question;
    HashMap<String, String> test_options = new HashMap<>();
    String correctAnswer;

    @Before
    public void createCheckboxObject() {
        test_options.put("A", "Yes");
        test_options.put("B", "No");
        test_options.put("C", "What is a question?");
        test_options.put("D", "There are no questions, only lost answers.");

        correctAnswer = "A";

        test_question = new Checkbox("Is this a question?", correctAnswer, test_options);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        assertTrue("Is this a question?" == test_question.getQuestionText());
    }

    @Test
    public void gradesQuestionCorrectly() {
        assertTrue(test_question.checkAnswer("A"));
    }

    @Test
    public void gradesIncorrectAnswerFalse() {
        assertFalse(test_question.checkAnswer("D"));
    }

    @Test
    public void displaysOptionsCorrectly() {
        assertSame(test_question.displayOptions(), test_options);
    }
}
