package com.company.day41.member.service.impl;

import com.company.day41.member.entity.MemberVO;
import com.company.day41.member.entity.MemberVOArray;
import com.company.day41.member.service.MemberService;

public class MemberServiceImpl implements MemberService{
    MemberVOArray memberVOArray;

    public void setMemberVOArray(MemberVOArray memberVOArray){
        this.memberVOArray = memberVOArray;
    }

    @Override
    public void insertMember(String userId, String userPassword, String userName) throws Exception{
        MemberVO memberVO = memberVOArray.selectById(userId);

        if(memberVO != null)throw new Exception("이미 존재 : " + userId);
        memberVO = new MemberVO();
        memberVO.setUserId(userId);
        memberVO.setUserPassword(userPassword);
        memberVO.setUserName(userName);

        memberVOArray.addMemberVO(memberVO);
    }

    @Override
    public void login(String userId, String userPassowrd) throws Exception {
        MemberVO memberVO = memberVOArray.selectById(userId);

        if(memberVO == null){
            throw new Exception("아이디 잘못됌 : " + userId);
        }

        if(!memberVO.setCheckPassword(userPassowrd)){
            throw new Exception("비번 잘못됌 : " + userId);
        }

        System.out.println("로그인 성공");
    }
}
