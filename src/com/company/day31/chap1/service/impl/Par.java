package com.company.day31.chap1.service.impl;

import com.company.day31.chap1.service.Mom;

public class Par extends Grand implements Mom {
    public Par(String name){
        super(name);
    }

    public void bob(){
        System.out.println(name + "밥먹어여");
    }
}
