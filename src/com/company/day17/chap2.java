package com.company.day17;

public class chap2 {
    public static void main(){
        Carc c1 = new Carc();
        Carc c2 = new Carc(" JAVA "," C++ ");
        Carc c3 = new Carc(" COTLIN "," C ", " JSP ");
        Carc c4 = new Carc(" SPRING "," SPRINGBOOT "," MYSQL ");

        System.out.println(c1.field1 + c1.field2 + c1.field3 + c1.field4);
        System.out.println(c2.field1 + c2.field2 + c2.field3 + c2.field4);
        System.out.println(c3.field1 + c3.field2 + c3.field3 + c3.field4);
        System.out.println(c4.field1 + c4.field2 + c4.field3 + c4.field4);

    }
}
