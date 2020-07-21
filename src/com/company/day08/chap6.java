package com.company.day08;

public class chap6 {
    public void main(){
        int num = 333;

        System.out.println((num%10 != 1) ? num/10 * 10 + 1 : num);

        num = 1;
        System.out.println((num%10 != 1) ? num/10 * 10 + 1 : num);

        num = 3;
        System.out.println((num%10 != 1) ? num/10 * 10 + 1 : num);

        num = 13;
        System.out.println((num%10 != 1) ? num/10 * 10 + 1 : num);
    }
}
