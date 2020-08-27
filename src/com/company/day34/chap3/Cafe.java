package com.company.day34.chap3;

public class Cafe {
    Order[] orders = new Order[0];
    int totalPrice = 0;

    private void addOrder(String name, int amount){
        Order[] buffer = new Order[orders.length + 1];

        for(int index = 0; index < orders.length; index++){
            buffer[index] = orders[index];
        }

        buffer[orders.length].setCoffees(name, amount);
        orders = buffer;
    }

    private void getTotalPrice(){
        for(int index = 0; index < orders.length; index++){
            //for(int jdex = 0; jdex < orders[index].coffees[index])
        }
    }
}
