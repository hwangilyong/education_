package com.company.day39.test1.impl;

import com.company.day39.test1.service.HandPhoneService;
import com.company.day39.test1.service.Mp3Service;

public class HandPhoneImpl extends Mp3Impl implements HandPhoneService {
    @Override
    public void picture(String fileName) {
        System.out.println("사진을 찍어요");
    }

    @Override
    public void printPicture() {
        System.out.println("사진을 봐요");
    }
}
