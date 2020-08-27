package com.company.day33.chap2;

public class OverLodingStudent {
    String name;
    String kind;
    int [] jumsu;
    int total, avg;

    void init(String name, int... jumsu){
        this.name = name;
        this.jumsu = jumsu;

        calc();
    }

    void calc(){
        total = 0;

        for(int num : jumsu)total += num;
        avg = total / jumsu.length;
    }

    void ppp(){
        System.out.println(name + "\t" + kind + "\t" + total + "\t" + avg);
    }
}
