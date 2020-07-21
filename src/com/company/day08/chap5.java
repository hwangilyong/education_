package com.company.day08;

public class chap5 {
    public void main(){
        int num = 456;
        System.out.println((num < 100) ? num : (num - num%100));

        num = 99;
        System.out.println((num < 100) ? num : (num - num%100));

        num = 112;
        System.out.println((num < 100) ? num : (num - num%100));
    }
}
