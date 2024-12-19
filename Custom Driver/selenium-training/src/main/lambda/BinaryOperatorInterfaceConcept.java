package main.lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

    public static void main(String[] args){
        BinaryOperator<Integer> func1 = (x1,x2) -> x1+x2;
        int sum = func1.apply(2,3);
        System.out.println(sum);
    }
}
