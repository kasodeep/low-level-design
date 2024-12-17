## Design Pattern:

    A Pattern is a solution to a problem in a context.

## Strategy Pattern✔:

    It defines a family of algorithms(Duck, Fly..) encapsulated each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from client that uses it.

## Observer Pattern✔:

    It defines a one-to-many dependency between objects so that when one object changes state,
    all of its dependents are notified and updated automatically.

## Decorator Pattern✔:

    It attaches additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality.
    We are adding dynamic behavior to the classes at runtime using composition.

## Factory Pattern✔:

    It defines an interface for creating an object, but let subclasses decide which class to instantiate.
    Factory method lets a class defer instantiation to subclasses.

## Abstract Factory✔:

    The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Singleton Pattern✔:

    It ensures a class has only one instance, and provides a global point of access to it.

## Command Pattern✔:

    It encapsulates a request as an object, thereby letting you parameterize other objects with different requests,
    queue or log requests, and support undoable actions.

## Adapter Pattern✔:

    It converts the interface of a class into another interface the client expects.
    Adapter let's classes work together that couldn't otherwise because of incompatible interfaces.

## Facade Pattern✔:

    It provides a unified interface to a set of interfaces in a subsystem.
    Facade defines a higher level interface that makes the subsystem easier to use.

## Template Pattern✔:

    It defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
    Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Iterator Pattern:

    It provides a way to access elements of an aggregate object sequentially without exposing its underlying representation.

## Composite Pattern:

    It allows you to compose objects into tree structures to represent part-whole hierarchies.
    Composite lets clients treat individual objects and composition of objects uniformly.

## The State Pattern:

    It allows for an object to alter its behavior when its internal state changes.
    The object will appear to change its class.

## Design Principles:

    1. Identify the aspects of your application that vary and separate them from what stays the same.✔
    Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.

    2. Program to an interface, not an implementation.✔
    The point is to explore polymorphism, by programming to a super type so that actual runtime object isn't locked into the code.

    3. Favor composition over inheritance.✔
    The HAS-A relation should be composed, as it allows to change behavior at runtime.
    
    4. Strive for loosely coupled designs between objects that interact✔.
    The objects interact without having much knowledge about each other.

    4. The Open Closed Principle.✔
    Classes should be open for extension and close for modification.

    5. Single Responsibility Principle
    Classes should be responsible for only one task.

    6. Dependency Inversion Principle.✔
    Depend upon abstraction, do not depend upon concrete classes.

    7. Principle of Least Knowledge.✔
    Talk to only your immediate friends.

    8. The Hollywood Principle.✔
    Don't call us, We will call you!.

## Creational Patterns

    The patterns involve object instantiation and all provide a way to decouple a client from the objects it needs to instantiate.
    Singleton, Builder, Factory.

## Structural Patterns

    It lets you compose classes or objects into into larger structures.
    Decorator, Composite, Proxy, Adapter, Facade.

## Behavioral Patterns

    It is concerned with how classes and objects interact and distribute responsiblity.
    Observer, State, Strategy, Command, Iterator, Template Method.