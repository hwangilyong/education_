package com.company.day29.chap4;

public class Main {
    public  double sumArea(Shape[] arr){
        double sum = 0;

        for(int index = 0; index < arr.length; index++){
            sum += arr[index].calcArea();
        }

        return sum;
    }

    public  void main(){
        Shape[] arr = {new Circle(5.0), new Rect(3, 4), new Circle(1)};

        System.out.println("면적의 합 : " + sumArea(arr));
    }
}
