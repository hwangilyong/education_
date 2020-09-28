package com.company.day45Tokens;

import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("this-=string-includes=delims");

        System.out.println(str);
        System.out.println();

        StringTokenizer stringTokenizer = new StringTokenizer(str.toString(), "-=", true);
        System.out.println("======================");

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("TOTAL TOKENS : " + stringTokenizer.countTokens());
    }

    public static void test(){
        StringBuffer str = new StringBuffer("this String includes default delims");
        System.out.println(str);
        System.out.println();

        System.out.println("======using Split method");

        StringTokenizer stringTokenizer = new StringTokenizer(str.toString());
        System.out.println("TOTAL TOKENS : " + stringTokenizer.countTokens());

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("TOTAL TOKENS : " + stringTokenizer.countTokens());
    }

}
