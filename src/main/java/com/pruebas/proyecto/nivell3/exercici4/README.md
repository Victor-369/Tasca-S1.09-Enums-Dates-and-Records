# Level 3, Exercise 4: Filtering people with streams

## Exercise

Create a list of people and use lambdas and streams to display adults and minors.

## Implementation

`Person.isAdult()` uses the `ADULT_AGE` constant (18) to determine whether a person is an adult. 
`Main` creates a list, prints everyone, then uses stream filters to print adults and minors separately. 
The adult filter uses a lambda; the tests also demonstrate a method reference.

A person aged 18 or over is an adult. The output is grouped into:

```text
List of all people:
Person[name=Luisa, age=20]
Person[name=Alfred, age=34]
Person[name=Erik, age=56]
Person[name=Erika, age=18]
Person[name=Stef, age=15]
Person[name=Chris, age=16]

List of adults:
Person[name=Luisa, age=20]
Person[name=Alfred, age=34]
Person[name=Erik, age=56]
Person[name=Erika, age=18]

List of minors:
Person[name=Stef, age=15]
Person[name=Chris, age=16]
```
