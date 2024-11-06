package org.example;

public class Main {
    public static void main(String[] args) {
        //static variable
        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();
        //static method
        System.out.println("Sum: "+Calculator.add(5,10));
        //static block
        SetupDriver driver1 = new SetupDriver();
        SetupDriver driver2 = new SetupDriver();
        //final variable
        RangeCheck range = new RangeCheck();
        range.getMaxValue();
        //range.MAX_VALUE= 30;
        //Switch case without yield
        SwitchExample sw = new SwitchExample();
        System.out.println(sw.day(4));
        System.out.println(sw.dayYield(6));
        //record keyword
        Person person1 = new Person("Ali", 25);
        System.out.println(person1); //toString
        Person person2 = new Person("Ahmed", 25);
        System.out.println(person2.greeting());
        if (person1.equals(person2)){
            System.out.println("Same person");
        }
        else {
            System.out.println("Different person");
        }
        //Regex
        RegexExample reg = new RegexExample();
        reg.Match("\\d+", "There are 64 apples");
        reg.split("apple,orange,banana");
        //Enum
        TestScenario flow = TestScenario.LOGOUT;
        flow.runTest();
        Environment currentEnv = Environment.STAGING;
        System.out.println("Running tests on: " + currentEnv.getUrl());
        //Type casting
        int num1 = 100;
        double decimal1 = num1;  // Implicit casting: int to double
        System.out.println(decimal1);
        double decimal2 = 100.99;
        int num2 = (int) decimal2;  // Explicit casting: double to int
        System.out.println(num2);
        //Exception handling
        ExceptionExample.divide(10,0);
        //throw exception
        try {
            ExceptionExample.validateAge(-14);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //recursion
        int num = 5;
        System.out.println("Factorial of " + num + " is " + RecursionExample.factorial(num));
        //Lambda functions
        Area rectangle = (l, w) -> l * w;
        System.out.println("Area of rectangle: "+rectangle.calculate(3,4));
        //CSV reader
        FileReadExample.readCSV("src/main/resources/DLM_Repair_Charge_181818_GB_2024_10_31.csv");
        //OOP Pillars
        BankAccount saving = new BankAccount(6050000); //encapsulation
        Car myCar = new Car();
        myCar.accelerate(50); //Inherit
        myCar.refuel(20);
        System.out.println("Car speed: " + myCar.speed);

    }
}