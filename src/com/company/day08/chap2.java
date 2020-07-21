package com.company.day08;

public class chap2 {
    public void chap2(){
        int num = 0;

        System.out.println(((num > 0) ? "양수" : ((num < 0) ? "음수" : "0")));

        num = 10;
        System.out.println(((num > 0) ? "양수" : ((num < 0) ? "음수" : "0")));

        num = -10;
        System.out.println(((num > 0) ? "양수" : ((num < 0) ? "음수" : "0")));
    }
}
