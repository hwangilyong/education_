package com.company.day14;

public class chap5 {
    public static void main(){
        chap5Service service = new chap5SerivceImpl();

        int integerArr[] = new int[10];
        service.inputVal(integerArr);
        service.print(integerArr);

    }


}
