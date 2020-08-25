package com.company.day33.chap1;

public class Rect {
    String rectName;
    double rectArea;
    double rectRound;
    int[]  rectLength;

    public Rect(int... rectLength){
        String[] rectNameArr = {"원", "직사각형", "직각삼각형"};

        this.rectLength = rectLength;
        rectName = rectNameArr[rectLength.length - 1];

        setRectArea();
        setRectRound();
        ppp();
    }

    private void setRectArea(){
        if(rectLength.length == 1){
            rectArea = rectLength[0] * rectLength[0] * Math.PI;
        }else{
            rectArea = rectLength[0] * rectLength[1];
            rectArea = (rectLength.length > 2) ? rectArea / 2 : rectArea;
        }
    }

    private void setRectRound(){
        if(rectLength.length == 1){
            rectRound = 2 * rectLength[0] * Math.PI;
        }else{
            for(int length : rectLength)rectRound += length;
            rectRound = (rectLength.length < 3) ? rectRound / 2 : rectRound;
        }
    }

    public void ppp(){
        String ttt = rectName + "\t\t\t" + rectArea + "\t" + rectRound;
        System.out.println(ttt);
    }
}

//Right triangle
//Rectangle
//Circle
