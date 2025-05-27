package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginServiceTest {

    private static final String DRIVER_PATH = "/Users/ritikgupta/Downloads/chromedriver-mac-arm64/chromedriver";
    private static final String HTML_PAGE_URL = "file:///Users/ritikgupta/Desktop/Tasks/SIT333/java_projects/7.1P-resources/pages/login.html";

    private WebDriver launchDriver() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get(HTML_PAGE_URL);
        pause(2);
        return driver;
    }

    private void fillLoginForm(WebDriver driver, String username, String password, String dob) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("dob")).sendKeys(dob);
        driver.findElement(By.cssSelector("[type=submit]")).click();
        pause(2);
    }

    private void pause(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidLogin() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "ritik", "ritik_pass", "2000-01-01");
        Assert.assertEquals("success", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidUsername() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "wrong_user", "ritik_pass", "2000-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidPassword() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "ritik", "wrong_pass", "2000-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testInvalidDOB() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "ritik", "ritik_pass", "1990-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testAllFieldsEmpty() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "", "", "");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testMissingPassword() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "ritik", "", "2000-01-01");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }

    @Test
    public void testMissingDOB() {
        WebDriver driver = launchDriver();
        fillLoginForm(driver, "ritik", "ritik_pass", "");
        Assert.assertEquals("fail", driver.getTitle());
        driver.quit();
    }
}
