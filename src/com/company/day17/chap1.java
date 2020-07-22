package com.company.day17;

public class chap1 {
    public static void main(){
        Car car = new Car("BLACK", 123);
    }
}

class Car{

    Car(String color, int cc){
        System.out.println("color : " + color);
        System.out.println("CC : " + cc);
    }
}
