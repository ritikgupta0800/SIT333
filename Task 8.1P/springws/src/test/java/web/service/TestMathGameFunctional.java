package web.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TestMathGameFunctional {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/gagancheema/Documents/T12025/SIT333/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void login(String username, String password, String dob) {
        driver.get("http://localhost:8080/");
        driver.findElement(By.linkText("Login")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("dob")).sendKeys(dob);
        driver.findElement(By.id("loginBtn")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("number1")));
    }

    private void solveMathQuestion(String num1, String num2, String result) {
        driver.findElement(By.id("number1")).clear();
        driver.findElement(By.id("number2")).clear();
        driver.findElement(By.id("result")).clear();

        driver.findElement(By.id("number1")).sendKeys(num1);
        driver.findElement(By.id("number2")).sendKeys(num2);
        driver.findElement(By.id("result")).sendKeys(result);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    private boolean pageContainsText(String text) {
        return driver.getPageSource().contains(text);
    }

    // 1. Addition Correct Answer
    @Test
    public void testAdditionCorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("10", "5", "15");
        Assert.assertTrue(pageContainsText("Correct answer!"));
    }

    // 2. Addition Incorrect Answer
    @Test
    public void testAdditionIncorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("10", "5", "16");
        Assert.assertTrue(pageContainsText("Wrong answer."));
    }

    // 3. Addition Invalid Input
    @Test
    public void testAdditionInvalidInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("abc", "xyz", "result");
        Assert.assertTrue(pageContainsText("Invalid input."));
    }

    // 4. Addition Empty Input
    @Test
    public void testAdditionEmptyInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("", "", "");
        Assert.assertTrue(pageContainsText("Fields cannot be empty."));
    }

    // 5. Subtraction Correct Answer
    @Test
    public void testSubtractionCorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("20", "8", "12");
        Assert.assertTrue(pageContainsText("Correct answer!"));
    }

    // 6. Subtraction Incorrect Answer
    @Test
    public void testSubtractionIncorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("20", "8", "13");
        Assert.assertTrue(pageContainsText("Wrong answer."));
    }

    // 7. Subtraction Invalid Input
    @Test
    public void testSubtractionInvalidInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("twenty", "eight", "twelve");
        Assert.assertTrue(pageContainsText("Invalid input."));
    }

    // 8. Subtraction Empty Input
    @Test
    public void testSubtractionEmptyInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("", "", "");
        Assert.assertTrue(pageContainsText("Fields cannot be empty."));
    }

    // 9. Multiplication Correct Answer
    @Test
    public void testMultiplicationCorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("3", "4", "12");
        Assert.assertTrue(pageContainsText("Correct answer!"));
    }

    // 10. Multiplication Incorrect Answer
    @Test
    public void testMultiplicationIncorrectAnswer() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("3", "4", "14");
        Assert.assertTrue(pageContainsText("Wrong answer."));
    }

    // 11. Multiplication Invalid Input
    @Test
    public void testMultiplicationInvalidInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("three", "four", "twelve");
        Assert.assertTrue(pageContainsText("Invalid input."));
    }

    // 12. Multiplication Empty Input
    @Test
    public void testMultiplicationEmptyInput() {
        login("gagan", "cheema22", "2000-01-01");
        solveMathQuestion("", "", "");
        Assert.assertTrue(pageContainsText("Fields cannot be empty."));
    }
}


