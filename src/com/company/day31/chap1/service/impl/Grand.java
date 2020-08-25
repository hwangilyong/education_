package com.company.day31.chap1.service.impl;

import com.company.day31.chap1.service.Teacher;

public class Grand implements Teacher {
    public String name;

    public Grand(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println(name + "안녕하세여");
    }

    @Override
    public void study() {
        System.out.println(name + "공부해여");
    }
}
