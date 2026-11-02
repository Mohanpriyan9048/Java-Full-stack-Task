package Test1;
/* 1. Student Class Access Restriction
=>OOP Concept: Encapsulation
=>Reason: It protects the data from unauthorized direct access or accidental modification from outside classes by making fields private and controlling access via public getter and setter methods.
2. Car and Vehicle Reuse
=>OOP Concept: Inheritance
=>Java Syntax:java
class Car extends Vehicle {
// Car inherits properties and methods from Vehicle
}
Use code with caution.
3. Calculator Methods
=>OOP Concept: Method Overloading (Compile-time Polymorphism)
=>Explanation: It allows a class to have multiple methods with the same name, as long as their parameter lists (number or data types of arguments) are different.
4. Custom display() Implementation
=>Method Overriding (Runtime Polymorphism)
=>Explanation: It occurs when a subclass (child class) provides a specific, custom implementation for a method that is already defined in its superclass (parent class).
5. Hiding Implementation Details
=>OOP Concept: Abstraction
=>Java Feature: Abstract classes (or Interfaces)
6. Difference Between Method Overloading and Method Overriding
=>Method Overloading: Occurs within the same class when multiple methods have the same name but different parameters (compile-time polymorphism).
=>Method Overriding: Occurs between a parent and a child class when a child class provides a specific implementation for a method that is already defined in the parent class with the same parameters (run-time polymorphism).
example:
class Parent {
    private void display() { 
        System.out.println("Parent private method"); 
    }
}

class Child extends Parent {
    // This is NOT overriding; it is a brand-new method unique to Child
    void display() { 
        System.out.println("Child independent method"); 
    }
}
7. Difference Between an Abstract Class and an Interface 
=>Inheritance: A class can extend only one abstract class, but it can implement multiple interfaces.
=>Methods: Abstract classes can have both abstract and concrete methods, while interfaces primarily contain abstract methods.
=>Variables: Abstract classes can have any type of variables, but interface variables are strictly public, static, and final.
8. Four Main OOP Principles
=>Encapsulation: Hiding data by wrapping variables and methods into a single unit (class).
=>Inheritance: Allowing a child class to inherit properties and behaviors from a parent class.
=>Polymorphism: The ability of a method to perform different tasks (e.g., overloading and overriding).
=>Abstraction: Hiding complex implementation details and showing only essential features.
9. Can a private method of a parent class be overridden?
=>No, a private method cannot be overridden.
=>Reason: Private methods are visible only within their own class. Since they are not inherited by the child class, they cannot be overridden. Writing the same method in the child class just creates a completely new, independent method.
Example:
class Parent { private void show() {} }
class Child extends Parent { 
    void show() {} // Unique to Child, NOT an override
}
*/
public class Oops {
 
}
