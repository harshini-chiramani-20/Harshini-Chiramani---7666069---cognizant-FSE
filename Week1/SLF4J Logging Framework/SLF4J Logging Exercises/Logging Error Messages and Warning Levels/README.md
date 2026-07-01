# Logging Error Messages and Warning Levels

## Objective

To understand logging using the SLF4J framework.

## Files

- LoggingExample.java

## Log Levels Used

- INFO
- WARN
- ERROR

## Commands

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.cts.LoggingExample"
```

## Expected Output

```
INFO  Application started.
WARN  Low disk space warning.
ERROR Unable to connect to the database.
INFO  Application terminated.
```

## Learning Outcome

- Configure SLF4J.
- Log informational messages.
- Log warning messages.
- Log error messages.
