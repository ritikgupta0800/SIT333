package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "224234399";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Ritik Gupta";
        Assert.assertNotNull("Student name is null", studentName);
    }

    // Weather Advice Tests
    @Test
    public void testCancelDueToWindSpeed() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 0.0));
    }

    @Test
    public void testCancelDueToPrecipitation() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.5));
    }

    @Test
    public void testCancelDueToBothModerate() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 4.5));
    }

    @Test
    public void testWarnDueToWind() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
    }

    @Test
    public void testWarnDueToRain() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(20.0, 5.0));
    }

    @Test
    public void testAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 1.0));
    }

    // Math Utils - isEven
    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(5));
    }

    // Math Utils - isPrime
    @Test
    public void testPrime2() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
    }

    @Test
    public void testPrime3() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
    }

    @Test
    public void testNonPrime4() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }

    @Test
    public void testPrime7() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
    }

    @Test
    public void testNonPrime10() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(10));
    }

    @Test
    public void testNonPrime1() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(1));
    }

    // Reflection test to cover private constructor
    @Test
    public void testPrivateConstructorCoverage() throws Exception {
        Constructor<WeatherAndMathUtils> constructor = WeatherAndMathUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
