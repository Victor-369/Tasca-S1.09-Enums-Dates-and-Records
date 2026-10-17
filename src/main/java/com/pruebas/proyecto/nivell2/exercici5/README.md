# Level 2, Exercise 5: Checking whether a date is in the past

## Exercise

Create a function that reports whether a date passed as a parameter is before today.

## Implementation

`DateChecker.isBeforeToday(LocalDate)` returns `true` only when the supplied date is earlier than the current date. 
Today itself is not considered to be in the past, and a `null` date is rejected.

Run `DateChecker.main()` to check yesterday's date against today.
