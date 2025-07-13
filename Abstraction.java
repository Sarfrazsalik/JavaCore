public class Abstraction {
    
}
/**
 * In object-oriented programming (OOP), abstraction is a key principle that allows developers
 * to model real-world entities as classes and objects, focusing on the essential properties
 * and behaviors while hiding the implementation details that are not relevant to the 
 * abstraction's purpose. 
 * 
 * Abstraction in OOP involves defining a clear and well-defined interface for interacting with 
 * objects.
 * 
 */
 /**
  * Think of a car - you do not need to know how the car works, just how to use the 
  interfaces you are given, like the accelerator, brake, and steering wheel. Thus, a
  car "abstracts" away the internal details of the engine, motor, driveshaft, and other parts.

  Let's assume that the Dog and Cat class extend the Animal class. When creating an 
  instance of a Dog, we will declare the corresponding reference variable to be of type Animal,
  not Dog. The advantage of writing code this way is that later if we decide we instead need to 
  create a Cat here, we can easily change the constructor being invoked. If we code with the 
  abstract superclass in mind, which is Animal, then we know that we can have the animal use 
  the .speak() method regardless of whether the object is a Dog or Cat because that behavior 
  is guaranteed to exist for all animals.

  */

  /**
   * An abstract class is a class that is declared abstract — it may or may not include
   *  abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
Abstract classes have constructors but still cannot be instantiated. Even if you can't create
an object of an abstract class, it still may have some state that it passes down to subclasses 
that need to be initialized. When a subclass constructor calls super(), it calls the 
abstract class's constructor and the state can be initialized through the abstract class 
constructor.
   */


/**
 * An abstract class can have 0 or more abstract methods, but if a class has at least one 
 * abstract method then the whole class has to be abstract.
An abstract class can have implemented methods as well.

When you declare a method abstract, then its containing class must be declared abstract as well.
You may, however, declare a class abstract, but not have any abstract methods.

If a class is declared abstract, then it cannot be instantiated. 
 */