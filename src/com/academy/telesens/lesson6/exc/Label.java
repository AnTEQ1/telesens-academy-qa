package com.academy.telesens.lesson6.exc;

public class Label  extends Component{
    @Override
    public void draw() {
        System.out.println("Draw Label");
    }
    public Label (String text) {
        super(text);
    }
}
