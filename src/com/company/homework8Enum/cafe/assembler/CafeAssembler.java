package com.company.homework8Enum.cafe.assembler;

import com.company.homework.cafe.Cafe;
import com.company.homework8Enum.cafe.entity.CafeMenu;
import com.company.homework8Enum.cafe.entity.Reset;

import java.util.Scanner;

public class CafeAssembler {
    public void assembler(){
        //test();

        while(true){
            System.out.println("1.주문 2.결제 3.종료 4.총 내역");

            Scanner scanner = new Scanner(System.in);
            int cmd = scanner.nextInt();

            switch(cmd){
                case 1 :
                    order();
                    break;
                case 2 :
                    currentPpp();
                    break;
                case 3:
                    break;
                case 4:
                    ppp();
                    break;
                default:
                    break;

            }
        }
        //cafeMenu1.ppp();

    }

    public void order(){
        CafeMenu[] menus = CafeMenu.values();
        System.out.println("메뉴");

        for(CafeMenu menu : menus)System.out.print(menu + " ");
        System.out.println();

        boolean flag = true;

        while(flag){
            Scanner scanner = new Scanner(System.in);
            System.out.println("주문");

            try{
                String order = scanner.nextLine();
                System.out.println("몇잔");

                int coffeeCount = Integer.parseInt(scanner.nextLine());

                CafeMenu.valueOf(order.toUpperCase()).add(coffeeCount);
            }catch(Exception e){
                System.out.println("잘못 입력");
            }

            flag = false;
        }

    }

    public void test(){
        CafeMenu cafeMenu = CafeMenu.AMERICANO;

        CafeMenu cafeMenu1 = CafeMenu.AMERICANO;
        CafeMenu.valueOf("AMERICANO").add(3);
        System.out.println(CafeMenu.valueOf("").getCoffeePrice());
        System.out.println(CafeMenu.valueOf("AMERICANO").getCoffeeCount());
    }

    public void ppp(){
        for(CafeMenu cafeMenu : CafeMenu.values()){
            cafeMenu.ppp();
        }
    }

    public void currentPpp(){
        for(CafeMenu cafeMenu : CafeMenu.values()){
            cafeMenu.printCurrentPrice();
        }
    }
}
