# Commonly Used Standard Annotations
## Table of content
- [Annotation type: @Deprecation](#annotation-type-deprecation)
  - [Java doc type: @deprecated](#java-doc-type-deprecated)
- [Annotation type: @Override](#annotation-type-override)
- [Annotation type: @SuppressWarnings](#annotation-type-suppresswarnings)
- [Annotation type: @FunctionalInterface](#annotation-type-functionalinterface)
## Annotation type: @Deprecation 
Deprecation APIs in Java is a way to provide information about the life cycle of the APIs. You can deprecate:
- modules
- packages
- types
- constructors
- methods
- fields
- parameters
- local variables

Examples of the use of the annotation `@Deprecated` and the new annotation `@Deprecated(since="version")` at Java 17.
- Ordinary deprecation - `@Deprecated(since="version", forRemoval=false)`
- Terminally deprecation - `@Deprecated(since="version", forRemoval=true)`

| Use-Site \ API        | Not deprecated | Ordinarily Deprecated | Terminally Deprecated |
|-----------------------|----------------|-----------------------|-----------------------|
| Not deprecated        | No warning     | Ordinary warning      | Removal warning       |
| Ordinarily Deprecated | No warning     | No warning            | Removal warning       |
| Terminally Deprecated | No warning     | No warning            | Removal warning       |
    
[CODE EXAMPLE](src/main/java/annotation/trainning/deprecation/DeprecatedApiWarningTest.java)

### Java doc type: @deprecated
The @deprecated java doc type lets you specify the deprecation with a rich set of text formattings features of HTML.

You must use the @deprecated tag to provide the description.
```java
/**
 * @deprecated
 * This method is deprecated and will be removed in a future release.
 * Use {@link #bar()} instead.
 */
@Deprecated(since="version", forRemoval=true)
public void deprecatedMethod(){}
```

## Annotation type: @Override
The java.lang.Override annotation type is a marker annotation type. It can only be used on methods. It indicates that a method annotated with this annotation overrides a method declared in its supertype.
This annotation is very useful for develolpers to avoid typos that lead to logical error in the program.

```java
public class A { 
    public void m1() { } 
} 
public class B extends A { 
    @Override 
    public void m1() { } 
}
```

## Annotation type: @SuppressWarnings
The SuppressWarnings annotation type is used to suppress named compile-time warnings. 
```java 
@SuppressWarnings({"deprecation","removal"})
    public static void supressDeprecationAndRemovalWarning() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }
```
[CODE EXAMPLE](src/main/java/annotation/trainning/deprecation/DeprecatedApiWarningTest.java)

## Annotation type: @FunctionalInterface
An interface with one abstract method declaration is known as a functional interface. Previously, a functional interface was known as a **SAM (Single Abstract Method)** type. The compiler verifies that all interfaces annotated with a @FunctionalInterface really contain one and only one abstract method.

```java
@FunctionalInterface
public interface PersonalConsumer {
    void consume(String name);
}

public class Main{
    public static void main(String[] args) {
        PersonalConsumer personalConsumer = name -> System.out.println("Hello " + name);
        personalConsumer.consume("John");
    }
}
```

[CODE EXAMPLE](src/main/java/annotation/trainning/deprecation/PersonalConsumer.java)