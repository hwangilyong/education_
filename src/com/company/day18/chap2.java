package com.company.day18;

public class chap2 {
    public void main(){
        chap2 chap = new chap2();
        chap.method1(1);
        chap.method2("하나", "둘");
    }

    public void method1(int num){
        System.out.println("method 1 : " + num);
    }

    public int method2(String xnum, String ynum){
        System.out.println("method2 XNUM : " + xnum);
        System.out.println("method2 YNUM : " + ynum);

        return 0;
    }
}
