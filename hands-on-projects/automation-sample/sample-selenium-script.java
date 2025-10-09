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
```

---

## 3. Script Explanation

- **ChromeDriver setup**: Required for Selenium to control the Chrome browser.

- **WebDriver initialization**: Launches the browser instance.

- **Locate elements**: Using `By.id`, `By.name`, or other locators to interact with input fields and buttons.

- **Perform actions**: `sendKeys()` to type text, `click()` to press buttons.

- **Validation**: Simple check to verify if the login succeeded by confirming the presence of the dashboard element.

- **Exception handling**: Captures errors during script execution.

- **Cleanup**: `driver.quit()` ensures the browser is closed after the test.

---

## 4. Best Practices for Automation

- Use **explicit waits** (`WebDriverWait`) instead of hard-coded `Thread.sleep()`.
  
- Store test data separately (Excel, JSON, or database) for **data-driven testing**.

- Use **Page Object Model (POM)** for maintainable and scalable code.

- Integrate with **TestNG/JUnit** for assertions and reporting.

- Keep driver paths and configurations **externalized**.

- Log meaningful messages for better **debugging** and **reporting**.

---

## 5. Real-Life Use Case

- Automate login for multiple users using a **data-driven approach**.
  
- Validate error messages for invalid credentials.

- Run as part of the **CI/CD pipeline** to ensure login functionality is intact with every build.

---

## Summary

This Selenium sample script demonstrates basic automation of login functionality.  
It covers browser initialization, element interaction, login validation, exception handling, and cleanup.

By following this approach and best practices, QA teams can automate repetitive functional tests, improve testing efficiency, and ensure consistent application quality.

