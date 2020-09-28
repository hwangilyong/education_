package com.company.day41.member.service;

import com.company.day41.member.entity.MemberVO;

public interface MemberService {
    public void insertMember(String userId, String userPassword, String userName) throws Exception;
    public void login(String userId, String userPassowrd) throws Exception;
}
