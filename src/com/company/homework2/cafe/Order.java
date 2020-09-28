package com.company.homework2.cafe;

public class Order {
    private int orderCount;
    private String orderName;

    public Order(String orderName, int orderCount){
        this.orderCount = orderCount;
        this.orderName = orderName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public String getOrderName(){
        return orderName;
    }
}
