package com.company.day34.chap2;

public class CafeVO {
    private String name;
    private int price;
    private int sumPrice;
    private int count;
    private String ttt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSumPrice() {
        this.sumPrice = price * count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTtt(){
        setSumPrice();
        this.ttt = name + "\t" +"가격 : "+ price + "\t" + "수량:"+ count +"\t주문한 커피 총액 :" + sumPrice;
    }

    public String getTtt(){
        return ttt;
    }
}
