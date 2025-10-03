# Test Cases vs Test Scenarios

## What is a Test Scenario?

- A **Test Scenario** is a high-level description of what to test.  
- It tells **what functionality** or **feature** needs to be validated.  
- Scenarios are broad and do not include detailed steps.  

**Example (E-commerce website):**  
- Verify login functionality.  
- Verify checkout process.  
- Verify payment gateway integration.  

**Real-life example:**  
Imagine you want to test a car. A scenario would be:  
- "Check if the car starts."  
- "Check if brakes work."  

---

## What is a Test Case?

- A **Test Case** is a detailed set of steps to verify a specific scenario.  
- It includes test data, preconditions, test steps, expected results, and actual results.  
- Test cases are more formal and written in detail.  

**Example (E-commerce website - Login):**  

| Test Case ID | Test Scenario          | Preconditions | Test Steps                                                                 | Expected Result                  |
|--------------|------------------------|--------------|---------------------------------------------------------------------------|----------------------------------|
| TC-01        | Verify login works     | User has valid account | 1. Go to login page <br> 2. Enter valid username and password <br> 3. Click Login | User should be logged in         |
| TC-02        | Verify invalid login   | User exists   | 1. Go to login page <br> 2. Enter invalid password <br> 3. Click Login    | Error message should be displayed|
| TC-03        | Verify empty fields    | None          | 1. Go to login page <br> 2. Leave fields blank <br> 3. Click Login        | Error "Fields cannot be empty"   |

**Real-life example:**  
Scenario: "Check if the car starts."  
Test Cases:  
- Insert the correct key → Car should start.  
- Insert the wrong key → Car should not start.  
- Try without key → Car should not start.  

---

## Key Differences Between Test Scenarios and Test Cases

| Aspect            | Test Scenario                        | Test Case                                 |
|-------------------|--------------------------------------|-------------------------------------------|
| Definition        | High-level idea of what to test      | Detailed steps on how to test              |
| Detail Level      | Broad, less detailed                 | Very detailed and specific                 |
| Purpose           | Ensure all features are covered      | Ensure each scenario is tested correctly   |
| Example (Login)   | Verify login functionality           | Enter username/password, click login, check result |

---

## When to Use Scenarios vs Cases

- **Test Scenarios** → Useful when requirements are changing fast, or for quick coverage without documentation overload.  
- **Test Cases** → Useful when detailed testing is required, for audits, or for projects where steps must be repeatable.  

---

## Final Takeaway

- **Test Scenario = What to test** (bigger picture).  
- **Test Case = How to test** (detailed instructions).  
- Both are important in QA: scenarios ensure coverage, test cases ensure accuracy and repeatability.  
