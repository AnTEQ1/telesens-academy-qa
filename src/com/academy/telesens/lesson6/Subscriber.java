package com.academy.telesens.lesson6;

import com.academy.telesens.lesson5.exc.Person;

public class Subscriber extends Person {
    private  String phoneNumder;
    private Operator operator;

    public Subscriber() {
    }

    public Subscriber (String firstName,
                       String lastName,
                       int age,
                       String gender,
                       String phoneNumder,
                       Operator operator){
        super(firstName, lastName,age,gender); // конструктор базового класса. Должен быть вызван первым
        //setFirstName(firstName);//первый вариант записи в поле родителя
        this.phoneNumder = phoneNumder;
        this.operator = operator;
    }

    public String getPhoneNumder() {
        return phoneNumder;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setPhoneNumder(String phoneNumder) {
        this.phoneNumder = phoneNumder;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /*public String getProfile(){
        return String.format("Фамилия: %s\n  Имя: %s\n Возраст: %d\n Пол: %d\n Номер телефона: %s\n Оперптор: %s\n",
                firstName,lastName, age, gender,phoneNumder, operator.getName());
    }*/

    public String getProfile(){
        return super.getProfile() + String.format(" Номер телефона: %s\n Оперптор: %s\n",
                phoneNumder, operator.getName());
    }

    public Subscriber withFirstName(String firstName){
       super.firstName = firstName; //должен быть protected
        return this;
    }

    public Subscriber withFLastName(String lastNameName){
        super.lastName = lastName; //должен быть protected
        return this;
    }

    public Subscriber withAge(int age){
        super.age = age; //должен быть protected
        return this;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumder='" + phoneNumder + '\'' +
                ", operator=" + operator +
                '}';
    }
}
