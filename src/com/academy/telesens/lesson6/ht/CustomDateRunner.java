package com.academy.telesens.lesson6.ht;

import com.academy.telesens.lesson5.ht.CustomDate;

public class CustomDateRunner {
    public static void main(String[] args) {
        CustomDateTime customDateTime = new CustomDateTime();
        System.out.println(customDateTime.getFormattedDate());
        System.out.println(customDateTime.getFormattedDate(true));
        CustomDateTime customDateTime2 = new CustomDateTime(2008, 1, 12, 11, 13, 58);
        System.out.println("*****************");
        System.out.println(customDateTime2.getFormattedDate());
        System.out.println(customDateTime2.getFormattedDate(true));
    }
}
