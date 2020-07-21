package com.company.day14;

public class chap7 {
    public static void main(){
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;
        for(int index = 0; index < array.length; index++){
            for(int jdex = 0; jdex < array[index].length; jdex++){
                sum += array[index][jdex];
                count++;
            }
        }

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (float)sum / count);
    }
}
