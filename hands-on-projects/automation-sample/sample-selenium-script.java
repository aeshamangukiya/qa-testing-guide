# Automation Sample: Selenium Script

## Project: Sample Web Application

### Module: Login Automation Script

This document contains a **sample Selenium WebDriver script in Java** to automate the login functionality of a web application.

---

## 1. Prerequisites
- Java Development Kit (JDK) installed  
- Eclipse / IntelliJ IDE  
- Selenium WebDriver libraries added to the project  
- Browser driver (e.g., ChromeDriver) downloaded and configured  
- TestNG or JUnit framework (optional for assertions)

---

## 2. Sample Selenium Script

```java
// Sample Selenium Script: Login Functionality
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLoginTest {
    public static void main(String[] args) {

        // Set the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the application URL
            driver.get("https://example.com/login");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Locate username field and enter value
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("testuser");

            // Locate password field and enter value
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("password123");

            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            // Validate successful login (example: check dashboard text)
            WebElement dashboard = driver.findElement(By.id("dashboard"));
            if(dashboard.isDisplayed()) {
                System.out.println("Login Test Passed!");
            } else {
                System.out.println("Login Test Failed!");
            }

        } catch(Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
