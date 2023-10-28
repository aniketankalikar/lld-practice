package com.machinecoding;

import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestLambda {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println(addition.operate(10, 5));
        System.out.println(subtraction.operate(10, 5));

        Function<Integer, Integer> add = a -> a + 5;
        Function<Integer, Integer> sub = a -> a - 5;

        System.out.println(add.apply(20));
        System.out.println(sub.apply(50));

    }
}