# JIRA Overview

## What is JIRA?

**JIRA** is a project management and issue tracking tool developed by **Atlassian**.  
It is widely used by software teams to **track bugs, manage tasks, plan sprints, and monitor project progress**.  

In QA and testing, JIRA is mainly used to **log defects**, **track their status**, and **communicate with the development team**.  

---

## Why QA Teams Use JIRA

- To **report, track, and manage defects** effectively  
- To **plan test cycles** and monitor progress  
- To **collaborate with developers and product owners**  
- To ensure every bug is properly tracked from creation to closure  

---

## Key Features of JIRA

1. **Issue Tracking** – Create and manage different types of issues (bug, story, task, epic).  
2. **Custom Workflows** – Define the steps a bug or task must go through.  
3. **Dashboards and Reports** – Track test progress, defect trends, and team productivity.  
4. **Integration** – Works with tools like Confluence, Bitbucket, Jenkins, and Zephyr.  
5. **Agile Boards** – Use Scrum or Kanban boards to visualize and manage work.  

---

## Common Issue Types in JIRA

| Issue Type | Description |
|-------------|-------------|
| **Bug** | A defect or error in the system that needs to be fixed. |
| **Story** | A new feature or functionality requested by users. |
| **Task** | A general activity or piece of work to be done. |
| **Epic** | A large body of work that can be divided into smaller stories. |
| **Sub-Task** | A smaller part of a larger task or story. |

---

## JIRA Workflow (Simplified)

Each issue (like a bug) passes through different stages known as the **workflow**.  
A common workflow for a defect in QA looks like this:

New → Assigned → In Progress → Fixed → Retest → Verified → Closed


This can vary based on the project or organization’s setup.

---

## Example: Creating a Bug in JIRA

**Scenario:** You find a bug during login testing.

**Steps:**
1. Go to **Create Issue**.  
2. Choose **Project** → “E-commerce Website”.  
3. Select **Issue Type** → Bug.  
4. Enter details such as:  
   - **Summary:** Login button not working on Chrome.  
   - **Description:** Steps to reproduce, expected result, actual result, screenshots.  
   - **Priority:** High.  
   - **Assignee:** Developer Name.  
5. Click **Create**.  
6. The bug will now appear in the backlog or board for tracking.

---

## Example of a JIRA Bug Report

| Field | Example Value |
|--------|----------------|
| **Project** | E-commerce Website |
| **Issue Type** | Bug |
| **Summary** | Login button not responding in Chrome browser |
| **Description** | Steps: 1. Go to login page 2. Enter valid credentials 3. Click Login → Button not working. |
| **Priority** | High |
| **Environment** | Windows 10, Chrome 120.0 |
| **Assignee** | John Doe |
| **Status** | New |

---

## JIRA for Agile Testing

- JIRA supports **Scrum** and **Kanban** methodologies.  
- QA teams can plan testing within **sprints**.  
- Use **Boards** to visualize progress (To Do → In Progress → Done).  
- Combine with **Zephyr** or **Xray** plugins to manage **test cases** directly inside JIRA.  

---

## JIRA Reports Useful for QA

| Report Name | Purpose |
|--------------|----------|
| **Burndown Chart** | Tracks remaining work in a sprint. |
| **Velocity Chart** | Measures how much work a team can complete in a sprint. |
| **Defect Density Report** | Shows the number of bugs per module or feature. |
| **Created vs Resolved Chart** | Displays how many issues were created and resolved over time. |

---

## Best Practices for QA Teams

1. Write clear and detailed bug reports (include steps, screenshots, logs).  
2. Use consistent naming for issues and test cycles.  
3. Keep issue status updated to reflect real progress.  
4. Link related issues (e.g., Bug linked to Story or Task).  
5. Review and close verified bugs regularly.  

---

## Final Takeaway

- **JIRA** helps QA teams **manage defects and testing efficiently**.  
- It improves **visibility**, **accountability**, and **communication** between testers and developers.  
- With plugins like **Zephyr** or **Xray**, JIRA becomes a complete test management solution.  
