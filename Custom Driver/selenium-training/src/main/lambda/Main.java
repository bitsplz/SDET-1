package main.lambda;

public class Main{
public static void main(String[] args) {
    // Using a lambda expression to implement the Greeting interface
    Greetings greeting = name -> System.out.println("Hello, " + name + "!");

    // Using the implemented method
    greeting.sayHello("Alice"); // Output: Hello, Alice!
    }
}
