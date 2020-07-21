package com.company.day09;

public class chap4 {
    public void main(){
        int grade = (int)(Math.random() * 4) + 1;
        int labtime = 0;

        System.out.println(grade);

        switch(grade){
            case 1 : labtime = 3;   break;
            case 2 : labtime = 12;  break;
            case 3 : labtime = 18;  break;
            case 4 : labtime = 24;  break;
            default: labtime = 0;   break;
        }

        System.out.println("LAB TIME : " + labtime);
    }
}
