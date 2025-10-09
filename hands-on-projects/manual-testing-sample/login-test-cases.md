# Manual Testing Sample: Login Test Cases

## Project: Sample Web Application

### Module: Login Functionality

This document contains **manual test cases** for verifying the login functionality of a web application.  
It includes both **positive and negative scenarios** with expected results.

---

## 1. Test Case: Valid Login

- **Test Case ID:** MT-LOGIN-001  
- **Description:** Verify that a user can login with valid credentials.  
- **Preconditions:** User must be registered and account active.  
- **Test Steps:**
  1. Navigate to the login page.
  2. Enter a valid username.
  3. Enter the correct password.
  4. Click on the "Login" button.
- **Expected Result:** User should successfully login and be redirected to the dashboard.  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 2. Test Case: Invalid Password

- **Test Case ID:** MT-LOGIN-002  
- **Description:** Verify that the system shows an error when an incorrect password is entered.  
- **Preconditions:** User must be registered.  
- **Test Steps:**
  1. Navigate to the login page.
  2. Enter a valid username.
  3. Enter an incorrect password.
  4. Click on the "Login" button.
- **Expected Result:** Error message "Invalid username or password" should be displayed.  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 3. Test Case: Invalid Username

- **Test Case ID:** MT-LOGIN-003  
- **Description:** Verify that the system shows an error when an unregistered username is entered.  
- **Preconditions:** User account must not exist.  
- **Test Steps:**
  1. Navigate to the login page.
  2. Enter an invalid or unregistered username.
  3. Enter any password.
  4. Click on the "Login" button.
- **Expected Result:** Error message "Invalid username or password" should be displayed.  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 4. Test Case: Empty Fields

- **Test Case ID:** MT-LOGIN-004  
- **Description:** Verify the system validation when username and password fields are empty.  
- **Preconditions:** None  
- **Test Steps:**
  1. Navigate to the login page.
  2. Leave both username and password fields blank.
  3. Click on the "Login" button.
- **Expected Result:** Appropriate error messages should be displayed, such as "Username is required" and "Password is required".  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 5. Test Case: Password Masking

- **Test Case ID:** MT-LOGIN-005  
- **Description:** Verify that the password field hides entered characters for security.  
- **Preconditions:** None  
- **Test Steps:**
  1. Navigate to the login page.
  2. Enter a password in the password field.
- **Expected Result:** Entered password should be masked (e.g., shown as dots or asterisks).  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 6. Test Case: Remember Me Functionality

- **Test Case ID:** MT-LOGIN-006  
- **Description:** Verify that selecting "Remember Me" keeps the user logged in on the same browser.  
- **Preconditions:** User must have a valid account.  
- **Test Steps:**
  1. Navigate to the login page.
  2. Enter valid credentials.
  3. Check the "Remember Me" checkbox.
  4. Click "Login" and then close the browser.
  5. Reopen the browser and navigate to the application.
- **Expected Result:** User should remain logged in without re-entering credentials.  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## 7. Test Case: Forgot Password Link

- **Test Case ID:** MT-LOGIN-007  
- **Description:** Verify that clicking "Forgot Password" navigates the user to the password recovery page.  
- **Preconditions:** None  
- **Test Steps:**
  1. Navigate to the login page.
  2. Click on the "Forgot Password" link.
- **Expected Result:** User should be redirected to the password recovery page where they can reset their password.  
- **Actual Result:** To be filled during execution.  
- **Status:** Pass / Fail  

---

## Notes
- Each test case should be **executed in different browsers and devices** if cross-browser/device testing is required.  
- Defects found during execution should be logged in the **defect management tool (e.g., Jira)** with test case ID reference.  
- Test cases can be **expanded or modified** based on additional application requirements.

---

## Summary
This document provides **sample manual test cases** for login functionality.  
It ensures that the login module works correctly, handles invalid inputs, and maintains security standards for the application.
