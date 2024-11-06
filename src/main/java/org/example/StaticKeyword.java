package org.example;

class Counter {
    static int count = 0;  // Static variable

    public Counter() {
        count++;  // Increases count for every new object
        System.out.println(count);
    }
}

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

class SetupDriver {
    static {
        System.out.println("Loading Configs....");
        System.out.println("Driver initialized....");
        System.out.println("Headless mode set....");
        System.out.println("Browser window maximized....");
        System.out.println("Database connection established....");
    }

    SetupDriver() {
        System.out.println("Driver is configured");
    }
}