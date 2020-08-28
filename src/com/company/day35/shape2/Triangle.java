package com.company.day35.shape2;

public class Triangle extends Shape{
    private int width;
    private int height;
    private int bit;

    public Triangle(int width, int height, int bit){
        super("직각삼각형");
        this.width = width;
        this.height = height;
        this.bit = bit;

        getShapeArea();
        getShapeBorder();
    }

    private void getShapeArea(){
        shapeArea = width * height / 2;
    }

    private void getShapeBorder(){
        shapeBorder = width + height + bit;
    }
}
