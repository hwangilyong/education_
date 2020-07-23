package com.company.day18;

public class chap3 {
    public int method(int x, int y){return x + y;}
    public double method(double x, double y){return x + y;}

    public void main(){
        chap3 chap = new chap3();

        System.out.println(chap.method(10, 20));
        System.out.println(chap.method(10.5, 20.1));
    }
}

