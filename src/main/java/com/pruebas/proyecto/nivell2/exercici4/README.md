# Level 2, Exercise 4: Formatting dates

## Exercise

Format a date with `DateTimeFormatter` in several different formats.

## Implementation

`DateFormatter.main()` formats the same `LocalDate` in ISO, numeric, long and full British English formats. The text formats use `Locale.UK` so month and weekday names are in English.

Run `DateFormatter.main()` to see:

```text
ISO format: 2025-09-05
Numeric format: 05/09/2025
Long format: 5 September 2025
Full format: Friday, 5 September 2025
```
