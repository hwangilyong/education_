package com.company.day41;

import com.company.day41.member.entity.MemberVO;
import com.company.day41.member.entity.MemberVOArray;
import com.company.day41.member.service.MemberService;
import com.company.day41.member.service.impl.MemberServiceImpl;

public class Main {
    public static void main(String args[]){
        MemberServiceImpl memberService = new MemberServiceImpl();
        MemberVOArray memberVOArray = new MemberVOArray();

        memberService.setMemberVOArray(memberVOArray);

        try{
            memberService.insertMember("aa","bb","hwang");
            memberService.login("aa", "cc");

            memberService.login("aa", "bb");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
