package com.company.day14;

public class chap6 {
    public static void main(){
            int [][] score = {
                    {100,100,100},
                    {20,20,20},
                    {30,30,30},
                    {40,40,40},
                    {50,50,50}
            };

            for(int index = 0; index < score.length; index++){
                for(int jdex = 0; jdex < score[index].length; jdex++){
                    System.out.println("Score" + index + " " + jdex + "\t" + score[index][jdex]);
                }
        }
    }
}
