# Enums, Dates and Records

This repository contains Java exercises on enums, dates and records from IT Academy Sprint S1.09.

## Requirements

- Java 25
- Maven

## Exercises

| Exercise | Description |
| --- | --- |
| [Level 1, Exercise 1](src/main/java/com/pruebas/proyecto/nivell1/exercici1/README.md) | Defines the `Day` enum and classifies each day as a working day or the weekend. |
| [Level 1, Exercise 2](src/main/java/com/pruebas/proyecto/nivell1/exercici2/README.md) | Defines task priority levels and changes the task's action according to its level. |
| [Level 1, Exercise 3](src/main/java/com/pruebas/proyecto/nivell1/exercici3/README.md) | Adds behaviour to the `Level` enum by returning a colour for each level. |
| [Level 1, Exercise 4](src/main/java/com/pruebas/proyecto/nivell1/exercici4/README.md) | Converts a string to a `Season` enum value and handles invalid values. |
| [Level 2, Exercise 1](src/main/java/com/pruebas/proyecto/nivell2/exercici1/README.md) | Displays the current date, time and date-time using `LocalDate`, `LocalTime` and `LocalDateTime`. |
| [Level 2, Exercise 2](src/main/java/com/pruebas/proyecto/nivell2/exercici2/README.md) | Calculates the difference between two dates using `Period`. |
| [Level 2, Exercise 3](src/main/java/com/pruebas/proyecto/nivell2/exercici3/README.md) | Adds and subtracts days, months and hours from a date and time. |

## Build and test

Run the test suite from the repository root:

```bash
mvn test
```

Compile the project without running tests:

```bash
mvn package
```

## Project structure

- `src/main/java` contains the exercise implementations.
- `src/test/java` contains their automated tests.

Each exercise directory includes a README with its requirements and implementation details.
