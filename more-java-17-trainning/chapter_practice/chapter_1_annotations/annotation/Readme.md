# Trainning Proyect: Annotation at Java 17

## Package: Deprecation 
Examples of the use of the annotation `@Deprecated` and the new annotation `@Deprecated(since="version")` at Java 17.
- Ordinary deprecation - `@Deprecated(since="version", forRemoval=false)`
- Terminally deprecation - `@Deprecated(since="version", forRemoval=true)`

| Use-Site \ API        | Not deprecated | Ordinarily Deprecated | Terminally Deprecated |
|-----------------------|----------------|-----------------------|-----------------------|
| Not deprecated        | No warning     | Ordinary warning      | Removal warning       |
| Ordinarily Deprecated | No warning     | No warning            | Removal warning       |
| Terminally Deprecated | No warning     | No warning            | Removal warning       |
    