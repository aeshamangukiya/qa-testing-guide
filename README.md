# QA Testing Guide
### *A One-Stop Resource for Building Your QA Skills and Portfolio*

---

## Overview

A comprehensive open-source guide for both beginner and experienced QA professionals. This repository covers the theory, tools, best practices, hands-on exercises, and real-world examples in **manual testing**, **automation testing**, **API testing**, **SQL**, and **non-functional testing**.

The guide is designed to help QA testers learn and demonstrate end-to-end testing capabilities, from creating test plans to implementing automation scripts and API testing. It also provides practical samples and reusable templates that you can showcase in your portfolio.

---

## Table of Contents

| Section | Description | Link |
|---------|-------------|------|
| Foundations | QA basics, SDLC, testing principles, levels, types | [Foundations](foundations/foundations.md) |
| QA vs QC vs Testing | Difference between QA, QC, and Testing | [QA vs QC vs Testing](foundations/qa-vs-qc-vs-testing.md) |
| Test Documentation | Test plans, test cases, bug lifecycle, RTM | [Test Plan Example](documentation/test-plan-example.md) |
| Tools & Setup | Jira, TestRail, Selenium, Cypress, API testing | [Automation Intro](tools/automation-intro.md) |
| Practical Examples | Web, Mobile, API, SQL, Performance & Security testing | [Web Testing Checklist](practical-examples/web-testing-checklist.md) |
| Agile & SDLC | QA in Agile, Shift-Left, CI/CD, Exploratory Testing | [QA in Agile](agile-sdlc/qa-in-agile.md) |
| Advanced Concepts | Test strategy, risk-based testing, non-functional testing, QA metrics | [Test Strategy Example](advanced/test-strategy-example.md) |
| Hands-on Projects | Manual, Automation, API, SQL sample projects | [Manual Project](hands-on-projects/manual-testing-sample/login-test-cases.md) |

---
## Introduction

The QA Testing Guide serves as a *learning hub* and *portfolio showcase* for anyone interested in building or improving their QA testing skills. Whether you're just starting out or already experienced, this repository will guide you through the key concepts of software testing, from the basics to advanced testing techniques.

This guide includes:
- **Theory**: SDLC, types of testing, test levels, testing strategies
- **Hands-on Examples**: Automation scripts, API testing examples, and SQL queries
- **Tools**: Popular QA tools like Selenium, Cypress, Postman, Jira, and TestRail
- **Templates**: Test case templates, bug lifecycle diagrams, RTM, test plans, etc.

## Modules
  
## Foundations

Covers QA basics and core concepts:

- **[Foundations](foundations/foundations.md)**: SDLC, QA principles, testing fundamentals.  
- **[QA vs QC vs Testing](foundations/qa-vs-qc-vs-testing.md)**: Clear distinction with examples.  
- **[Types of Testing](foundations/types-of-testing.md)**: Manual, Automation, Regression, Smoke, etc.  
- **[Testing Levels](foundations/testing-levels.md)**: Unit, Integration, System, Acceptance.

**Example:**  
Smoke testing on Gmail login to verify main functionality before deep testing.

---

## Test Documentation

Templates and best practices for test artifacts:

- **[Test Plan Example](documentation/test-plan-example.md)**: Objective, scope, environment, entry/exit criteria.  
- **[Test Cases & Scenarios](documentation/test-cases-scenarios.md)**: Step-by-step examples.  
- **[Bug Lifecycle](documentation/bug-lifecycle.md)**: From New → Closed with statuses.  
- **[RTM](documentation/rtm.md)**: Requirement mapping with test coverage.

---

## Tools & Setup

Learn and practice with popular QA tools:

- **[Jira Overview](tools/jira-overview.md)**: Issue tracking and workflow.  
- **[TestRail Example](tools/testrail-example.md)**: Test management.  
- **[Automation Intro](tools/automation-intro.md)**: Selenium, Cypress basics.  
- **[Selenium vs Cypress](tools/selenium-vs-cypress.md)**: Comparison with real examples.  
- **[API Testing](tools/api-testing.md)**: Postman & Rest Assured setup.

**Tip:** Include screenshots or GIFs for setup clarity.

---

## Practical Examples

Hands-on exercises and checklists:

- **[Web Testing Checklist](practical-examples/web-testing-checklist.md)**: Login, forms, links, responsive, security basics.  
- **[Mobile Testing Checklist](practical-examples/mobile-testing-checklist.md)**: Installation, performance, interruptions.  
- **[API Example](practical-examples/api-example.md)**: POST /login, success/failure scenarios, JSON validation.  
- **[SQL for Testers](practical-examples/sql-for-testers.md)**: Common queries with sample DB.  
- **[Performance & Security](practical-examples/performance-security.md)**: Load testing, basic security checks.

---

## Agile & SDLC

QA in Agile and modern development:

- **[QA in Agile](agile-sdlc/qa-in-agile.md)**: Scrum ceremonies & QA role.  
- **[Shift-Left Testing](agile-sdlc/shift-left.md)**: Early defect detection.  
- **[CI/CD Testing](agile-sdlc/ci-cd-testing.md)**: GitHub Actions & automation integration.  
- **[Exploratory Testing](agile-sdlc/exploratory-testing.md)**: Charter templates and approach.

---

## Advanced Concepts

Take QA knowledge to the next level:

- **[Test Strategy Example](advanced/test-strategy-example.md)**: Sample e-commerce strategy.  
- **[Risk-Based Testing](advanced/risk-based-testing.md)**: Prioritize testing by likelihood & impact.  
- **[Non-Functional Testing](advanced/non-functional.md)**: Load, stress, security basics.  
- **[QA Metrics](advanced/qa-metrics.md)**: Defect Density, Test Coverage, Pass/Fail %, MTTR.

---

## Hands-on Projects

Portfolio-strengthening projects:

- **Manual Testing:** Gmail login test cases & bug reports.  
- **Automation:** Selenium script on demo site (opensource-demo.orangehrmlive.com).  
- **API Testing:** Postman collection with Newman report.  
- **SQL Testing:** Queries against sample DB (Sakila or Northwind).


---

## Project Structure
<details> <summary>Click to expand</summary>

```text
📁 qa-testing-guide/
│
├── 📄 README.md
├── 📁 foundations/
│   ├── 📄 foundations.md
│   ├── 📄 qa-vs-qc-vs-testing.md
│   ├── 📄 types-of-testing.md
│   └── 📄 testing-levels.md
│
├── 📁 documentation/
│   ├── 📄 test-plan-example.md
│   ├── 📄 test-cases-scenarios.md
│   ├── 📄 bug-lifecycle.md
│   └── 📄 rtm.md
│
├── 📁 tools/
│   ├── 📄 jira-overview.md
│   ├── 📄 testrail-example.md
│   ├── 📄 automation-intro.md
│   ├── 📄 selenium-vs-cypress.md
│   └── 📄 api-testing.md
│
├── 📁 practical-examples/
│   ├── 📄 web-testing-checklist.md
│   ├── 📄 mobile-testing-checklist.md
│   ├── 📄 api-example.md
│   ├── 📄 sql-for-testers.md
│   └── 📄 performance-security.md
│
├── 📁 agile-sdlc/
│   ├── 📄 qa-in-agile.md
│   ├── 📄 shift-left.md
│   ├── 📄 ci-cd-testing.md
│   └── 📄 exploratory-testing.md
│
├── 📁 advanced/
│   ├── 📄 test-strategy-example.md
│   ├── 📄 risk-based-testing.md
│   ├── 📄 non-functional.md
│   └── 📄 qa-metrics.md
│
└── 📁 hands-on-projects/
    ├── 📁 manual-testing-sample/
    │   └── 📄 login-test-cases.md
    ├── 📁 automation-sample/
    │   └── 📄 sample-selenium-script.java
    └── 📁 api-testing-sample/
        ├── 📄 postman-collection.json
        └── 📄 newman-report.md
```
</details>

---

## Key Features

- **QA Fundamentals**: SDLC, principles, types & levels of testing
- **Test Documentation**: Test Plan, Test Cases, Bug Lifecycle, RTM
- **Tools & Setup**: Jira, TestRail, Selenium, Cypress, Postman, SQL
- **Practical Checklists**: Web, Mobile, API
- **Agile & SDLC Concepts**: Shift-left, CI/CD, Exploratory Testing
- **Advanced Topics**: Test Strategy, Risk-Based Testing, Non-functional Testing, QA Metrics
- **Hands-on Projects**: Manual, Automation, API, SQL examples
  
---

## How to Use

1. **Clone the Repository**
   ```bash
   git clone https://github.com/aeshamangukiya/qa-testing-guide.git
   ```

2. **Explore by Modules**
   - Read fundamentals for theory
   - Check documentation folder for examples
   - Run practical examples locally (web, mobile, API)

3. **Hands-on Projects**
   - Manual Testing: Review login-test-cases.md
   - Automation: Run Selenium scripts
   - API: Import Postman collection, run Newman report
   - SQL: Run queries from sql-for-testers.md

---

## Learning & Portfolio Value

- **Knowledge:** Covers manual testing, automation, API testing, SQL, Agile, metrics, and advanced QA topics.
- **Portfolio:** Provides ready-to-show examples for interviews.
- **Practical:** Includes step-by-step exercises, Postman collection, Selenium scripts, and SQL queries.

---

## Hands-on Projects

| **Type**          | **Sample**                       |
|-------------------|----------------------------------|
| **Manual Testing**| Login Test Cases                 |
| **Automation**    | Selenium Script                  |
| **API Testing**   | Postman Collection + Newman Report |
| **SQL**           | Queries on Sample DB             |

---

## Summary

This repository is designed to be:

- A **complete learning hub** for QA concepts & tools.  
- A **hands-on practice repository** for manual, automation, API, and SQL testing.  
- A **professional portfolio** for recruiters and interviews.  

Grow it over time by adding **new tools, projects, and real-life examples**.

---

## Contribution

- Contributions are welcome!  
- Please fork the repo and submit **pull requests**.  
- Follow **naming conventions** and add **descriptive markdown** for new files.

---


## Contact & Credits
- Maintained by: Aesha Mangukiya
- Email: aeshamangukiya1@gmail.com
- GitHub: [GitHub: aeshamangukiya](https://github.com/aeshamangukiya)
  
---

*Enjoy learning QA and building your portfolio!*
