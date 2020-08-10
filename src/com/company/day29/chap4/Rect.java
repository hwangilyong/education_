package com.company.day29.chap4;

public class Rect extends Shape{
    double width;
    double height;

    Rect(double width, double height){
        this(new Point(0, 0), width, height);
    }

    Rect(Point p, double width, double height){
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare(){
        return width * height != 0 && width == height;
    }

    double calcArea(){
        return width * height;
    }
}
