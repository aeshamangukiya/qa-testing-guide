# Risk-Based Testing (RBT)

## Introduction
**Risk-Based Testing (RBT)** is a testing approach where testing activities are prioritized based on the **risk of failure** and the **impact of potential defects**.  
It helps QA teams focus on the most critical areas first, ensuring efficient use of time and resources.

---

## 1. What is Risk in Testing?
In RBT, a **risk** is any **uncertain event or condition** that could negatively affect the software.  
Risks are typically measured based on two factors:
- **Likelihood (Probability):** How likely is the defect to occur?  
- **Impact (Severity):** How severe would the effect be if the defect occurs?

**Example:**  
- A bug in the **payment module** has high impact even if rare.  
- A typo in the FAQ section has low impact even if it occurs often.

---

## 2. Goals of Risk-Based Testing
1. Identify and focus on **high-risk areas** first.  
2. Optimize the use of **testing resources and effort**.  
3. Reduce the likelihood of **critical failures** in production.  
4. Provide a **rational basis for test prioritization**.  

---

## 3. Steps in Risk-Based Testing

### Step 1: Risk Identification
Identify potential risks that may affect the system.  
- Functional risks: Payment, login, data processing.  
- Non-functional risks: Performance, security, usability.  

**Example:**  
- Incorrect tax calculation in billing module.  
- Slow response time on high-traffic pages.  

---

### Step 2: Risk Analysis
Assess each risk based on **probability** and **impact**.  
- **High Probability + High Impact:** Critical risk (needs immediate attention).  
- **High Probability + Low Impact:** Medium risk (needs regular checks).  
- **Low Probability + High Impact:** Medium/High risk (needs testing focus).  
- **Low Probability + Low Impact:** Low risk (can be deferred or sampled).  

---

### Step 3: Risk Prioritization
Prioritize risks using a **risk matrix** or scoring system.

| Likelihood | Impact | Priority |
|------------|--------|---------|
| High | High | P1 (Critical) |
| High | Medium | P2 (High) |
| Medium | High | P2 (High) |
| Medium | Medium | P3 (Medium) |
| Low | Low | P4 (Low) |

Focus testing efforts on **P1 and P2 risks** first.

---

### Step 4: Test Planning & Design
Design test cases based on **risk priority**:  
- Allocate more time and resources to high-risk areas.  
- Use a combination of **manual and automated tests**.  
- Include **edge cases and negative scenarios** for critical modules.

---

### Step 5: Test Execution & Monitoring
- Execute test cases according to risk priority.  
- Log defects and continuously **update risk assessments**.  
- Adjust testing focus if new risks are identified during the process.

---

### Step 6: Risk Mitigation & Reporting
- High-risk defects must be fixed immediately.  
- Provide a **risk report** to stakeholders summarizing:  
  - Tested modules  
  - Untested low-risk areas  
  - Defects found and their severity  

---

## 4. Advantages of Risk-Based Testing
- Focuses **testing effort on critical areas**.  
- Helps **manage limited resources efficiently**.  
- Reduces the chance of **high-impact failures** in production.  
- Provides **quantitative justification** for testing priorities.  
- Enables **better decision-making** for release readiness.  

---

## 5. Disadvantages / Challenges
- Requires **accurate risk assessment** — subjective errors may mislead priorities.  
- May **overlook low-risk defects** that could accumulate.  
- Needs **experienced testers** to identify and evaluate risks.  
- Continuous **re-evaluation of risks** is necessary as software changes.  

---

## 6. Real-Life Example
Imagine testing a **banking mobile app**.

- **High Risk:** Transaction and fund transfer modules (critical if failing).  
- **Medium Risk:** User profile and preferences (important but less critical).  
- **Low Risk:** FAQ and help section (minor impact).  

**Testing Focus:**  
- Critical modules undergo thorough functional, security, and performance testing.  
- Medium-risk modules get moderate coverage.  
- Low-risk areas get minimal exploratory testing or sampling.

---

## 7. Tools and Techniques
- **Risk Matrices:** Visual representation of risk probability vs. impact.  
- **Defect Prioritization Tools:** Jira, TestRail (to link defects with risk levels).  
- **Coverage Analysis:** Ensures high-risk modules have thorough test coverage.  
- **Automation:** Focuses on high-risk areas for regression testing.  

---

## 8. Best Practices
1. Involve **business analysts and stakeholders** in risk identification.  
2. Use a **quantitative scoring system** for objective prioritization.  
3. Continuously **update risk assessments** during development and testing.  
4. Combine **manual exploratory testing** with automation for critical modules.  
5. Document both **tested and untested risks** to inform release decisions.  

---

## Summary
Risk-Based Testing helps QA teams **focus on what matters most**, ensuring that critical functionality is validated thoroughly while optimizing effort and resources.

---

## Final Takeaway
RBT is about **prioritization over coverage** — testing strategically rather than exhaustively.  
By identifying, analyzing, and focusing on high-risk areas first, teams can **deliver safer, higher-quality software faster**.
