package web.service;

public class MathQuestionService {

    public static double q1Addition(String num1Str, String num2Str) {
        try {
            if (num1Str == null || num2Str == null || num1Str.isEmpty() || num2Str.isEmpty()) {
                return Double.NaN;
            }
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            return num1 + num2;
        } catch (Exception e) {
            return Double.NaN;
        }
    }

    public static double q2Subtraction(String num1Str, String num2Str) {
        try {
            if (num1Str == null || num2Str == null || num1Str.isEmpty() || num2Str.isEmpty()) {
                return Double.NaN;
            }
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            return num1 - num2;
        } catch (Exception e) {
            return Double.NaN;
        }
    }

    public static double q3Multiplication(String num1Str, String num2Str) {
        try {
            if (num1Str == null || num2Str == null || num1Str.isEmpty() || num2Str.isEmpty()) {
                return Double.NaN;
            }
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            return num1 * num2;
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}
