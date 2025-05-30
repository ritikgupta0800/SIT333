package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(3, MathQuestionService.q1Addition("1", "2"), 0);
	}

	@Test
	public void testAddNumber1Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
	}

	@Test
	public void testAddInvalidInput() {
		Assert.assertNull(MathQuestionService.q1Addition("abc", "2"));
	}

	@Test
	public void testTrueSub() {
		Assert.assertEquals(2, MathQuestionService.q2Subtraction("5", "3"), 0);
	}

	@Test
	public void testSubInvalidInput() {
		Assert.assertNull(MathQuestionService.q2Subtraction("abc", "3"));
	}

	@Test
	public void testTrueMul() {
		Assert.assertEquals(6, MathQuestionService.q3Multiplication("2", "3"), 0);
	}

	@Test
	public void testMulInvalidInput() {
		Assert.assertNull(MathQuestionService.q3Multiplication("2", ""));
	}
}
