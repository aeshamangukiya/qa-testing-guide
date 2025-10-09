# Non-Functional Testing

## Introduction
**Non-Functional Testing (NFT)** is a type of software testing that focuses on **how well a system performs**, rather than **what it does**.  
It evaluates **performance, usability, reliability, security, and other quality attributes** of an application to ensure it meets expectations beyond functional requirements.

---

## 1. Difference Between Functional and Non-Functional Testing

| Aspect | Functional Testing | Non-Functional Testing |
|--------|------------------|-----------------------|
| Focus | What the system does | How the system performs |
| Example | Login functionality works correctly | Login response time under load |
| Goal | Verify feature behavior | Verify quality attributes like performance, security, usability |
| Test Type | Typically manual or automated | Often automated, simulation-based, or measurement-based |

---

## 2. Types of Non-Functional Testing

| Type | Description | Example |
|------|-------------|---------|
| **Performance Testing** | Checks system speed, responsiveness, and stability under load | Page load time, transaction speed |
| **Load Testing** | Measures performance under expected user load | 500 users accessing application simultaneously |
| **Stress Testing** | Determines system limits under extreme conditions | Spike testing with 2000 concurrent users |
| **Scalability Testing** | Verifies if system can scale with increasing workload | Adding more servers to handle more users |
| **Reliability / Stability Testing** | Checks if system runs continuously without failure | 24-hour uptime testing |
| **Security Testing** | Ensures protection against threats and vulnerabilities | Penetration testing, SQL injection check |
| **Usability Testing** | Evaluates user-friendliness and experience | Ease of navigation, accessibility |
| **Compatibility Testing** | Ensures application works across devices, browsers, OS | Chrome, Firefox, Safari, Windows, Android, iOS |
| **Maintainability Testing** | Checks ease of maintenance and updates | Code readability, modular design |
| **Compliance Testing** | Verifies adherence to standards and regulations | GDPR, HIPAA compliance |

---

## 3. Key Objectives of Non-Functional Testing
1. Ensure the application **performs well under expected conditions**.  
2. Verify **security, stability, and reliability** of the system.  
3. Validate **user experience and accessibility**.  
4. Ensure compliance with **industry standards and regulations**.  
5. Identify **potential bottlenecks** before production.  

---

## 4. Performance Testing Example
Imagine a **banking website**:

- **Scenario:** During salary day, thousands of users log in simultaneously.  
- **Performance Test Objective:** Ensure login and transaction processing time remains acceptable.  
- **Result:** Page load remains under 3 seconds, and the system can handle 2000 concurrent users without crashing.

---

## 5. Security Testing Example
- **Scenario:** An e-commerce app handles credit card payments.  
- **Objective:** Ensure that sensitive user data is protected.  
- **Test Cases:**  
  - SQL injection attempt  
  - Cross-site scripting (XSS)  
  - Access control validation  
- **Outcome:** Application should prevent unauthorized access and data breaches.

---

## 6. Tools for Non-Functional Testing
| Type | Tools |
|------|-------|
| **Performance & Load** | JMeter, LoadRunner, Gatling |
| **Security** | OWASP ZAP, Burp Suite, Nessus |
| **Usability** | Crazy Egg, Hotjar, UserTesting |
| **Compatibility** | BrowserStack, Sauce Labs |
| **Monitoring & Logging** | New Relic, Grafana, Prometheus |

---

## 7. Best Practices
1. Define **non-functional requirements** early in the project.  
2. Prioritize based on **business criticality**.  
3. Simulate **real-world conditions** during testing.  
4. Automate where possible for **repeatable and measurable results**.  
5. Monitor production systems for **continuous validation**.  

---

## 8. Real-Life Scenario
For a **mobile food delivery app**:

- Functional: Orders are placed correctly.  
- Non-functional:  
  - App should load within 2 seconds.  
  - Payment processing should handle 1000 transactions per minute.  
  - App should work on Android and iOS devices.  
  - Customer data must be encrypted and secure.

---

## Summary
Non-Functional Testing ensures that the system is **fast, reliable, secure, and user-friendly**.  
While functional testing verifies what the system does, non-functional testing ensures **how well it does it** under real-world conditions.

---

## Final Takeaway
Non-Functional Testing is **critical for user satisfaction, system reliability, and compliance**.  
A software product that meets functional requirements but fails in performance, security, or usability will fail to deliver real value to users.
