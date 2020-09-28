package com.company.day36.chap1;

public class Shape {
    private String shapeName;
    private double shapeArea;
    private double shapeBorder;

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public void setShapeArea(){ shapeArea = calcShapeArea(); }
    public void setShapeBorder(){ shapeBorder = calcShapeBorder(); }

    public void ppp(){
        System.out.println(
                  shapeName + "\t"
                + shapeArea + "\t"
                + shapeBorder
        );
    }

    public double calcShapeArea(){return 0;}
    public double calcShapeBorder(){return 0;}
}
