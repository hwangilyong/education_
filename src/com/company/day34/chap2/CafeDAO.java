package com.company.day34.chap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeDAO {
    List<CafeVO> cafeVOList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    private CafeVO join(){
        CafeVO cafeVO = new CafeVO();

        System.out.print("주문할 카페 종류 :");
        cafeVO.setName(sc.nextLine()); //name라는 변수에 담아둔다
        System.out.print("가격 :");
        cafeVO.setPrice(sc.nextInt());
        System.out.print("주문한 커피 잔 수 :");
        cafeVO.setCount(sc.nextInt());

        cafeVO.setTtt();

        return cafeVO;
    }

    public void order(){
        String isQuit="";
        while(isQuit.intern()!="q"){
            System.out.println("========================[주문와료시(종료는 q)]========================");

            addOrder(join());

            sc.nextLine();
            //엔터 상쇄
            System.out.print("나가기는 q");
            isQuit=sc.nextLine();

            if (isQuit.equals("q"))
                break;
        }
    }

    public void addOrder(CafeVO cafeVO){
        cafeVOList.add(cafeVO);
    }

    public void showAllOrder(){
        for(int index = 0; index < cafeVOList.size(); index++){
            System.out.println(cafeVOList.get(index).getTtt());
        }
    }
}
