package com.company.mytest;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        String [] index = {"가위","바위","보"};

        String [][] res = {            //user
                {"비김","패","승"},         //가위
                {"승","비김","패"},         //바위
                {"패","승","비김"}            //보
                //com  가위, 바위, 보
        };



        while(true) {
            System.out.println("<<<<<가위, 바위 , 보>>>>>>");

            System.out.println("0.가위, 1.바위, 2.보 , 9. 종료");

            System.out.print("입력:");

            int user = sc.nextInt();


            if(user == 9)
                break;


            int com = (int)(Math.random()*3);

            System.out.println("게이머:"+index[user]);
            System.out.println("컴퓨터:"+index[com]);

            System.out.println("승패:"+res[user][com]);

        }

        System.out.println("게임 종료");

    }
//    public static void main(String args[]){
//        String[] test = new String[1];
//
//        String[] test1 = test.clone();
//
//        if(test1 == test)System.out.println("test");
//        else System.out.println("now");
//    }
//
//    public void test(){
//        Scanner scanner = new Scanner(System.in);
//        int test = scanner.nextInt();
//
//        int count = 0;
//
//        while(test != 0){
//            count++;
//            test = test/10;
//        }
//        System.out.println(count);
//    }
//
//    public void check(){
//        Scanner scanner = new Scanner(System.in);
//
//        int test = scanner.nextInt();
//
//        int count = 0;
//
//        int check = test;
//        while(check != 0){
//            count++;
//            check = check/10;
//        }
//
//        check = test;
//        int buf = 0;
//        int a , b;
//        System.out.println(test/1000000);
//        System.out.println((test / 10000) % 100);

  //  }
}
