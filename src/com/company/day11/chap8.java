package com.company.day11;

public class chap8 {
    public static void main(){

        while(true){
            int firDice = (int)(Math.random() * 6) + 1;
            int secDice = (int)(Math.random() * 6) + 1;

            System.out.println("(" + firDice + "," + secDice + ")");
            if((firDice + secDice) == 5)break;
        }

        System.out.println("EXIT");
    }
}
