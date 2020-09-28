package com.company.day36.chap1;

public class ShapeMain {
    public void main(){
        Shape[] shape = new Shape[]{
                new Rect(3,2),
                new Rect(4,5),
        };

        for(Shape temp : shape){
            temp.ppp();
        }
    }
}
