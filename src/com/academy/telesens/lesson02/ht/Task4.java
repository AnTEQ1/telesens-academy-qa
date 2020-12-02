package com.academy.telesens.lesson02.ht;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число:");
        int a = scanner.nextInt();
        if (a >= 10 && a < 100) {
            System.out.println("Вы ввели число: " + a);
            for (int i = 0; i < 2; i++){
                sum += a % 10;
                a = a/10;
            }
            System.out.println("Сумма цифр исходного числа: " + sum);
        } else {
            System.out.println("Введеное значение не является двузначным");
        }
    }
}
