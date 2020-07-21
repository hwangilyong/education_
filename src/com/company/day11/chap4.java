package com.company.day11;

import java.io.IOException;
import java.util.Scanner;

public class chap4 {
    public static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);

        String inputString;

        do{
            System.out.print(">>");
            inputString = scanner.nextLine();

            System.out.println(inputString);
        }while(!inputString.equals("q"));
    }
}
