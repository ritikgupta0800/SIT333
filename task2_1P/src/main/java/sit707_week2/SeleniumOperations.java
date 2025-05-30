package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SeleniumOperations {

    public static void officeworks_registration_page() {
    	System.setProperty("webdriver.chrome.driver", 
                "/Users/ritikgupta/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.officeworks.com.au/app/identity/create-account");

        try {
            driver.findElement(By.id("firstname")).sendKeys("Ritik");
            driver.findElement(By.id("lastname")).sendKeys("Gupta");
            driver.findElement(By.id("emailAddress")).sendKeys("ritikgupta@example.com");
            driver.findElement(By.id("mobileNumber")).sendKeys("0412345678");
            driver.findElement(By.id("createPassword")).sendKeys("123"); // weak password
            driver.findElement(By.id("confirmPassword")).sendKeys("123");

            WebElement createAccountBtn = driver.findElement(By.xpath("//button[contains(text(),'Create account')]"));
            createAccountBtn.click();

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("officeworks_registration.png");
            org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);

        } catch (Exception e) {
            System.out.println("Error during Officeworks form automation: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

    public static void alternative_registration_page() {
    	System.setProperty("webdriver.chrome.driver", 
                "/Users/ritikgupta/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://signup.ebay.com.au/pa/crte");

        try {
            driver.findElement(By.id("firstname")).sendKeys("Ritik");
            driver.findElement(By.id("lastname")).sendKeys("Gupta");
            driver.findElement(By.id("Email")).sendKeys("ritikgupta@example.com");
            driver.findElement(By.id("password")).sendKeys("123"); // weak password

            WebElement createAccountBtn = driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"));
            createAccountBtn.click();

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("ebay_registration.png");
            org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);

        } catch (Exception e) {
            System.out.println("Error during eBay form automation: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
