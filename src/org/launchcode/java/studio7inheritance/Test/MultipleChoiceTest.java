package org.launchcode.java.studio7inheritance.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studio7inheritance.Main.MultipleChoice;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class MultipleChoiceTest {
    MultipleChoice test_question;
    HashMap<String, String> test_options = new HashMap<>();

    HashMap<String, String> test_answers = new HashMap<>();


    @Before
    public void createMultipleChoiceObject() {
        test_options.put("A", "Yes");
        test_options.put("B", "No");
        test_options.put("C", "What is a question?");
        test_options.put("D", "There are no questions, only lost answers.");

        test_answers.put("A", "Yes");
        test_answers.put("D", "There are no questions, only lost answers.");

        test_question = new MultipleChoice("Is this a question?", test_answers, test_options);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        assertTrue("Is this a question?" == test_question.getQuestionText());
    }

    @Test
    public void gradesQuestionCorrectly() {
        assertTrue(test_question.checkAnswer("A,D"));
    }

    @Test
    public void displaysOptionsCorrectly() {
        assertSame(test_question.displayOptions(), test_options);
    }

}
