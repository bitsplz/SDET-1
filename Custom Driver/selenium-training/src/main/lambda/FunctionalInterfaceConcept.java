package main.lambda;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

    public static void main(String[] args){
        Function<String, Integer> func1 = x -> x.length();
        int len = func1.apply("Hello");
        System.out.println(len);
    }
}
