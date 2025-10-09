# API Testing Example

This file provides a simple, real-life example of API testing using a Login API scenario. It is designed for QA testers to understand API testing concepts easily.

---

## 1. API Details

**Endpoint:** `POST /api/login`  
**Description:** Login a user into the application using username and password.  
**Request Body:** JSON format

```json
{
  "username": "testuser",
  "password": "password123"
}
```

**Expected Responses:**

- **Success (200 OK):**

```json
{
  "status": "success",
  "message": "Login successful",
  "token": "abc123xyz"
}
```

- **Failure (401 Unauthorized):**

```json
{
  "status": "error",
  "message": "Invalid username or password"
}
```

---

## 2. Testing Steps

1. **Positive Test Case: Valid Login**  
   - Send POST request with correct username and password.  
   - Validate status code is 200.  
   - Ensure response message is "Login successful".  
   - Verify token is present in the response.

2. **Negative Test Case: Invalid Login**  
   - Send POST request with incorrect username or password.  
   - Validate status code is 401.  
   - Ensure response message is "Invalid username or password".

3. **Missing Fields**  
   - Send POST request without username or password.  
   - Validate status code is 400 (Bad Request).  
   - Ensure proper error message is returned.

4. **Boundary Testing**  
   - Test extremely long username/password values.  
   - Validate API handles input limits and returns appropriate errors.

---

## 3. Example using Postman

1. Open Postman and create a new request.  
2. Select method `POST` and enter the API URL:  
   ```
   https://example.com/api/login
   ```
3. In the **Body** tab, select **raw → JSON** and enter the request body.  
4. Click **Send** and verify the response.  
5. Repeat steps for positive and negative scenarios.

---

## 4. Example using RestAssured (Java)

```java
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LoginAPITestExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://example.com";

        // Positive Test
        given()
            .header("Content-Type", "application/json")
            .body("{"username":"testuser", "password":"password123"}")
        .when()
            .post("/api/login")
        .then()
            .statusCode(200)
            .body("message", equalTo("Login successful"));

        // Negative Test
        given()
            .header("Content-Type", "application/json")
            .body("{"username":"wronguser", "password":"wrongpass"}")
        .when()
            .post("/api/login")
        .then()
            .statusCode(401)
            .body("message", equalTo("Invalid username or password"));
    }
}
```

---

## 5. Key Points

- Always validate **status code**, **response body**, and **headers**.  
- Include both **positive** and **negative** test scenarios.  
- Automate tests for repetitive API calls using tools like **Postman**, **RestAssured**, or **JMeter**.  
- Ensure error handling is tested for invalid inputs and missing data.

---

## 6. Real-Life Scenario

Imagine a mobile banking app:  

- User logs in to check account balance.  
- If API returns correct balance for valid credentials, test passes.  
- If API returns incorrect data or fails for valid credentials, a bug is logged.  

This simple example helps understand how API testing ensures backend reliability before UI integration.

---

# Final Takeaway

- API testing is critical for verifying the backend functionality of applications.
- Both positive and negative scenarios must be validated.
- Tools like Postman and RestAssured make testing more efficient and automatable.
- Proper API testing ensures data accuracy, security, and application reliability before integrating with the UI.
- Always document test results and handle edge cases to avoid unexpected failures in production.

