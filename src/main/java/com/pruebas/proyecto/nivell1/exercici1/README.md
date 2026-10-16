# Level 1, Exercise 1: Days of the week

## Exercise

Create an enum called `Day` with the days of the week. Write a function that accepts a `Day` and reports whether it is a 
working day or the weekend.

## Implementation

`Day` contains all seven days, from `MONDAY` to `SUNDAY`. `DayTypePrinter.printDayType(Day)` returns `It's a working day.` for Monday 
to Friday and `It's the weekend.` for Saturday and Sunday. The `main` method prints the returned message.

For example:

```java
System.out.println(DayTypePrinter.printDayType(Day.SATURDAY));
```

This prints:

```text
It's the weekend.
```

## Tests

`DayTypePrinterTest` checks the returned message for every enum value and verifies that the enum contains all seven days in calendar order.
Test method names follow the `method_condition_expectedResult` convention:

- `printDayType_whenDayIsSaturdayOrSunday_returnsWeekend`
- `printDayType_whenDayIsMondayToFriday_returnsWorkingDay`
- `values_whenCalled_returnsDaysInWeekOrder`

Run this exercise's tests from the repository root with:

```bash
mvn -Dtest=DayTypePrinterTest test
```
