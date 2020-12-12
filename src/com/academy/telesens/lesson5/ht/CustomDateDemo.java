package com.academy.telesens.lesson5.ht;

import java.util.Random;

public class CustomDateDemo {
    public static void main (String[] args){
        CustomDate customDate = new CustomDate(30,1,2020);
        System.out.println(customDate.getFormattedDate(customDate));
        System.out.println(CustomDate.validate(29,2,1600));

        CustomDate[] customDatesArray = new CustomDate[10];
        Random random = new Random();
        int day;
        int month;
        int year;
        boolean result;
        for (int i = 0; i<customDatesArray.length; i++){
            day = random.nextInt(31);
            month = random.nextInt(12);
            year = random.nextInt(9999);
            result = CustomDate.validate(day,month,year);
            if (result){
                customDatesArray[i] = new CustomDate(day,month,year);
            }
            System.out.println(customDate.getFormattedDate(customDatesArray[i]));
        }
    }
}
