package com.company.day21;

import com.company.day21.chap3.Car;
import com.company.day21.chap3.SportsCar;

public class Chap3 {
    public void main(){
        SportsCar c1 = new SportsCar();
        c1.setSelect(1);
        c1.run();

        c1.setSelect(2);
        c1.run();
    }
}
