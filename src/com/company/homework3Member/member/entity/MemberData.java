package com.company.homework3Member.member.entity;

public class MemberData {
    private MemberVO[] memberVOList = {};

    public void setMemberVOList(MemberVO memberVO){
        MemberVO[] buffer = new MemberVO[memberVOList.length + 1];

        for(int index = 0; index < memberVOList.length; index++){
            buffer[index] = memberVOList[index];
        }

        buffer[memberVOList.length] = memberVO;

        memberVOList = buffer;
    }

    public MemberVO[] getMemberVOList(){
        return memberVOList.clone();
    }

    public MemberVO getMemberVO(int index){
        return memberVOList[index];
    }
}
