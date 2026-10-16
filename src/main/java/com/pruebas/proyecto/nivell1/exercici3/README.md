# Level 1, Exercise 3: Logic in an enum

## Exercise

Add methods to an enum and check that it can contain logic, for example, a `getColor()` method for each `Level`.

## Implementation

The `Level` enum assigns a colour to each level:

| Level | Colour |
| --- | --- |
| `LOW` | Green |
| `MEDIUM` | Amber |
| `HIGH` | Red |

Each enum value stores its colour and returns it through `getColor()`. Run `LevelDemo.main()` to call the method for every level:

```java
LevelDemo.main(new String[0]);
```

This prints:

```text
LOW: Green
MEDIUM: Amber
HIGH: Red
```

## Tests

`LevelTest` checks that each level returns its associated colour. Test method names follow the `method_condition_expectedResult` convention.

Run this exercise's tests from the repository root with:

```bash
mvn -Dtest=LevelTest test
```
