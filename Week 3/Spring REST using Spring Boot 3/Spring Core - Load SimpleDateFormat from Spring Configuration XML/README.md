# Spring Core - Load SimpleDateFormat from Spring Configuration XML

## Objective

Load a SimpleDateFormat bean from an XML configuration file using Spring IoC and display the current date.

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
3. Created `date-format.xml` in `src/main/resources`.
4. Configured a `SimpleDateFormat` bean.
5. Loaded the XML using `ClassPathXmlApplicationContext`.
6. Retrieved the bean using `getBean()`.
7. Displayed the current date in `dd/MM/yyyy` format.

## Expected Output

```
Today's Date : 09/07/2026
```

## Outcome

Successfully loaded a `SimpleDateFormat` bean from an XML configuration file using Spring IoC and displayed the current date in the required format.
