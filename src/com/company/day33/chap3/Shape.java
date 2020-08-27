package com.company.day33.chap3;

public class Shape {
    String shapeName;
    int [] shapeLength;
    double shapeArea;
    double shapeRound;

    public void init(int... shapeLength){
        this.shapeLength = shapeLength;

        switch(shapeLength.length){
            case 1 : circleCalc();   break;
            case 2 : rectCalc();     break;
            case 3 : triangleCalc(); break;
            default: System.out.println("오류"); return;
        }
    }

    public void circleCalc(){
        shapeRound = 2 * shapeLength[0] * Math.PI;
        shapeArea = shapeLength[0] * shapeLength[0] * Math.PI;
    }

    public void rectCalc(){
        shapeRound = 2 * (shapeLength[0] + shapeLength[1]);
        shapeArea = shapeLength[0] * shapeLength[1];
    }

    public void triangleCalc(){
        for(int length : shapeLength) shapeRound += length;
        shapeArea = shapeLength[0] * shapeLength[1] / 2;
    }

    public void ppp(){
        System.out.println(shapeName + "\t" + shapeRound + "\t" + shapeArea);
    }
}
