package com.company.day16;

public class chap2 {
    public static void main(){
        Student student = new Student();

        System.out.println(student.intValue);
        System.out.println(student.doubleValue);
        System.out.println(student.strValue);

        student.intValue = 3;
        student.doubleValue = 5.0;
        student.strValue = "test";

        System.out.println(student.intValue);
        System.out.println(student.doubleValue);
        System.out.println(student.strValue);

    }
}
