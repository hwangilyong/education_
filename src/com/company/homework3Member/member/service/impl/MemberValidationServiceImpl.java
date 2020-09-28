package com.company.homework3Member.member.service.impl;

import com.company.homework3Member.member.entity.MemberVO;
import com.company.homework3Member.member.service.MemberValidationService;

public class MemberValidationServiceImpl implements MemberValidationService {
    @Override
    public void birthValidation(int userBirth) throws Exception {

        int temp = userBirth;

        int birthLength = 0;

        while(temp != 0){
            birthLength++;
            temp = temp/10;
        }

        if(birthLength != 8)throw new Exception(birthLength + "입력 형식이 맞지않습니다.");

        int frontYear = userBirth / 1000000;
        int backYear = (userBirth / 10000) % 100;

        if(frontYear != 19){
            throw new Exception("어린놈 가라");
        }

        if(backYear > 80){
            throw new Exception("어린놈 가라");
        }
    }

    @Override
    public boolean inputValidation(String value) throws Exception {
        if(value.equals(""))return true;
        return false;
    }

    @Override
    public boolean inputValidation(int value) throws Exception {
        if(value == 0)return true;
        return false;
    }

    @Override
    public boolean memberDuplicationCheck(String userId) {
        return false;
    }

    @Override
    public boolean phoneNumValidation(String phoneNum) throws Exception {
        if(phoneNum.length() != 11)return true;
        return false;
    }
}
