package com.company.day28.chap1;

public interface OldInterface {
    void meth1();

    default void meth2(){
        System.out.println("OldInterface 디폴트 메소드1");
    }
}
