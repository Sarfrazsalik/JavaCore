/***
 * Interfaces contain methods without bodies, and classes which implement the interfaces
 * must implement those methods.
 * Notice how this interface has a signature for a method, but it doesn't have a body (it ends with a semicolon
 * rather than curly braces.) The method body will be written by the implementing class.
 * 
 * Implementing an interface can be referred to as a contractual guarantee that a
 * class will exhibit some behavior.
 *
 * You can implement multiple interfaces, but you cannot extend multiple classes.
 *
 *
 *
 */

 /**An interface is similar to an abstract class,
  but there's a key difference: A class can only inherit one other class, but a
  class can implement as many interfaces as it needs.

  A class implements an interface using the implements keyword in the class
 definition and by providing implementations for any abstract methods defined by 
 the interface.

Interfaces have these advantages over inheritance:

Implementation details do not need to be provided in the interface.

A class can only extend one other class, but it can implement as many interfaces 
as needed.
An interface acts as a contract for behaviors that a class can implement
  
Interfaces have implicit modifiers on methods and variables.

Methods are 'public' and 'abstract'
Variables are 'public', 'static', and 'final' To inherit interfaces, a class must 
implement them and they are REQUIRED to implement all methods, unless the class is 
abstract.

*/


/**
 * A real-world use case for interfaces in Java can be found in the development of a 
 payment processing system that integrates with multiple payment gateways, such as 
 credit card processors, digital wallets, and bank transfers.

Consider a scenario where you are designing the payment processing system to handle 
various payment methods, each with its own implementation details and APIs.

Interfaces can be used to define a common contract for processing payments, 
allowing the application to accept payments using different payment gateways 
without tightly coupling the implementation to specific payment providers.

Here's how interfaces can be used in this scenario:

PaymentProcessor Interface: You can define a PaymentProcessor interface that serves as
the common contract for processing payments via different payment gateways. This 
interface can declare methods for authorizing payments, capturing funds, and handling 
payment status.

Concrete PaymentProcessor Implementations: Concrete classes implementing the 
PaymentProcessor interface can provide specific implementations for processing payments 
via different payment gateways, such as credit card processors, digital wallets, and 
bank transfer APIs.

Usage in Payment Processing System: In the payment processing system, developers can use
the PaymentProcessor interface to process payments via different payment gateways 
without needing to know the specific implementation details of each payment provider. 
This promotes flexibility, modularity, and extensibility in the application design.

In this real-world use case, interfaces provide a way to define a common contract for
 interacting with different payment gateways, enabling code reuse, polymorphism,
and modularity in the design and implementation of the payment processing system in Java. Additionally, interfaces allow for easy integration of new payment gateways in the future without modifying existing code.
 */