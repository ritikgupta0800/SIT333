package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMathQuestionService {

    // --- Addition Tests ---

    @Test
    public void testAdditionPositiveNumbers() {
        assertEquals(10.0, MathQuestionService.q1Addition("4", "6"), 0.001);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        assertEquals(-9.0, MathQuestionService.q1Addition("-4", "-5"), 0.001);
    }

    @Test
    public void testAdditionMixedSigns() {
        assertEquals(1.0, MathQuestionService.q1Addition("5", "-4"), 0.001);
    }

    @Test
    public void testAdditionZero() {
        assertEquals(5.0, MathQuestionService.q1Addition("5", "0"), 0.001);
    }

    @Test
    public void testAdditionInvalidInput() {
        assertTrue(Double.isNaN(MathQuestionService.q1Addition("abc", "5")));
    }

    @Test
    public void testAdditionNullInput() {
        assertTrue(Double.isNaN(MathQuestionService.q1Addition(null, "5")));
    }

    @Test
    public void testAdditionEmptyInput() {
        assertTrue(Double.isNaN(MathQuestionService.q1Addition("", "5")));
    }

    // --- Subtraction Tests ---

    @Test
    public void testSubtractionPositiveNumbers() {
        assertEquals(3.0, MathQuestionService.q2Subtraction("8", "5"), 0.001);
    }

    @Test
    public void testSubtractionNegativeNumbers() {
        assertEquals(1.0, MathQuestionService.q2Subtraction("-4", "-5"), 0.001);
    }

    @Test
    public void testSubtractionMixedSigns() {
        assertEquals(9.0, MathQuestionService.q2Subtraction("4", "-5"), 0.001);
    }

    @Test
    public void testSubtractionZero() {
        assertEquals(4.0, MathQuestionService.q2Subtraction("4", "0"), 0.001);
    }

    @Test
    public void testSubtractionInvalidInput() {
        assertTrue(Double.isNaN(MathQuestionService.q2Subtraction("xyz", "2")));
    }

    @Test
    public void testSubtractionNullInput() {
        assertTrue(Double.isNaN(MathQuestionService.q2Subtraction(null, "2")));
    }

    @Test
    public void testSubtractionEmptyInput() {
        assertTrue(Double.isNaN(MathQuestionService.q2Subtraction("", "2")));
    }

    // --- Multiplication Tests ---

    @Test
    public void testMultiplicationPositiveNumbers() {
        assertEquals(20.0, MathQuestionService.q3Multiplication("4", "5"), 0.001);
    }

    @Test
    public void testMultiplicationNegativeNumbers() {
        assertEquals(20.0, MathQuestionService.q3Multiplication("-4", "-5"), 0.001);
    }

    @Test
    public void testMultiplicationMixedSigns() {
        assertEquals(-20.0, MathQuestionService.q3Multiplication("4", "-5"), 0.001);
    }

    @Test
    public void testMultiplicationZero() {
        assertEquals(0.0, MathQuestionService.q3Multiplication("4", "0"), 0.001);
    }

    @Test
    public void testMultiplicationInvalidInput() {
        assertTrue(Double.isNaN(MathQuestionService.q3Multiplication("five", "3")));
    }

    @Test
    public void testMultiplicationNullInput() {
        assertTrue(Double.isNaN(MathQuestionService.q3Multiplication(null, "3")));
    }

    @Test
    public void testMultiplicationEmptyInput() {
        assertTrue(Double.isNaN(MathQuestionService.q3Multiplication("", "3")));
    }
}
