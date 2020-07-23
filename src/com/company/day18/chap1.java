package com.company.day18;

public class chap1 {
    public void main(){
        excute();
    }

    private int plus(int x, int y){
        return x + y;
    }

    private double avg(int x, int y){
        double sum = plus(x, y);
        double result = sum / 2;

        return result;
    }

    public void excute(){
        double result = avg(7 ,10);
        println("RESULT : " + result);
    }

    private void println(String msg){
        System.out.println(msg);
    }
}
