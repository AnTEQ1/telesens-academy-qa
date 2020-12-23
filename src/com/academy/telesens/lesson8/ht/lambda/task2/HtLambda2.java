package com.academy.telesens.lesson8.ht.lambda.task2;

public class HtLambda2 {
    public static void main(String[] args) {
        FactorialInterface factorialInterface = (x) -> {
            int y = 1;
            for (int i = 1; i <= x; i++) {
                y = y * i;
            }
            return y ;
        };
        System.out.println(factorialInterface.factorial(3));
    }
}
