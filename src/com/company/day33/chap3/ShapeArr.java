package com.company.day33.chap3;

public class ShapeArr {
    Shape makeShpae(int radius){
        Shape shape = new Shape();

        shape.init(radius);
        shape.shapeName = "원";
        
        return shape;
    }

    Shape makeShpae(int width, int height){
        Shape shape = new Shape();

        shape.init(width, height);
        shape.shapeName = "직사각형";

        return shape;
    }

    Shape makeShpae(int width, int height, int hypo){
        Shape shape = new Shape();

        shape.init(width, height, hypo);
        shape.shapeName = "직각삼각형";

        return shape;
    }
}
