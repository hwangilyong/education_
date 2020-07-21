package com.company.day13;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class chap2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        String name = "";
        float height = 0;
        float weight = 0;

        name = scanner.nextLine();
        height = scanner.nextFloat();
        weight = scanner.nextFloat();

        System.out.println("이름   : \t" + name);
        System.out.println("키     : \t" + height);
        System.out.println("몸무게 : \t" + weight);
    }
}
