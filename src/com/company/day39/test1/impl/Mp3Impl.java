package com.company.day39.test1.impl;

import com.company.day39.test1.service.Mp3Service;
import com.company.day39.test1.service.PhoneService;

public class Mp3Impl extends PhoneImpl implements Mp3Service, PhoneService {
    @Override
    public void stopMusic() {
        System.out.println("음악을 꺼요");
    }
}
