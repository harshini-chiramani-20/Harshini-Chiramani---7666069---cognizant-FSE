# Difference between JPA, Hibernate and Spring Data JPA

## Objective

To understand the roles of JPA, Hibernate, and Spring Data JPA and how they work together in Java applications.

---

## What is JPA?

**JPA (Java Persistence API)** is a Java specification for Object Relational Mapping (ORM). It defines a standard set of interfaces for storing, retrieving, and managing Java objects in a relational database. JPA itself is only a specification and requires an implementation such as Hibernate.

### Features

- Java specification for ORM
- Database independent
- Standard API for persistence
- Supports annotations like `@Entity`, `@Id`, and `@Table`

---

## What is Hibernate?

**Hibernate** is an ORM framework and one of the most popular implementations of JPA. It converts Java objects into database tables and automatically generates SQL queries.

### Features

- Implements JPA specification
- Automatic table mapping
- Automatic SQL generation
- Caching support
- Lazy loading
- Transaction management

---

## What is Spring Data JPA?

**Spring Data JPA** is a Spring Framework module built on top of JPA. It simplifies database access by providing repository interfaces and eliminating boilerplate DAO code.

### Features

- Built on JPA
- Uses Hibernate by default
- Provides `JpaRepository`
- Automatic CRUD methods
- Pagination and Sorting support
- Custom query methods

---

## Comparison Table

| Feature            | JPA           | Hibernate      | Spring Data JPA |
| ------------------ | ------------- | -------------- | --------------- |
| Type               | Specification | Framework      | Spring Module   |
| Developed By       | Oracle        | Hibernate Team | Spring          |
| ORM Support        | Defines ORM   | Implements ORM | Uses JPA        |
| CRUD Operations    | Manual        | Easier         | Simplest        |
| SQL Generation     | No            | Yes            | Yes             |
| Repository Support | No            | No             | Yes             |
| Boilerplate Code   | High          | Medium         | Low             |

---

## Relationship

```
Spring Data JPA
        │
        ▼
       JPA
        │
        ▼
   Hibernate
        │
        ▼
     MySQL Database
```

---

## Conclusion

JPA defines the persistence standard, Hibernate implements that standard, and Spring Data JPA builds on top of JPA to simplify database operations by providing repository interfaces and reducing the amount of code developers need to write.
