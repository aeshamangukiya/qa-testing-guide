# Types of Testing

Software testing can be classified into different types based on the purpose and scope of testing.  
Each type helps uncover specific issues and ensures the product meets both technical and business expectations.  

---

## 1. Manual Testing

**What it is:**  
Testing the software without automation tools. Testers manually execute test cases, explore the system, and validate results.

**Example:**  
- Checking if the login page works by entering username and password.  
- Exploring a shopping website like a real customer.  

**When used:**  
- For new features where requirements are changing.  
- For exploratory and usability testing.

---

## 2. Automation Testing

**What it is:**  
Using scripts and tools to run tests automatically, without human intervention.  

**Example:**  
- Running 1,000 login test cases overnight using Selenium.  
- Automating regression tests for every new build.  

**When used:**  
- For repetitive, time-consuming tests.  
- For regression, performance, and load testing.

---

## 3. Functional Testing

**What it is:**  
Testing the application against business requirements to ensure it does what it is supposed to do.  

**Example:**  
- Checking if the "Add to Cart" button actually adds an item.  
- Validating if discount rules are applied correctly.  

**Goal:** Verify business functionality.

---

## 4. Non-Functional Testing

**What it is:**  
Testing aspects other than functionality, like performance, usability, and security.  

**Example:**  
- How fast does the site load with 10,000 users?  
- Is the application easy for a new user to understand?  

**Goal:** Ensure the product works well in real-world conditions.

---

## 5. Smoke Testing

**What it is:**  
A quick check to ensure the basic features of the application are working.  

**Example:**  
- Can the application launch?  
- Is login working?  
- Can you open the main dashboard?  

**Goal:** Identify showstopper issues early.

---

## 6. Regression Testing

**What it is:**  
Testing existing functionality to ensure nothing is broken after new changes or bug fixes.  

**Example:**  
- After fixing the checkout issue, recheck the payment flow and product addition.  

**Goal:** Confirm old features still work after updates.

---

## 7. Sanity Testing

**What it is:**  
A focused check on a particular feature or bug fix to ensure it works as expected.  

**Example:**  
- A bug was fixed in the "Reset Password" feature. Test only that area instead of the whole application.  

**Goal:** Verify small, specific changes quickly.

---

## 8. Performance Testing

**What it is:**  
Testing the speed, stability, and scalability of the application under load.  

**Example:**  
- How does the website perform with 1,000 users?  
- Does response time stay under 2 seconds?  

**Goal:** Ensure the system performs well under expected conditions.

---

## 9. Security Testing

**What it is:**  
Testing the system’s ability to protect data and withstand attacks.  

**Example:**  
- Can an unauthorized user access private information?  
- Are passwords stored securely?  

**Goal:** Protect the application and its users from risks.

---

## 10. Usability Testing

**What it is:**  
Testing how easy and user-friendly the application is for real users.  

**Example:**  
- Can a first-time user complete checkout without confusion?  
- Is the navigation menu simple to use?  

**Goal:** Improve user satisfaction.

---

## Summary Table

| Type of Testing     | Purpose                                | Example                                |
|---------------------|----------------------------------------|----------------------------------------|
| Manual Testing      | Human execution, no automation         | Tester checks login manually            |
| Automation Testing  | Scripted, repeatable tests             | Selenium runs regression overnight      |
| Functional Testing  | Verify business requirements           | Add to Cart button works                |
| Non-Functional      | Performance, usability, security       | Site loads fast, data is secure         |
| Smoke Testing       | Quick basic check                      | App launches, login works               |
| Regression Testing  | Check old features after changes       | Payment still works after updates       |
| Sanity Testing      | Verify a specific fix/change           | Reset Password bug fix works            |
| Performance Testing | Test speed and scalability             | 1,000 users handled smoothly            |
| Security Testing    | Protect against vulnerabilities        | Unauthorized users blocked              |
| Usability Testing   | Ensure user-friendliness               | Easy navigation for new users           |

---

## Final Takeaway

- Manual vs Automation → How the test is executed.  
- Functional vs Non-Functional → What aspect is being tested.  
- Smoke, Regression, Sanity → Different scopes of testing.  
- Performance, Security, Usability → Focused quality attributes.  

Together, these testing types help deliver a product that is **functional, reliable, secure, fast, and user-friendly**.
