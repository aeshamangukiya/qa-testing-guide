# Bug Life Cycle

A **bug life cycle** (also called **defect life cycle**) is the process a bug goes through from the moment it is discovered until it is closed.  
Each stage shows the current status of the bug and helps teams track and manage it effectively.  

---

## Typical Stages in Bug Life Cycle

### 1. New
- When a tester finds a bug, it is reported and given the status **New**.  
- The bug has not yet been reviewed by the development team.

**Example:** Tester finds that the "Login" button does not work.

---

### 2. Assigned
- The bug is reviewed by the test lead or project manager.  
- It is **assigned** to a developer for fixing.

**Example:** The "Login button issue" is assigned to Developer A.

---

### 3. Open
- The developer starts working on the bug.  
- The status changes to **Open**.

**Example:** Developer A begins checking the login code.

---

### 4. Fixed
- Once the developer makes code changes and believes the bug is resolved, the status changes to **Fixed**.  
- The bug is now ready for retesting.

**Example:** Developer A updates the login code and marks it as Fixed.

---

### 5. Retest
- The QA tester retests the application to check if the bug is really fixed.  
- If the fix works, the bug is considered for closure.  
- If not, the bug is **reopened**.

**Example:** Tester tries logging in again after the fix.

---

### 6. Verified
- If the tester confirms the bug no longer exists, the status becomes **Verified**.  

**Example:** Login button now works correctly, so the tester verifies the fix.

---

### 7. Closed
- Once the bug is verified, it is marked as **Closed**.  
- No further action is required.

**Example:** The login button issue is closed because it works as expected.

---

### 8. Reopened (Optional Stage)
- If the bug reappears after being fixed, it is **reopened**.  
- It then goes through the cycle again.

**Example:** After another release, the login button stops working again. The bug is reopened.

---

## Additional Statuses (Used in Some Projects)

- **Deferred/Postponed:** Bug is valid but will be fixed in a future release.  
- **Duplicate:** Bug is already reported.  
- **Rejected:** Bug is not valid or not considered an issue.  
- **Not a Bug:** Behavior is correct and as per requirements.  

---

# Bug Life Cycle Flow (Simple View)
New → Assigned → Open → Fixed → Retest → Verified → Closed

---
## Real-Life Example of Bug Life Cycle

1. Tester finds "Checkout button not working" → Status: New  
2. Lead assigns it to Developer B → Status: Assigned  
3. Developer B starts working → Status: Open  
4. Code fixed → Status: Fixed  
5. Tester retests checkout → Status: Retest  
6. Tester confirms it works → Status: Verified  
7. Bug closed → Status: Closed  

---

## Final Takeaway

- The bug life cycle helps **track the progress** of each bug.  
- It ensures bugs are **properly fixed and verified** before closure.  
- Not all projects use the exact same stages, but the overall flow remains similar.  

