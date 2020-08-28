package com.company.day35.shape2;

public class Rect extends Shape{
    private int width;
    private int height;

    public Rect(int width, int height){
        super("직사각형");
        this.width = width;
        this.height = height;

        getShapeArea();
        getShapeBorder();
    }

    private void getShapeArea(){
        shapeArea = width * height;
    }

    private void getShapeBorder(){
        shapeBorder = (width + height)  * 2;
    }
}
