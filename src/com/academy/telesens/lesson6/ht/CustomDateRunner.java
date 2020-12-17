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
        System.out.println("*****************");
        System.out.println(customDateTime.toString());
        System.out.println("*****************");
        System.out.println(CustomDateTime.validate(3,45,39));
        System.out.println(CustomDateTime.validate(25,45,39));
        System.out.println(CustomDateTime.validate(25,60,39));
        System.out.println(CustomDateTime.validate(25,60,78));
        System.out.println("*****************");
        CustomDateTime customDateTime3 = new CustomDateTime(2008, 1, 12, 26, 13, 58);
        System.out.println(customDateTime3.getFormattedDate());
        CustomDateTime customDateTime4 = new CustomDateTime(2008, 1, 12, 11, 60, 58);
        System.out.println(customDateTime4.getFormattedDate());
        CustomDateTime customDateTime5 = new CustomDateTime(2008, 1, 12, 11, 58, 60);
        System.out.println(customDateTime5.getFormattedDate());
        System.out.println("*****************");
        CustomDateTime customDateTime6 = new CustomDateTime();
        customDateTime6.setHour(15);
        customDateTime6.setMinute(35);
        customDateTime6.setSecond(55);
        System.out.println(customDateTime6.getFormattedDate());
        CustomDateTime customDateTime7 = new CustomDateTime();
        customDateTime7.setHour(25);
        customDateTime7.setMinute(60);
        customDateTime7.setSecond(60);
        System.out.println(customDateTime7.getFormattedDate());
        System.out.println("*****************");
        CustomDateTime customDateTime8 = new CustomDateTime();
        customDateTime8.nextSecond();
        System.out.println(customDateTime8.getFormattedDate());
        CustomDateTime customDateTime9 = new CustomDateTime(2008, 1, 12, 23, 13, 59);
        customDateTime9.nextSecond();
        System.out.println(customDateTime9.getFormattedDate());
        CustomDateTime customDateTime10 = new CustomDateTime(2008, 1, 12, 22, 59, 59);
        customDateTime10.nextSecond();
        System.out.println(customDateTime10.getFormattedDate());
        CustomDateTime customDateTime11 = new CustomDateTime(2008, 1, 12, 23, 59, 59);
        customDateTime11.nextSecond();
        System.out.println(customDateTime11.getFormattedDate());
        System.out.println("*****************");
        CustomDateTime customDateTime12 = new CustomDateTime(2008, 1, 12, 22, 59, 59);
        customDateTime12.nextMinute();
        System.out.println(customDateTime12.getFormattedDate());
        CustomDateTime customDateTime13 = new CustomDateTime(2008, 1, 12, 23, 59, 59);
        customDateTime13.nextMinute();
        System.out.println(customDateTime13.getFormattedDate());
        System.out.println("*****************");
        CustomDateTime customDateTime14 = new CustomDateTime(2008, 1, 12, 23, 59, 59);
        customDateTime14.nextHour();
        System.out.println(customDateTime14.getFormattedDate());
        CustomDateTimeExt customDateTimeExt = new CustomDateTimeExt();
        System.out.println("*****************");
        System.out.println(customDateTimeExt.getFormattedDate());
    }
}
