package com.company.day31.chap1.service.impl;

import com.company.day31.chap1.service.Friend;

public class FriendImpl implements Friend{
    public String name;

    public FriendImpl(String name){
        super();
        this.name = name;
    }

    @Override
    public void play(String where) {
        System.out.println(where + "논다.");
    }

    @Override
    public void game(String what) {
        System.out.println(what + "게임한다.");
    }
}
