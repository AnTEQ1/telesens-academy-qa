package com.academy.telesens.lesson6.ht;

import com.academy.telesens.lesson5.ht.CustomDate;
/*1) Реализовать класс CustomDateTime, который наследуется от класса CustomDate.
*        Поля (все поля private):
*        /- hour (часы)
*        /- minute (минута)
*        /- second (секунда)
*
*        Конструкторы:
*        /- CustomDateTime() - по умолчанию
*        /- CustomDateTime(int year, int month, int day, int hour, int minute, int second) со всеми параметрами
*        /- CustomDateTime(CustomDateTime dateTime)копирования
*
*        Методы:
*        /- set (для каждого поля)
*        /- get (для каждого поля)
*
*        /getFormattedDate() (переопределить из базового класса)
*        /который отображает время и дату: 25.01.2017 15:05:35
*
*        /getFormattedDate(boolean isTimeFormat12)
*        /который отображает время и дату в зависимости от флага isTimeFormat12:
*        /25.01.2017 3:05 p.m.  // isTimeFormat12 is true
*        /25.01.2017 15:05  	  // isTimeFormat12 is false
*
*        Переопределить методы:
*        toString // отображает дату и время 25.01.2017 15:05:35
*        equals
*        hashCode
*
*        - реализовать метод validate(), который проверяет существование введенного времени
*
*        - использовать метод validate(...)
*        при попытке изменть инициализировать класс с помощью конструктора
*        или при попытке модифицировать поля с помощью методов set
*
*        - реализовать методы
*        nextSecond();
*        nextMinute();
*        nextHour();
*        которые увелечивают на единицу значение секунды, минуты и часа соответственно, при чем если кол-во часов достигается
*        24, то должно увеличиться на единицу значение поля day из базового класса
*
*        -* реализовать метод addSeconds(int seconds), который добавляет указанное кол-во секунд к текущей дате
*
*
*        2) Реализовать класс CustomDateTimeExt, который наследуется от класса CustomDateTime
*        Доп поля (private):
*        int ms миллисекунды
*
*        Конструкторы:
*        CustomDateTimeExt() - по умолчанию
*        CustomDateTimeExt(int year, int month, int day, int hour, int minute, int second, int ms) со всеми параметрами
*        CustomDateTimeExt(CustomDateTimeExt customDateTimeExt)копирования
*
*        Методы:
*        set
*        get
*
*        toString
*        equals
*        hashCode
*        getFormattedDate() // 25.01.2017 15:05:35.357
*
*        2) Протестировать классы Date, DateTime и DateTimeExt:
*        - все конструкторы
*        - метод toString()
*        - метод equals()
*      - все методы next...()
*      - validate()
*
 */
public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;

    public CustomDateTime(){
        this.hour = 23;
        this.minute = 25;
        this.second = 38;
    }

    public CustomDateTime(int year, int month, int day, int hour, int minute, int second){
        super(day,month,year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomDateTime (CustomDateTime customDateTime) {
        super(customDateTime.getYear(), customDateTime.getMonth(), customDateTime.getDay());
        this.hour = customDateTime.hour;
        this.minute = customDateTime.minute;
        this.second = customDateTime.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String getFormattedDate() {
        return super.getFormattedDate() + String.format(" %02d:%02d:%02d",hour,minute,second);
    }

    public String getFormattedDate(boolean isTimeFormat12){
        String timeType = "";
        if (isTimeFormat12){
            if (hour == 24 || (hour >= 1 && hour <= 11)) {
                timeType = "a.m.";
            }
            if (hour >= 12 && hour <= 23){
                timeType = "p.m.";
            }
            switch (hour){
                case 13: this.hour = 1;
                break;
                case 14: this.hour = 2;
                break;
                case 15: this.hour = 3;
                break;
                case 16: this.hour = 4;
                break;
                case 17: this.hour = 5;
                break;
                case 18: this.hour = 6;
                break;
                case 19: this.hour = 7;
                break;
                case 20: this.hour = 8;
                break;
                case 21: this.hour = 9;
                break;
                case 22: this.hour = 10;
                break;
                case 23: this.hour = 11;
                break;
                case 24: this.hour = 12;
                    break;
                default:
                    break;
            }
            return super.getFormattedDate() + String.format(" %02d:%02d:%02d %s",hour,minute,second, timeType);
        } else {
            return super.getFormattedDate() + String.format(" %02d:%02d:%02d",hour,minute,second);
        }
    }
}
