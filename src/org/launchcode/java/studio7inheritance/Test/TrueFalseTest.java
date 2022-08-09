package org.launchcode.java.studio7inheritance.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studio7inheritance.Main.TrueFalse;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TrueFalseTest {
    TrueFalse test_question;

    @Before
    public void createTestQuestionObject() {
        test_question = new TrueFalse("This is a question.", true);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        assertTrue("This is a question." == test_question.getQuestionText());
    }

    @Test
    public void gradesQuestionCorrectly() {
        assertTrue(test_question.checkAnswer("T"));
    }

    @Test
    public void gradesIncorrectAnswerFalse() {
        assertFalse(test_question.checkAnswer("F"));
    }


}
