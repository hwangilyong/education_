package com.company.day39.test1.impl;

import com.company.day39.test1.service.PhoneService;

public class PhoneImpl implements PhoneService {
    @Override
    public void listen() {
        System.out.println("소리를 들어요");
    }

    @Override
    public void speak() {
        System.out.println("말해요");
    }
}
