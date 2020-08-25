package com.company.day32.chap1;

public class Shape {
    private String shapeName = "";
    private double shapeArea;
    private double shapeRound;

    public String getShapeName(){
        return shapeName;
    }

    public void setShapeName(String shapeName){
        this.shapeName = shapeName;
    }

    public double getShapeArea(){
        return shapeArea;
    }

    public double getShapeRound(){
        return shapeRound;
    }

    public void shapeArea(int ...shapeLength){
        if(shapeName.equals("직사각형")){
            shapeArea = shapeLength[0] * shapeLength[1];
            shapeRound = (shapeLength[0] + shapeLength[1]) * 2;
        }else if(shapeName.equals("원")){
            shapeArea = shapeLength[0] * shapeLength[0];
            shapeRound = shapeLength[0] * 2 * Math.PI;
        }else{
            shapeArea = (shapeLength[0] * shapeLength[1]) / 2;
            shapeRound = shapeLength[0] + shapeLength[1]
                    + Math.sqrt(shapeLength[0] * shapeLength[0] + shapeLength[1] * shapeLength[1]);
        }
    }


    public String print() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                ", shapeArea=" + shapeArea +
                ", shapeRound=" + shapeRound +
                '}';
    }

}
