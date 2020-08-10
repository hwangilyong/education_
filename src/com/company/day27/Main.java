package com.company.day27;

import com.company.day23.chap1.SuperMan;
import com.company.day27.chap3.Gogo;
import com.company.day27.chap3.Man;
import com.company.day27.chap3.Superman;
import com.company.day27.chap4.impl;
import com.company.day27.chap4.interface1;
import com.company.day27.chap4.interface3;
import com.company.day27.service.Car;
import com.company.day27.service.KumhoTire;

public class Main {
    public static void main(String args[]){
        interface1 i1 = new impl();
        i1.method1();
        //i1.method2();//자식은 후레자식이기때문에 받은게없어서 부모는 자식의 것을 못쓴다...
        //i1.method3();//이하동문

        System.out.println("-----------------------");
        interface3 i3 = new impl();

        i3.method1();
        i3.method2();
        i3.method3();
    }
}
