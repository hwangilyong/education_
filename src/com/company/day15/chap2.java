package com.company.day15;

public class chap2 {
    public static void main(){
        int integerArr[] = {92, 89, 88, 91, 78, 89, 76, 99, 84, 91};
        int newIntegerArr[] = new int[integerArr.length];

        System.arraycopy(integerArr, 0, newIntegerArr, 0 ,newIntegerArr.length);

        integerArr[0] = 55;

        print(integerArr);
        print(newIntegerArr);

    }

    public static void print(int integerArr[]){
        for(int index = 0; index < integerArr.length; index++){
            System.out.print(integerArr[index] + " ");
        }

        System.out.println();
    }
}
