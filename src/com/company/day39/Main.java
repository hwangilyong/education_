package com.company.day39;

import com.company.day39.test1.impl.HandPhoneImpl;
import com.company.day39.test1.service.HandPhoneService;

public class Main {
    public static void main(String args[]){
        HandPhoneService handPhoneService = new HandPhoneImpl();

        handPhoneService.listen();
        handPhoneService.picture("암거나");
        handPhoneService.printPicture();
        handPhoneService.speak();
        handPhoneService.stopMusic();
    }
}
