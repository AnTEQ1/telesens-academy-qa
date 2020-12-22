package com.academy.telesens.lesson8.ht.lambda.task1;

public class HtLambda1 {
    public static void main(String[] args) {
        BoolInterfaсe oper = (x) -> {
            return x >= 10 && x <= 20;
        };
        System.out.println(oper.limit(15));
        System.out.println(oper.limit(21));
        System.out.println(oper.limit(9));
    }
}
