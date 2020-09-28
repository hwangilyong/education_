package com.company.day36.chap1;

public class Rect extends Shape{
    private int width, height;

    public Rect(int width, int height){
        super("직사각형");
        this.width = width;
        this.height = height;

        setShapeArea();
        setShapeBorder();
    }

    @Override
    public double calcShapeArea(){
        return width * height;
    }

    @Override
    public double calcShapeBorder(){
        return (width + height) * 2;
    }
}
