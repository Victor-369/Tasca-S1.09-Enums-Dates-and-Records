# Level 2, Exercise 2: Difference between dates

## Exercise

Calculate the difference between two dates using `Period` or `Duration`.

## Implementation

`DateDifference.main()` defines two example dates and uses `Period.between()` to calculate the elapsed years, months and days. 
`Period` is suitable here because the inputs are calendar dates without times.

Run `DateDifference.main()` to see:

```text
Difference between 2024-01-15 and 2025-03-20: 1 year, 2 months and 5 days.
```

Change `startDate` and `endDate` to calculate a different interval. The example assumes the start date is earlier than the end date.
