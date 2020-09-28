package com.company.day41.member.entity;

public class MemberVOArray {
    private MemberVO[] memberVOs = {};

//    public MemberVO getMemberVO(int index){
//        return memberVOs[index];
//    }
//
//    public int getMemberVOLength(){
//        return memberVOs.length;
//    }

    public void addMemberVO(MemberVO memberVO){
        MemberVO[] buffer = new MemberVO[memberVOs.length + 1];

        for(int index = 0; index < memberVOs.length; index++){
            buffer[index] = memberVOs[index];
        }

        buffer[memberVOs.length] = memberVO;
        memberVOs = buffer;
    }

    public MemberVO selectById(String userId){
        MemberVO memberVO = null;

        for(int index = 0; index < memberVOs.length; index++){
            if(userId.equals(memberVOs[index].getUserId())){
                memberVO = memberVOs[index];
                break;
            }
        }

        return memberVO;
    }
}
