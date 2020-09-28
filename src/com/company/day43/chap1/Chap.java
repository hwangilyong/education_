package com.company.day43.chap1;

import java.util.ArrayList;
import java.util.List;

enum China{
    ZZAJANG, ZZAMBBONG, TANGSU  //고정값임 (상수)
    //짜장,     짬뽕      탕수육
}

enum Korea{

    KIMCHI,      BIBIMBAB("비빔밥",6000), SamgeubSar("삼겹살",13000);  ///세미콜론을 반드시 쳐서 항목과 정의부를 분리한다.
    //기본생성자      생성자2

    String name;
    int price, cnt;

    Korea(){   //기본생성자
        //name = "김치";
        price = 3000;
    }

    Korea(String name, int price){   //생성자2
        this.name = name;
        this.price = price;
    }

    void add() {
        cnt++;
    }

    void ppp() {
        System.out.println(name+":"+price+"("+cnt+")");
    }
}


class Rest{
    Korea kim = Korea.KIMCHI;
}

class GS25{
    Korea kim = Korea.KIMCHI;
}

public class Chap {

    public static void main(String[] args) {


        //China c1 = "ZZAJANG";
        //China c1 = ZZAJANG;
        China c1 = China.ZZAJANG;
        China c2 = China.TANGSU;
        //China c3 = China.KIMCHI;  추가, 수정, 삭제 등 변경 불가

        System.out.println(c1+","+c1.ordinal());
        System.out.println(c2+","+c2.ordinal());

        System.out.println("--------------------");

        System.out.println(China.values());

        for (China ch : China.values()) {
            System.out.println(ch+","+ch.ordinal());
        }

        System.out.println("--------------------");

        China cc = China.valueOf("ZZAMBBONG");
        System.out.println(cc+","+cc.ordinal());


        System.out.println("Korea--------------------");
        Korea k1 = Korea.KIMCHI;
        k1.price = 2700;
        k1.name = "김치";
        k1.cnt++;

        System.out.println("k1 >>>");
        System.out.println(k1);
        k1.ppp();

        List list = new ArrayList();

        System.out.println("k2 >>>");
        Korea k2 = Korea.KIMCHI;
        k2.cnt++;
        k2.ppp();

        System.out.println("kk >>>");
        Korea kk = Korea.valueOf("KIMCHI");
        kk.cnt++;
        kk.ppp();

        System.out.println("add >>>");
        Korea.valueOf("KIMCHI").add();
        kk.ppp();


        Rest rr = new Rest();
        rr.kim.add();
        rr.kim.ppp();

        GS25 gs = new GS25();
        gs.kim.add();
        gs.kim.ppp();

        Korea.BIBIMBAB.ppp();
    }



}
