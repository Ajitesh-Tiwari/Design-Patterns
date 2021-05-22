# Design-Patterns
`Creational, Structural, and Behavioural Patterns`
## Book
```
Design Patterns: Elements of Reusable Object-Oriented Software
Contains 23 patterns.
```
## Creational Patterns
`Handles creation/cloning of new objects`

### Singleton Pattern
```
* Enforces only one object of a class
* Global accessibility within the program
```
```
HOW TO CREATE

* Private constructor
* Public static method to get instance of the class, if null return new object.
```

`Lazy creation helps when object is large`

`Issues when multiple threads try to access the object`

```
REFERENCES -

https://dzone.com/articles/difference-between-volatile-and-synchronized-keywo#:~:text=So%2C%20where%20volatile%20only%20synchronizes,the%20ownership%20between%20multiple%20threads.
https://medium.com/@cancerian0684/singleton-design-pattern-and-how-to-make-it-thread-safe-b207c0e7e368
```
## Structural Patterns
`Describe how objects are connected to each other`
```
Relationships - Association, Aggregation, Composition, Inheritance, and Interface.
```
## Behavioural Patterns
`How independent objects work towards a common goal`
