# Requirement Traceability Matrix (RTM)

## What is RTM?

A **Requirement Traceability Matrix (RTM)** is a document that maps and traces **requirements** with their corresponding **test cases**.  
It ensures that all requirements are covered by tests and nothing is missed.  

---

## Why is RTM Important?

- Ensures **100% test coverage** of requirements.  
- Helps track if all requirements are tested.  
- Makes it easier to identify missing or extra test cases.  
- Useful in impact analysis when requirements change.  
- Builds confidence that the final product meets business needs.  

---

## Structure of RTM

An RTM is usually created in a **table format**. It includes:

- Requirement ID  
- Requirement Description  
- Test Case ID(s) mapped to that requirement  
- Test Execution Status (Pass/Fail)  
- Defect ID (if any bug is logged)  

---

## Example RTM Table

| Requirement ID | Requirement Description         | Test Case ID(s)       | Test Status | Defect ID (if any) |
|----------------|---------------------------------|-----------------------|-------------|--------------------|
| RQ-01          | User should be able to register | TC-01, TC-02          | Pass        | -                  |
| RQ-02          | User login with valid details   | TC-03, TC-04          | Fail        | BUG-101            |
| RQ-03          | User resets password            | TC-05                 | Pass        | -                  |
| RQ-04          | Checkout with multiple products | TC-06, TC-07, TC-08   | Pass        | -                  |
| RQ-05          | Payment gateway integration     | TC-09, TC-10          | Fail        | BUG-102            |

---

## Real-Life Example (Non-Software)

Imagine a **shopping list** is your requirement.  
- Requirement: Buy Milk  
- Test Case: Check if Milk is in the cart.  
- Result: If Milk is there → Pass. If not → Fail.  

This way, RTM ensures nothing from your list (requirement) is left untested.  

---

## Benefits of RTM

1. Ensures **no requirement is missed** during testing.  
2. Provides a clear **mapping between requirements and tests**.  
3. Useful for **audits and client reviews**.  
4. Helps in **impact analysis** when requirements change.  
5. Ensures product is tested **as per business expectations**.  

---

## Final Takeaway

- RTM is a bridge between **requirements** and **test cases**.  
- It ensures **complete coverage** and makes tracking easier.  
- Without RTM, there is a risk of missing requirements in testing.  
