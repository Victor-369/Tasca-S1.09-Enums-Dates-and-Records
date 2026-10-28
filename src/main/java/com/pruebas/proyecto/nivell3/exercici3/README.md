# Level 3, Exercise 3: Validating a record

## Exercise

Validate a record's data in its constructor so that an invalid age cannot be used to create a person.

## Implementation

`Person` uses a compact constructor to reject negative ages with an `IllegalArgumentException`. 
An age of zero is valid. `Main` creates a person and displays their age.

Run `Main.main()` to see:

```text
Age: 10
```
