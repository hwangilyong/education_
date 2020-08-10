package com.company.day25;

import com.company.day25.service.Printable;

public class Main {
    public static void main(String args[]){
        Printable colorPrinter = new Printable() {
            private int number;
            @Override
            public void print() {
                System.out.println("익명구현객체1-컬러모드로 인쇄합니다.");
            }

            @Override
            public void copy() {
                System.out.println("익명구현객체1-컬러모드로 복수합니다.");
            }

            @Override
            public void output(int number) {
                if(number > 0 && number <= 20){
                    this.number = number;
                }else{
                    this.number = 0;
                }

                System.out.println("익명구현객체1-컬러모드로 " + this.number + "매를 출력합니다.");
            }
        };

        colorPrinter.print();
        colorPrinter.copy();
        colorPrinter.output(10);
    }
}
