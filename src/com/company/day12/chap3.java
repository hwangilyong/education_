package com.company.day12;

import java.util.Scanner;

public class chap3 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열입력 : ");
        String inputStringFir = scanner.nextLine();         //공백 포함

        System.out.println("문자열입력 : ");
        String inputStringSec = scanner.next();             //공백 미포함

        System.out.println("문자열입력 : " + inputStringSec); 
    }
}
