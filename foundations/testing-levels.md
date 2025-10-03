# Testing Levels

Software testing is done in different levels, from checking small pieces of code to testing the entire system as a whole.  
Each level has a different purpose and involves different people.  

---

## 1. Unit Testing

**What it is:**  
Testing the smallest part of the application (like a function, class, or method) to make sure it works correctly.  
Usually done by developers before the code is integrated.

**Real-life example:**  
Checking if a light bulb works before putting it into a lamp.

**Software example:**  
- Testing a function that calculates discounts.  
- Verifying that clicking the “Add to Cart” button adds 1 item.

**Goal:** Ensure individual components work as expected.

---

## 2. Integration Testing

**What it is:**  
Testing the interaction between different modules or systems to make sure they work together smoothly.  

**Real-life example:**  
Testing if the engine and gearbox in a car work correctly together, not just individually.  

**Software example:**  
- After login is complete, does the system correctly fetch the user profile?  
- Does the shopping cart correctly update the database?  

**Goal:** Ensure modules communicate properly.

---

## 3. System Testing

**What it is:**  
Testing the entire application as a whole, end-to-end, against the requirements.  
Performed by the QA team (not developers).  

**Real-life example:**  
Driving a complete car to see if everything (engine, brakes, AC, lights) works together.  

**Software example:**  
- Test a user flow: Register → Login → Add product → Checkout → Payment → Confirmation.  

**Goal:** Validate that the whole system works correctly.

---

## 4. User Acceptance Testing (UAT)

**What it is:**  
Testing performed by the client or end-users to ensure the system meets business needs.  
It is usually the final step before release.  

**Real-life example:**  
Customer takes the car for a test drive before buying it.  

**Software example:**  
- A retail client checks if their e-commerce site allows customers to easily search, order, and pay.  
- End users validate if the product solves their real-world problems.  

**Goal:** Verify that the product meets user expectations.

---

## Comparison Table

| Testing Level       | Done By             | Scope                | Real-Life Example          |
|---------------------|---------------------|----------------------|----------------------------|
| Unit Testing        | Developers          | Smallest components  | Check if a bulb works      |
| Integration Testing | Developers + QA     | Combined modules     | Check if bulb works in lamp|
| System Testing      | QA Team             | Whole application    | Test the complete car      |
| UAT                 | End Users / Clients | Business needs       | Customer test drives the car |

---

## Final Takeaway

- Unit Testing → Smallest piece works?  
- Integration Testing → Pieces work together?  
- System Testing → Full product works as expected?  
- UAT → Does the user accept it?  

Each level builds on the previous one, ensuring quality from small units to full user satisfaction.  
