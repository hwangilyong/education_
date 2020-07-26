package com.company.day19;

public class chap2 {
    final String field1 = "여름방학";
    final String field2 = "8월 17일";
    final String field3;
    String field4;

    public chap2(int num) {
        String field3 = "";

        if(num == 1)field3 = "휴강할래";
        else field4 = "공부합시다.";

        this.field3 = field3;
    }
}
