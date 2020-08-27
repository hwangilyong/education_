package com.company.day33.chap3;

public class Chap {
    public void main(){
        ShapeArr shapeArr = new ShapeArr();

        Shape[] shapes = new Shape[]{
                shapeArr.makeShpae(3),
                shapeArr.makeShpae(3,4),
                shapeArr.makeShpae(3,4,5),
        };

        for(Shape shape : shapes)shape.ppp();
    }
}
