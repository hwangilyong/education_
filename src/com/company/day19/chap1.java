package com.company.day19;

public class chap1 {
    private static int field1 = 10;
    private static int field2;

    public static void setField2(){
        field2 = field1 * field1;
    }

    public int getField1(){
        return field1;
    }

    public int getField2(){
        return field2;
    }
}
