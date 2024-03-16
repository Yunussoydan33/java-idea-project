// Java example project demonstrating the difference between reference types and value types

// Reference type (Class)
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Reference type (Class)
        Person person1 = new Person("Alice"); // person1 holds a reference to an object in memory
        Person person2 = person1; // person2 now holds the same reference as person1

        person1.name = "Bob"; // Changing person1's name
        System.out.println("person1 name: " + person1.name); // Output: Bob
        System.out.println("person2 name: " + person2.name); // Output: Bob (person2's name is also changed)

        // Value type (Primitive)
        int x = 5; // x holds the value 5
        int y = x; // y now holds the same value as x

        x = 10; // Changing the value of x
        System.out.println("x: " + x); // Output: 10
        System.out.println("y: " + y); // Output: 5 (y's value remains unchanged)
    }
}