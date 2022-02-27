package com.company;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle(Color.RED,10.0);
        shape[1] = new Rectangle(Color.RED,10.0, 20.0);
    }
}
