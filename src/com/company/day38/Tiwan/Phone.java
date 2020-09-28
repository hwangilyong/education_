package com.company.day38.Tiwan;

import com.company.day38.Samsung.Part;
import com.company.day38.Samsung.SmartPhone;

public class Phone extends SmartPhone {
    private Part part = getPart();

    @Override
    public void takePicture(){
        System.out.println("사진을 찍는다");
        part.setBattery(part.getBattery() - part.getCamera());
        checkBattery();
    }

    @Override
    public void calling(){
        System.out.println("전화를 한다.");
        part.setBattery(part.getBattery() - part.getCamera() -
                part.getMic() - part.getInternet());
        checkBattery();
    }
}
