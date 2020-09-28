package com.company.homework3Member.member.service;

import com.company.homework3Member.member.entity.MemberVO;

public interface MemberValidationService {
    public void birthValidation(int userBirth) throws Exception;
    public boolean inputValidation(String value) throws Exception;
    public boolean inputValidation(int value) throws Exception;
    public boolean memberDuplicationCheck(String userId);
    public boolean phoneNumValidation(String phoneNum) throws Exception;
}
