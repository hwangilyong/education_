package com.company.day13;

import java.util.Scanner;

public class chap4 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력");
        int inputNumFir = scanner.nextInt();

        System.out.println(inputNumFir);

        System.out.println("문자열 입력");
        String inputString = scanner.nextLine();

        System.out.println(inputString);

        System.out.println("정수 입력");
        int inputNumSec = scanner.nextInt();

        System.out.println(inputNumSec);

        System.out.println("문자열 입력");
        String inputStringSec = scanner.nextLine();

        System.out.println(inputStringSec);
    }
}
