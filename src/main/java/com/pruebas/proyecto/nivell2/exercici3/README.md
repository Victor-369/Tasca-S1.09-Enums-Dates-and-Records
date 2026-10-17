# Level 2, Exercise 3: Date and time calculations

## Exercise

Add or subtract days, months or hours from a date.

## Implementation

`DateCalculations.main()` uses `LocalDateTime` and its `plusDays()`, `minusDays()`, `plusMonths()`, `minusMonths()`, 
`plusHours()` and `minusHours()` methods to show all six calculations from the same example date and time.

Run `DateCalculations.main()` to see:

```text
Original date and time: 2024-05-15T10:30
Add 10 days: 2024-05-25T10:30
Subtract 10 days: 2024-05-05T10:30
Add 2 months: 2024-07-15T10:30
Subtract 2 months: 2024-03-15T10:30
Add 3 hours: 2024-05-15T13:30
Subtract 3 hours: 2024-05-15T07:30
```

Each operation is performed independently on the original date and time.
