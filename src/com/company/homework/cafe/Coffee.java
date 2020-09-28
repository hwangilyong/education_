package com.company.homework.cafe;

public class Coffee{
    public String coffeeName = "";
    public int price = 0;
    public int orderCount = 0;
    public Beans[] beans;
    public int ranking = 0;
    int totalPrice = 0;

    public void calcBeans(){
        for(int index = 0; index < beans.length; index++){
            beans[index].totalUsage = beans[index].beansUsage * orderCount;
        }
    }

    public void calc(){
        totalPrice = price * orderCount;
    }

    public void ppp(){
        String ttt = coffeeName + "\t" + orderCount + "\t" + totalPrice;
        System.out.println(ttt);
    }
}
