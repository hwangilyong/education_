package com.company.day14;

public class chap4 {
    public static void main(){
        int integerArr[];
        integerArr = new int[] {83, 90, 87};

        print("총합 : " + getSum(integerArr));
        printArr(integerArr);
        print("제곱의 합 : " + add(integerArr));
    }

    private static void printArr(int intgerArr[]){
        for(int index = 0; index < intgerArr.length; index++)
            System.out.println("add() 메소드에서 scores[" + index +
                    "] --> " + intgerArr[index]
            );
    }

    private static void print(String content){
        System.out.println(content);
    }

    private static int getSquared(int integer){
        return integer * integer;
    }

    private static int getSum(int integerArr[]){
        int sum = 0;
        for(int index = 0; index < integerArr.length; index++){
            sum += integerArr[index];
        }

        return sum;
    }

    private static int add(int integerArr[]){
        int squaredSum = 0;

        for(int index = 0; index < integerArr.length; index++){
            squaredSum += getSquared(integerArr[index]);
        }

        return squaredSum;
    }

    // 실습-4완료



}
