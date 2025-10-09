# API Testing Sample & Newman Report

This folder contains examples of API testing using Postman along with a sample Newman report.

---

## 1. Postman Collection Example

```json
{
  "info": {
    "name": "Sample API Collection",
    "_postman_id": "12345-abcde-67890-fghij",
    "description": "Collection for demonstrating API testing",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "Get Users",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "https://jsonplaceholder.typicode.com/users",
          "protocol": "https",
          "host": ["jsonplaceholder", "typicode", "com"],
          "path": ["users"]
        }
      },
      "response": []
    },
    {
      "name": "Create User",
      "request": {
        "method": "POST",
        "header": [
          {
            "key": "Content-Type",
            "value": "application/json"
          }
        ],
        "body": {
          "mode": "raw",
          "raw": "{\n  \"name\": \"John Doe\",\n  \"email\": \"john.doe@example.com\"\n}"
        },
        "url": {
          "raw": "https://jsonplaceholder.typicode.com/users",
          "protocol": "https",
          "host": ["jsonplaceholder", "typicode", "com"],
          "path": ["users"]
        }
      },
      "response": []
    }
  ]
}
```

---

## 2. How to Use This Collection

1. Open **Postman**.
2. Click **Import** → Choose **Raw Text** → Paste the above JSON.
3. Click **Import** to add the collection.
4. Run the requests and observe the responses.

---

## 3. Sample Newman Report

```markdown
# Newman Test Run Report

**Collection:** Sample API Collection  
**Environment:** None  
**Total Requests:** 2  
**Passed:** 2  
**Failed:** 0  

## Request Details

### 1. Get Users
- **Method:** GET
- **URL:** https://jsonplaceholder.typicode.com/users
- **Status:** 200 OK
- **Response Time:** 120ms

### 2. Create User
- **Method:** POST
- **URL:** https://jsonplaceholder.typicode.com/users
- **Status:** 201 Created
- **Response Time:** 140ms
```

---

## 4. Notes

- This collection uses **JSONPlaceholder**, a free fake API for testing.
- You can modify the requests to test your own APIs.
- Use **Newman** to automate API testing and integrate with CI/CD pipelines.

---

## Summary

This example demonstrates **how to structure API tests in Postman** and run them via Newman.  
It covers **GET and POST requests**, including headers, body, and response validation.

---

## Final Takeaway

API testing ensures that your backend services handle requests and responses correctly.  
Postman and Newman allow testers to **create repeatable API tests, automate them, and integrate into CI/CD pipelines**.
