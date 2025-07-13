/**
 Inheritance is all about inheriting the common state and behavior of a parent class (super class)
by its derived class (sub class or child class). 

A sub class can inherit all non-private members from the super class, by default.
 
 Inheritance can be one of four types – depending on the class' hierarchy.
  Let’s learn about all four types of inheritances.

Single inheritance: There is one parent class and one child class.
One child class extends one parent class.

Multi-level inheritance: In multi-level inheritance, there will be 
inheritance between more than three classes in such a way that a child
class will act as parent class for another child class.

Hierarchical inheritance: In hierarchical inheritance, there is one super
class and more than one sub class extends the super class.

Multiple inheritance: In multiple inheritance, a class can inherit the 
behavior from more than one parent classes as well.

Note: Not all programming languages support Multiple Inheritance. 
For instance, Java does not support multiple inheritance. 
This means that any given class can only have one direct parent or
 super class.
 */



/** Inheritance is a fundamental concept in object-oriented programming (OOP)
  with several important benefits:

Code Reusability: Inheritance enables code reuse by allowing a subclass
(derived class) to inherit properties and behaviors from a superclass 
(base class). This means that common attributes and methods can be defined
 in a base class and reused across multiple subclasses, reducing duplication
and promoting modular, maintainable code.

Polymorphism: Inheritance enables polymorphism, which is the 
ability of objects to take on different forms or behaviors depending
on their context. Subclasses can override or extend methods inherited
from their superclasses to provide specialized behavior, while still 
adhering to the same interface defined by the superclass. This allows 
for more flexible and extensible designs, where objects can be treated 
uniformly based on their common superclass type, regardless of their 
specific subclass implementation.

Extensibility: Inheritance allows classes to be extended or specialized 
to meet specific requirements or use cases. Subclasses can add new 
attributes, methods, or behaviors to the ones inherited from their 
superclasses, enhancing the functionality of the base class without 
modifying its implementation. This promotes modular design and facilitates
incremental development, where new features can be added incrementally 
without disrupting existing code.

Abstraction and Modularity: Inheritance promotes abstraction by allowing
developers to define a common interface or behavior in a superclass, 
while leaving the implementation details to the subclasses.
This separation of concerns between interface and implementation 
facilitates modularity and encapsulation, making it easier to manage 
and maintain complex systems by isolating changes to specific parts 
of the codebase.

Code Organization and Readability: Inheritance improves code organization
and readability by providing a natural way to represent relationships
between classes and their common characteristics. By leveraging
inheritance, developers can create intuitive class hierarchies that 
accurately model real-world entities and concepts, making the codebase
easier to understand and navigate.

*/