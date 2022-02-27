package com.company;

import java.awt.*;

public class Rectangle extends Shape {
    private final double height;
    private final double width;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }
}
