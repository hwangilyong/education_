package com.company.day20;

public class MemberService {
    private boolean check;
    private MemberVO memberVO;

    public void setMemberVO(MemberVO memberVO){
        this.memberVO = memberVO;
    }

    public boolean login(String id, String password){
        if(id == memberVO.getId() && password == memberVO.getPassword()){
            check = true;
        }
        else{
            check = false;
        }

        return check;
    }

    public void logout(String id){
        if(check){
            System.out.println(id + "님 로그아웃 되었습니다.");
        }
    }
}
