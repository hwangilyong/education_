package com.company.homework7Member;

import com.company.homework7Member.regex.RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void test(){
        String test = "image.jsp";

        String fileName = test.substring(test.lastIndexOf(".") + 1);
        System.out.println(fileName);
    }

    public static void test2() {
        RegularExpression regularExpression = new RegularExpression();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String test = scanner.nextLine();
            if (Pattern.matches(regularExpression.regEmail2, test)) {
                System.out.println("됌 : " + test);
            } else {
                System.out.println("틀림 : " + test);
            }

            //System.out.println(regularExpression.regEmail.charAt(152));
        }
    }
}
