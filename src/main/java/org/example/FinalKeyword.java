package org.example;

final class RangeCheck {
    final int MAX_VALUE = 100;
    void getMaxValue() {
        System.out.println("Max value is: " + MAX_VALUE);
    }
}

class Animal{
    // A final method to prevent overriding in subclasses
    public final void sleep() {
        System.out.println("The animal is sleeping.");
    }

    // A non-final method that can be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

}
class Dog extends Animal {
    // Overriding the non-final method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
//     @Override
//     public void sleep() {
//         System.out.println("The dog is sleeping.");
//     }
}

//class child extends RangeCheck{
//
//}