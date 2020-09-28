package com.company.mytest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String args[]){
        String[] address = {"중구", "남동구", "남구", "동구", "연수구", "부평구", "계양구", "서구", "종로구", "서대문구", "광진구", "강북구", "노원구", "성동구",
                "동대문구", "중랑구", "도봉구", "강동구", "강남구", "송파구", "강서구", "구로구", "금천구", "중구", "마포구", "맛있구", "오지구", "지리구", "렛잇구",
                "얼씨구"};
        String[] cho = { "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
        String cho2 = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ";
        String[] hangle = { "[가-깋]", "[나-닣]", "[다-딯]", "[라-맇]", "[마-밓]", "[바-빟]", "[사-싷]", "[아-잏]", "[자-짛]",
                "[차-칳]", "[카-킿]", "[타-팋]", "[파-핗]", "[하-힣]" };
        String[] hangle2 = { "가-깋", "나-닣", "다-딯", "라-맇", "마-밓", "바-빟", "사-싷", "아-잏", "자-짛",
                "차-칳", "카-킿", "타-팋", "파-핗", "하-힣" };
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String search = scanner.nextLine();

            String pattern2 = " ";

            for(int index = 0; index < search.length(); index++) {
                if (cho2.indexOf(search.charAt(index)) != -1) {
                    pattern2 += hangle[cho2.indexOf(search.charAt(index))];
                } else {
                    pattern2 += search.charAt(index);
                }
            }


            String test3 = "(.?.?" + pattern2.trim() + ".?.?){1,4}";
            System.out.println(pattern2);

            String test = "";
            int count = 0;
            for (String addr : address) {
                if (Pattern.matches(test3, addr)) {
                    count++;
                    System.out.println("TEST : " + addr);
                    test += count + "." + addr + " ";

                }
            }
            System.out.println("TEST");


            String[] result = test.split(" ");
            //(test.indexOf(choice + ".");
            for(String res : result){
                System.out.println(res);
            }
            if(count != 0) {
                int choice = scanner.nextInt();
                System.out.println(result[choice - 1].substring(2));
            }
        }
    }
}
