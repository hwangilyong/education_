package com.company.day14;

public class chap1 {
    public static void main(){
        int scoreArr[];
        scoreArr = new int[]{92, 89, 88, 91, 78, 89, 76, 99, 84, 91};

        int sum = 0;
        for(int index = 0; index < scoreArr.length; index++){
            sum += scoreArr[index];

            if(index%2 == 1)
                System.out.println(index + "번째 " + scoreArr[index]);
        }

        double avgVal = (double)sum / scoreArr.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avgVal);
    }
}
