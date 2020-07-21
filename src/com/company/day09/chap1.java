package com.company.day09;

public class chap1 {
    public void main(){
        int num = (int)(Math.random() * 6) + 1;
        int[] lottoArray = new int[6];

        if(1 == num)System.out.println("1");
        else if(2 == num)System.out.println("2");
        else if(3 == num)System.out.println("3");
        else if(4 == num)System.out.println("4");
        else if(5 == num)System.out.println("5");
        else System.out.println("6");



    }
}
