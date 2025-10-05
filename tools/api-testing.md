# API Testing — Complete Guide

## Introduction

API testing is one of the most important parts of software testing.  
It focuses on verifying whether the APIs (Application Programming Interfaces) of an application work correctly and return the expected results.

In simple terms, **API testing ensures that the communication between two software systems works as intended**.

---

## What is an API?

An **API (Application Programming Interface)** is a set of rules that allows one software application to communicate with another.  
It defines how requests and responses should be structured.

### Real-Life Example

Imagine you are using a food delivery app like Swiggy or Zomato.  
When you click on “View Restaurants”, the app sends a request to a backend API like:

```
GET /restaurants
```

The API responds with a list of restaurants available near your location.  
This communication between your app (frontend) and the server (backend) happens through APIs.

---

## What is API Testing?

**API Testing** means verifying that the API works correctly, meets the business requirements, and returns valid data.

Instead of testing the user interface, testers send requests directly to the API and check the responses.

API testing usually involves:
- Sending different types of requests (GET, POST, PUT, DELETE)
- Validating the response status code
- Checking the response body and headers
- Verifying data correctness and error handling

---

## Why API Testing is Important

1. Detect issues early – You can find bugs before the UI is developed.  
2. Faster than UI testing – APIs run quickly and require fewer resources.  
3. Better coverage – You can test all business logic and edge cases easily.  
4. Automation-friendly – APIs are easy to automate using tools like Postman or RestAssured.  
5. Stable tests – UI changes do not affect API tests.

---

## Types of API Testing

| Type | Description |
|------|--------------|
| Functional Testing | Verify if the API works as expected and returns correct data. |
| Load Testing | Check how the API performs under high traffic or load. |
| Security Testing | Ensure data protection, authorization, and authentication. |
| Validation Testing | Confirm that API meets the expected business rules. |
| Integration Testing | Verify that multiple APIs work together properly. |
| Negative Testing | Send invalid data and check if API handles errors gracefully. |

---

## Common HTTP Methods in API Testing

| Method | Description | Example |
|--------|--------------|----------|
| GET | Retrieve data from the server | Get user details |
| POST | Send data to the server to create a new record | Create a new user |
| PUT | Update existing data on the server | Update user details |
| DELETE | Remove data from the server | Delete user account |
| PATCH | Partially update data | Update only email address |

---

## API Testing Workflow

1. Understand API Requirements  
2. Setup the Environment  
3. Send API Requests  
4. Validate Responses  
5. Handle Errors  
6. Automate Tests  

---

## Common Status Codes

| Code | Meaning | Example |
|------|----------|----------|
| 200 OK | Request was successful | Fetch user details |
| 201 Created | Resource successfully created | New user registration |
| 400 Bad Request | Invalid input or request format | Missing parameter |
| 401 Unauthorized | Authentication failed | Invalid token |
| 403 Forbidden | Access denied | User not allowed to access resource |
| 404 Not Found | Resource not found | Wrong endpoint |
| 500 Internal Server Error | Server issue | API code crash |

---

## Real-Life Example of API Testing

**Request:**

```
POST /api/login
{
  "username": "testuser",
  "password": "password123"
}
```

**Response (Success):**

```
{
  "status": "success",
  "message": "Login successful",
  "token": "abc123xyz"
}
```

**Response (Failure):**

```
{
  "status": "error",
  "message": "Invalid username or password"
}
```

### Explanation

In this test, we validate:
- The status code (200 for success, 401 for invalid credentials)
- The message text
- The presence of a token in the success response

---

## Tools for API Testing

| Tool | Description |
|------|--------------|
| Postman | Most popular tool for manual and automated API testing. |
| RestAssured | Java-based library for API automation. |
| SoapUI | Used for testing SOAP and REST APIs. |
| JMeter | Can be used for API load testing. |
| Newman | Command-line runner for Postman collections. |
| Playwright / Cypress | Can perform API calls during test execution. |

---

## Example using Postman

1. Open Postman and create a new request.  
2. Choose method `POST` and enter the API URL:  

```
https://example.com/api/login
```
3. In the **Body** tab, select **raw → JSON** and enter:

```json
{
  "username": "testuser",
  "password": "password123"
}
```
4. Click **Send** and check:
- Status code = 200  
- Response time  
- Token field exists

---

## Example using RestAssured (Java)

```java
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LoginAPITest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://example.com";

        given()
            .header("Content-Type", "application/json")
            .body("{\"username\":\"testuser\", \"password\":\"password123\"}")
        .when()
            .post("/api/login")
        .then()
            .statusCode(200)
            .body("message", equalTo("Login successful"));
    }
}
```

---

## Best Practices for API Testing

1. Validate both status codes and response body.  
2. Always test for positive and negative scenarios.  
3. Include authorization and security checks.  
4. Use environment variables for different test environments.  
5. Keep test data externalized.  
6. Automate repetitive tests.  
7. Log and report all API responses for debugging.  

---

## Real-World Scenarios

1. E-commerce Application – Test product listing API, cart API, and order creation API.  
2. Banking Application – Validate APIs for balance inquiry, fund transfer, and transaction history.  
3. Social Media Platform – Test APIs for creating posts, comments, likes, and user profiles.  
4. Weather Application – Test APIs for fetching temperature and forecast data.

---

## Advantages of API Testing

- Faster and more reliable than UI testing  
- Detects issues early in development  
- Easily automated and integrated with CI/CD pipelines  
- Reduces regression testing effort  
- Improves software stability and performance  

---

## Conclusion

API testing plays a vital role in ensuring that applications communicate correctly and reliably.  
It helps verify that the backend logic is strong before the user interface even exists.

A good QA engineer should understand how APIs work, how to test them using tools like Postman or RestAssured, and how to integrate those tests into the overall testing strategy.

By mastering API testing, you can save time, find bugs earlier, and make your testing more efficient.

---

## References

- [Postman Learning Center](https://learning.postman.com/)
- [RestAssured Documentation](https://rest-assured.io/)
- [ToolsQA - API Testing Guide](https://www.toolsqa.com/api-testing/)
