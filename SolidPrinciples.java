public class SolidPrinciples {
    
}
/*
 * The SOLID principles are best practices you should follow when you are working with any 
 * OOP language.

SOLID is an acronym to remember what the principles are:

Single Responsibility Principle (SRP)
Open/Closed Principle (OCP)
Liskov Substitution Principle (LSP)
Interface Segregation Principle (ISP)
Dependency Inversion Principle (DIP)
 */

/*
 * SRP states that a class should have only one reason to change. This means that each class
 * should have only one responsibility or job to do. To apply SRP in Java, you should aim to 
 * create classes that have a clear and single responsibility. If a class has multiple 
 * responsibilities, you should consider splitting it into smaller, more focused classes.


 * OCP states that software entities should be open for extension but closed for modification.
 * This means that you should be able to add new functionality to a system without modifying its
 * existing code. To apply OCP in Java, you should aim to design classes that are open for 
 * extension but closed for modification. This can be achieved by using interfaces, abstract 
 * classes, and polymorphism.
 * 
 
 * LSP states that subtypes should be substitutable for their base types. This means that any
 * instance of a base class should be able to be replaced by an instance of a subclass without
 * affecting the correctness of the program. To apply LSP in Java, you should aim to create 
 * subclasses that can be used in place of their superclass. This means that the subclass should
 * not change the behavior of the superclass.
 * 
 *   class Bird {
    }

    interface Flyable {
        public void fly();
    }

    class Penguin extends Bird {
        
    }

    class Albatross extends Bird implements Flyable {
        public void fly() {
            // implementation
        }
    }
    
 * ISP states that clients should not be forced to depend on interfaces they do not use. 
 * This means that interfaces should be small and focused, and clients should only depend on
 * the interfaces they need. To apply ISP in Java, you should aim to create interfaces that are 
 * small and focused. This means that you should avoid creating large, general-purpose interfaces
 * that are used by many clients. Instead, you should create multiple small interfaces that 
 * are each focused on a specific set of functionality. Clients can then depend on only the 
 * interfaces they need.
 * 
 
 * 
 * DIP states that high-level modules should not depend on low-level modules. Both should 
 * depend on abstractions. Abstractions should not depend on details. Details should depend on 
 * abstractions. This means that you should use interfaces or abstract classes to define the 
 * behavior of your classes, and then use dependency injection to provide the specific
 * implementations. This allows you to easily swap out different implementations without 
 * affecting the rest of your code.
 * 
 * 
 * class NotificationService {

    Sendable sender = new EmailSender();

    sendNotification() {
        sender.send();
    }
}

interface Sendable {
    send();
}

class EmailSender implements Sendable {

    send() {
        // implementation
    }
}

class TextSender implements Sendable {

    send() {
        // implementation
    }
}

 * 
 * 
 * 
 */
