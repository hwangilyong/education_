package com.company.day28;

import com.company.day28.chap1.NewClass1;
import com.company.day28.chap1.NewClass2;
import com.company.day28.chap1.OldInterface;

public class Main {
    public static void main(String args[]){
        OldInterface ol1 = new NewClass1();

        ol1.meth1();
        ol1.meth2();

        OldInterface ol2 = new NewClass2();

        ol2.meth1();
        ol2.meth2();
    }
}
