package web.service;

public class MathQuestionService {

	/**
	 * Safe addition for Q1.
	 */
	public static Double q1Addition(String number1, String number2) {
		try {
			double result = Double.valueOf(number1) + Double.valueOf(number2);
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Safe subtraction for Q2.
	 */
	public static Double q2Subtraction(String number1, String number2) {
		try {
			double result = Double.valueOf(number1) - Double.valueOf(number2);
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Multiplication for Q3.
	 */
	public static Double q3Multiplication(String number1, String number2) {
		try {
			double result = Double.valueOf(number1) * Double.valueOf(number2);
			return result;
		} catch (Exception e) {
			return null;
		}
	}
}
