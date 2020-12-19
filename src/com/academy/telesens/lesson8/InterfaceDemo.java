package com.academy.telesens.lesson8;


import com.academy.telesens.lesson6.exc.Button;
import com.academy.telesens.lesson6.exc.Component;
import com.academy.telesens.lesson6.exc.Label;

public class InterfaceDemo {
    public static void main(String[] args) {
        Button button = new Button("Login");
        Component button2 = new Button("Login");
        VisualComponent button3 = new Button("Login");
        VisualComponent label = new Label("First Name");

        button3.draw();
    }

}
