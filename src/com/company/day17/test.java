package com.company.day17;

import java.util.Scanner;

public class test {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int arrInt[] = new int[length];

        for(int index = 0; index < arrInt.length; index++){
            arrInt[index] = scanner.nextInt();
        }


        int sum = 0;
        double avg = 0;
        double persent = 0;
        for(int index = 0; index < arrInt.length; index++){
            sum += arrInt[index];
        }

        avg = (double)sum / arrInt.length;

        int count = 0;
        for(int index = 0; index < arrInt.length; index++){
            if(arrInt[index] >= avg)count++;
        }

        persent = ((double)count / arrInt.length) * 100;

        System.out.printf("%.3f%% \n", persent);

    }
}
