# REST - Get Country based on Country Code

## Objective

Develop a REST API that returns country details based on the supplied country code.

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Maven

## Endpoint

GET /country/{code}

### Example

GET /country/IN

### Output

{
"code": "IN",
"name": "India"
}

## Outcome

Successfully implemented a REST endpoint that accepts a country code as a path variable and returns the corresponding country details in JSON format.
