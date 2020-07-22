package com.company.day17;

public class Carc {
    String field1 = "첫번째 필드입니다.";
    String field2;
    String field3;
    String field4;

    public Carc(){}
    public Carc(String field2){
        this.field2 = field2;
    }
    public Carc(String field2, String field3){
        this.field2 = field2;
        this.field3 = field3;
    }
    public Carc(String field2, String field3, String field4){
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }


}
