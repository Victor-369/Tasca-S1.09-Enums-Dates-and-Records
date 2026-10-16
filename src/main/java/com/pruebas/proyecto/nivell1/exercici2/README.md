# Level 1, Exercise 2: Task levels

## Exercise

Create a `Level` enum with the values `LOW`, `MEDIUM` and `HIGH`. Create a `Task` class with a `Level` property and show how its behaviour changes depending on the level.

## Implementation

`Task` stores its level and provides a different action through `getAction()`:

| Level | Action |
| --- | --- |
| `LOW` | Handle the task when convenient. |
| `MEDIUM` | Plan the task and complete it soon. |
| `HIGH` | Prioritise the task and complete it immediately. |

Run `Task.main()` to display the action for each level:

```text
LOW: Handle this task when convenient.
MEDIUM: Plan this task and complete it soon.
HIGH: Prioritise this task and complete it immediately.
```

## Tests

`TaskTest` checks level storage, the action associated with every level, and the enum values' order. Test method names follow the `method_condition_expectedResult` convention.

Run this exercise's tests from the repository root with:

```bash
mvn -Dtest=TaskTest test
```
