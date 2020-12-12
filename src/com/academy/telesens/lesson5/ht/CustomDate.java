package com.academy.telesens.lesson5.ht;

/*
 * 1) Создать класс CustomDate, который имеет следующие поля:
 *		/- день
 *		/- месяц
 *		/- год
 *
 *	Все поля должны быть помечены модификатором private
 *		/- реализовать доступ к полям через методы set и get
 *		/- реализовть public метод getFormattedDate(); который вернет дату в отформатированном виде, напр. 21.12.2018 (или 21.12.2018 пятница)
 *		/-* реализовать статический метод validate(int day, int month, int year), который проверяет существование введенной даты
 *		/и выводит true/false (учитывать высокосный год)
 *
 *		-* использовать проверку validate, при попытке изменить поле методом set, в случае ошибки не проводить изменение,
 *			а вывести сообщение об ошибке на консоль
 *		-** реализовать статический метод dayOfWeek(int day, int month, int year), который принимает другую дату и вычисляет день недели.
 *           Этот метод может возвращать, напр. для
 *			понедельника - 0
 *			вторника - 1
 *			и т.д.
 *		- проверить работу методов:
 *			getFormattedDate()
 *			validate()
 *			dayOfWeek()
 *
 * 2) Создать массив размера 10, состоящий из классов CustomDate
 *	- наполнить массив случайными значениями действительных дат
 *	- вывести все даты массива на консоль
 *	- вывести только даты месяца февраль
 *	- *вывести только даты понедельника
 */

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public static boolean validate(int day, int month, int year) {
        if (year >= 1 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if (month % 2 != 0 && (day >= 1 && day <= 31)) {
                    return true;
                } else if (month % 2 == 0 && (day >= 1 && day <= 30)) {
                    if (month == 2 && day <= 28) {
                        return true;
                    } else if (month == 2 && day <= 29) {
                        int firstCheck = year % 4;
                        int secondCheck = year % 100;
                        int thirdCheck = year % 400;
                        if (firstCheck == 0 || (secondCheck != 0 && thirdCheck == 0)) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFormattedDate(CustomDate customDate) {
            return String.format("%02d.%02d.%02d", customDate.getDay(), customDate.getMonth(), customDate.getYear());

    }
}
