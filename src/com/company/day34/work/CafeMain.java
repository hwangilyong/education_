package com.company.day34.work;

public class CafeMain {
    public void main(){
        Cafe aCafe = new Cafe();
        Cafe bCafe = new Cafe();

        System.out.println("A 카페");
        aCafe.setCoffees("아메리카노",3);
        aCafe.setCoffees("카라멜마끼",3);
        aCafe.showInfo();

        System.out.println();

        System.out.println("B 카페");
        bCafe.setCoffees("아메리카노",3);
        bCafe.setCoffees("카라멜마끼",3);
        bCafe.setCoffees("카푸치노", 50);
        bCafe.showInfo();
    }
}
