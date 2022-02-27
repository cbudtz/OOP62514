package com.company;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    public boolean getFilled(){
        System.out.println("Getting filled status of com.company.Circle");
        return super.getFilled();
    }

    Circle(Color color, double radius){
        super(color); //Skal invokes først!
        this.radius=radius;
    }

    public boolean equals(Object obj){
        if (this == obj) {return true;}
        if (obj instanceof Circle){
            Circle circleObj = (Circle) obj;
            return this.color.equals(circleObj.color)
                    && this.radius==circleObj.radius
                    && this.filled == circleObj.filled;
        } else {
            return false;
        }
    }

}
