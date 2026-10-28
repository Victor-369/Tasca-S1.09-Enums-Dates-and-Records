### Compare a record with a traditional class and comment on the differences in readability and usefulness.

A record is a class designed to store immutable data.

A traditional class is a template for creating objects with state and behaviour (getters, setters, methods).
It is more flexible, but all that code has to be written by hand.

#### Readability
- A record is much more readable. You can see what data it contains in a single line. 
- With a class, you have to read the entire body to see if there is any logic.

#### Usefulness
- Record: DTOs or API responses. As it is immutable, it is safer, and the `equals` method compares by content.
- Class: necessary when the object needs to change state, use inheritance or encapsulate complex logic.
