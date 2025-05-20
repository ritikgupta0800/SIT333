package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/home/mahabib/java_lib/chromedriver-linux64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Ahsan");
		
		try {
            // Step 4: Locate and fill all required fields
            driver.findElement(By.id("firstname")).sendKeys("Ritik");
            driver.findElement(By.id("lastname")).sendKeys("Gupta");
            driver.findElement(By.id("email")).sendKeys("ritikgupta@example.com");
            driver.findElement(By.id("confirmEmail")).sendKeys("ritikgupta@example.com");
            driver.findElement(By.id("password")).sendKeys("12345"); // Intentionally weak
            driver.findElement(By.id("confirmPassword")).sendKeys("12345");

            // Step 5: Click the "Create Account" button
            WebElement createAccountButton = driver.findElement(By.xpath("//button[contains(text(),'Create account')]"));
            createAccountButton.click();

            sleep(3); // Wait for error message to appear


        } catch (NoSuchElementException | IOException e) {
            e.printStackTrace();
        }
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
