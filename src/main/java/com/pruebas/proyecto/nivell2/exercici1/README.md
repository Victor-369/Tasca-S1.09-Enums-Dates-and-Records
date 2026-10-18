# Level 2, Exercise 1: Current date and time

## Exercise

Display the current date, time and date-time using `LocalDate`, `LocalTime` and `LocalDateTime`.

## Implementation

`CurrentDateTime.main()` obtains the current date and time with the Java time API and prints each value. The date and time 
are read separately for the first two lines; the combined date-time is obtained independently for the final line.

Run `CurrentDateTime.main()` to see output in ISO-8601 format, for example:

```text
Current date: 2026-10-17
Current time: 11:15:45.093
Current date and time: 2026-10-17T11:15:45.093
```

The displayed values depend on when the program runs.
