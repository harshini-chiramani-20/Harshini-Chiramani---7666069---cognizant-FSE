# Spring Core - Load Country from Spring Configuration XML

## Objective

Load a Country bean from an XML configuration file using Spring IoC and display its details.

## Technologies Used

- Java 17
- Spring Boot 4
- Spring Core
- Maven

## Project Structure

```
Code/
└── spring-learn/

Output/
└── Output.png

README.md
```

## Steps Performed

1. Created a Spring Boot Maven project.
2. Added the Spring Context dependency.
3. Created a Country Java Bean.
4. Created `country.xml` in `src/main/resources`.
5. Configured the Country bean using XML.
6. Loaded the XML configuration using `ClassPathXmlApplicationContext`.
7. Retrieved the bean using `getBean()`.
8. Displayed the Country object.

## Expected Output

```
Country [code=IN, name=India]
```

## Outcome

Successfully loaded a Country bean from an XML configuration file using Spring IoC and displayed its details.
