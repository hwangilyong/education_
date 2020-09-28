package com.company.day49.chap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chap {
    public void main(){
        Map member = new HashMap();

        member.put("aaa","111");
        member.put("bbb","222");
        member.put("ccc","333");
        member.put("ddd","444");
        member.put("eee","555");

        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                System.out.print("ID : ");
                String id = sc.next();

                if(!member.containsKey(id))
                    throw new Exception();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
