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

### Factory Method Pattern / Factory Object
```
* Just like real world factories - create objects
* Reusable to create objects based on certain properties
* The factory method design intent is to define an interface for creating objects, but let the sub-classes decide which class to instantiate.
```

## Structural Patterns
`Describe how objects are connected to each other`
```
Relationships - Association, Aggregation, Composition, Inheritance, and Interface.
https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/#:~:text=Aggregation%20and%20Composition%20are%20subsets,owns%22%20object%20of%20another%20class.&text=Composition%20implies%20a%20relationship%20where,exist%20independent%20of%20the%20parent.
```
## Behavioural Patterns
`How independent objects work towards a common goal`
