package com.company.day32.chap1;

public class Chap {
    public void main(){
//        Shape shape = new Shape();
//
//        shape.setShapeName("직사각형");
//        shape.shapeArea(3,4);

        Shape[] shapes = new Shape[3];

        for(int index = 0; index < shapes.length; index++)
            shapes[index] = new Shape();

        shapes[0].setShapeName("직사각형");
        //System.out.println("------" + shapes[0].getShapeName());
        shapes[1].setShapeName("직각삼각형");
        shapes[2].setShapeName("원");

        shapes[0].shapeArea(3,4);
        shapes[1].shapeArea(4,5);
        shapes[2].shapeArea(3);


        //System.out.println("------" + shapes[0].getShapeName());

        MakeShape makeShape = new MakeShape();
        makeShape.setMakeShapes(shapes);

        makeShape.insertShape("직사각형", 5,6);

        makeShape.sort();

        Shape[] result = makeShape.getMakeShapes().clone();

        for(Shape temp : result)System.out.println(temp.getShapeName());
//        result[0].getShapeName();
        for(int index = 0; index < result.length; index++){
            String ttt = "";

            ttt += result[index].getShapeName() + "\t\t\t"
                    + result[index].getShapeRound() + "\t\t\t" + result[index].getShapeArea() + "\t" + (index + 1);

            System.out.println(ttt);
        }
    }
}
