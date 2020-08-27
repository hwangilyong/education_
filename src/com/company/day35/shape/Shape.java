package com.company.day35.shape;

public class Shape {
    private String shapeName;
    private int[] length;
    private double shapeArea;
    private double shapeRound;
    private String ttt;

    private Shape(String shapeName, int[] length){
        this.length = length;
        this.shapeName = shapeName;

        setShapeArea(this.length.length);
        setShapeRound(this.length.length);
        setTtt();
    }

    public Shape(int... length){
        this(new String[]{"원", "직사각형"}[length.length - 1], length);
        System.out.println(ttt);
    }

    private void setShapeArea(int shapelength){
        if(shapelength == 1){
            shapeArea = length[0] * length[0] * Math.PI;
        }else{
            shapeArea = length[0] * length[1];
        }
    }

    private void setShapeRound(int shapelength){
        if(shapelength == 1){
            shapeRound = length[0] * 2 * Math.PI;
        }else{
            shapeRound = (length[0] + length[1]) * 2;
        }
    }

    private void setTtt(){
        ttt = shapeName + "\t" + shapeArea + "\t" + shapeRound;
    }
}
