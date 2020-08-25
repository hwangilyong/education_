package com.company.day31.chap2;

public class Student {
    String name;
    int [] jumsu;
    int total, avg;
    int rank = 1;

    void init(String name, int kor, int eng, int math){
        this.name = name;
        jumsu = new int[]{kor, eng, math};
        total = jumsu[0] + jumsu[1] + jumsu[2];
        avg = total / jumsu.length;

        calc();
    }

    void calc(){

    }
}
