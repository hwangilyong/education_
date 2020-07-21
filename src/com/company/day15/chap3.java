package com.company.day15;

public class chap3 {
    public static void main(){
        int[] arr = {20, 100, 50, 90, 10, 80, 30, 40, 60, 77};

        int temp = 0;
        int minIndex = 0;

        for(int index = 0; index < arr.length - 1; index++){
            minIndex = index + 1;
            for(int jdex = index; jdex < arr.length;jdex++){
                if(arr[minIndex] > arr[jdex])minIndex = jdex;
            }

            temp = arr[index];
            arr[index] = arr[minIndex];
            arr[minIndex] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr){
        for(int index = 0; index < arr.length;index++){
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }
}
