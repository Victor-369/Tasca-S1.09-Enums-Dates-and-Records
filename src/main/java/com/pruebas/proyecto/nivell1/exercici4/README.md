# Level 1, Exercise 4: Converting a string to an enum

## Exercise

Convert a `String` to an enum using `valueOf` and handle errors when the value is invalid.

## Implementation

`Season` defines `SPRING`, `SUMMER`, `AUTUMN` and `WINTER`. `SeasonConverter.convert(String)` converts an exact enum name with `Season.valueOf()`. Enum names are case-sensitive, and the method throws an `IllegalArgumentException` with a helpful message if the name is invalid. It also reports `null` input with an `IllegalArgumentException`.

For example:

```java
Season season = SeasonConverter.convert("SPRING");
System.out.println(season);
```

This prints:

```text
SPRING
```

`SeasonConverter.main()` also demonstrates handling an invalid name with a `try`/`catch` block.

## Tests

`SeasonConverterTest` checks conversion of all four valid seasons, rejects invalid and incorrectly cased names, and verifies handling of `null`. The tests call the conversion method directly and do not change `System.out`.

Test method names follow the `method_condition_expectedResult` convention. Run these tests from the repository root with:

```bash
mvn -Dtest=SeasonConverterTest test
```
