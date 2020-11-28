package com.academy.telesens.lesson01;

import java.util.Scanner;

public class Abonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя:");
        String name = scanner.next();
        System.out.println("Введите Фамилию:");
        String lastName = scanner.next();
        System.out.println("Введите Отчество:");
        String patronomic = scanner.next();
        System.out.println("Введите Возраст:");
        int age = scanner.nextInt();
        System.out.println("Введите Пол:");
        String sex = scanner.next();
        System.out.println("Введите номер телефона:");
        String phoneNumber = scanner.next();
    }
}