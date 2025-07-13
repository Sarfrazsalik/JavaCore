public class Encapsulation {
    
}

/**
 * Encapsulation is the OOP principle of containing related state and behavior together inside
 * a class, and also hiding and preventing change to an object's data members. 
 * 
 * An object encapsulates or controls the access to its internal state.
 * 
 * This prevents arbitrary external interference, which could bring the object into an
 * invalid or inconsistent state.
 * 
 * 
 */

/*
 * Using OOP, we could maintain many bird objects which individually contain their own
 * age, and can generate their own sound. This concept of an object controlling its own data
 * can be referred to as encapsulation.
 *
 */

 /*
  * When encapsulating your code, certain conventions should be followed:

All instance fields for a class should be private.

Each field should have getters and setters as needed 
(typically these are public, but other access modifiers can be used as needed).

Getter and Setter Methods (a.k.a. 'accessor' and 'mutator' methods) should use
the following name convention:
getVariableName
setVariableName
  */


/*
 * 
  Encapsulation is a fundamental concept in object-oriented programming (OOP) with several 
  important benefits:

Encapsulation promotes code maintainability: By encapsulating data and behavior within a class,
encapsulation reduces the likelihood of unintended side effects when making changes to the 
implementation. Modifications to the internal implementation can be made without affecting other
parts of the codebase, as long as the public interface remains unchanged. 
This simplifies code maintenance, debugging, and refactoring, leading to more robust and 
maintainable software systems.

Encapsulation improves code readability and understandability: By encapsulating related data and 
behavior within a class, encapsulation enhances code readability and understandability.
Classes serve as self-contained units of functionality, making it easier for developers to
comprehend the purpose and behavior of individual components. Encapsulation also promotes code
documentation and self-documenting code practices, further improving code readability and 
maintainability.

Overall, encapsulation is essential in OOP for promoting maintainability and readability.
By encapsulating data and behavior within classes and providing controlled access through a 
public interface, encapsulation enables the creation of robust, modular, and maintainable software
 systems.
 */