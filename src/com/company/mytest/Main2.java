package com.company.mytest;

import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {



        System.out.println("이신협".startsWith("이"));
        System.out.println("삼신협".startsWith("이"));

        System.out.println("삼신협".contains("신"));
        System.out.println("삼농협".contains("신"));

        System.out.println("삼신협".endsWith("협"));
        System.out.println("삼신호".endsWith("협"));


        System.out.println(Pattern.matches("장", "장동건"));
        System.out.println(Pattern.matches("장.*", "장동건"));
        System.out.println(Pattern.matches(".*동.*", "장동건"));
        System.out.println(Pattern.matches(".*동", "장동건"));
        System.out.println(Pattern.matches(".*건", "장동건"));

        String [] mmArr= {"장동건","건","장서건","장혁","장남건","장3",
                "장","장군","최장군","박장군","장군님","장장장장장장장","장장",
                "장장장","김앤장이다","현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈",
                "ㄱㄴㄷ","ㄱㄹㄴ","ㅐㅓㅣㅔㅐ","ㅐㅔㅓㅐㅑㅓ","ㄱㅓㅔㅔㅔㄹㄴ",
                "하하하","하호허","팉툍하","하학","하햐","가긱공국","짱쩡맨","쑥ㄴ밬","샹쏑쑗",
                "다","공석호","김희애",
                "나야비","나비야","농ㅂ왕창","장ㄴ비용솽",
                "너탈비털아붕니","너비아니","헤르너비아샹쵕",
                "123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","9846","ab_1234","ab1234",
                "aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa",
                "1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va"};


        String [] ppArr = {"장","장군", "장.",".빈","..빈",".장.",
                "장*","장.*"};

        for (String pp : ppArr) {
            System.out.print(pp+":");


            for (String mm : mmArr) {

                if(Pattern.matches(pp, mm))
                    System.out.print(mm+",");
            }


            System.out.println();
        }

    }

}
