package com.company.day46Collection.chap1;

import java.util.ArrayList;
import java.util.List;

public class Chap {
    public void main(){
        List list = new ArrayList<>();

        for(Object object : "박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준".split(",")){
            list.add(object);
        }

        List list2 = new ArrayList<>();

        for(Object object : "박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준".split(",")){
            list.add(object);
        }

        List list3 = new ArrayList<>();

        for(Object object : "박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준".split(",")){
            list.add(object);
        }

        ArrayList buf = new ArrayList(list3);




    }
}
