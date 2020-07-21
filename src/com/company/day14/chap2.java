package com.company.day14;

public class chap2 {

    public static void main(){
        int[] test = {3};
        checkAddr(test);
        System.out.println(test[0]);
       // Test test = new Test();
        //refCheckAddr(test);
        //System.out.println(test);
        //System.out.println(test.test);

    }

    public static void checkAddr(int[] test){
        test[0] = 6;
        System.out.println(test);
    }

    public static void refCheckAddr(Test test){
        System.out.println("TEST METHOD" + test);
        test.test = 3;
    }
}
