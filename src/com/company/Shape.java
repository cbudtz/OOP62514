package com.company;

import java.awt.*;

public abstract class Shape {
    protected Color color; // Can only be accessed by self
    protected boolean filled; //Can be accessed by subclasses
    public boolean getFilled(){
        return filled;
    }


    public Shape(Color color) {
        this.color = color;
    }

}
