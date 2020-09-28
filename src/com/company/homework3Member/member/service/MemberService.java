package com.company.homework3Member.member.service;

import com.company.homework3Member.member.entity.MemberVO;

public interface MemberService {
    //public void memberRegister(MemberVO memberVO) throws Exception;
    public void memberRegister();
    //public void memberLogin(String userId, String userPassword) throws Exception;
    public MemberVO memberLogin() throws Exception;
    public MemberVO selectByUserId(String userId);
    public void listAll() throws Exception;
}
