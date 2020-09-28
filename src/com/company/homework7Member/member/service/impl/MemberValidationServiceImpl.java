package com.company.homework7Member.member.service.impl;

import com.company.homework7Member.member.service.MemberValidationService;
import com.company.homework7Member.regex.RegularExpression;

import java.util.regex.Pattern;

public class MemberValidationServiceImpl implements MemberValidationService {
    private RegularExpression regularExpression = new RegularExpression();
    @Override
    public void birthValidation(int userBirth) throws Exception {
        String checkbirth = Integer.toString(userBirth);
        if(!Pattern.matches(regularExpression.regBirth,checkbirth+""))
            throw new Exception("입력 형식이 맞지않습니다.");

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
        return Pattern.matches(regularExpression.regPhoneNum, phoneNum);
    }

    @Override
    public boolean emailVaildation(String userEmail) throws Exception {
        return Pattern.matches(regularExpression.regEmail, userEmail);
    }

    @Override
    public boolean imageValidation(String fileName) throws Exception {
        return Pattern.matches(regularExpression.regFileExtension,
                fileName.substring(fileName.lastIndexOf(".") + 1));
    }

    @Override
    public boolean nameValidation(String userName) throws Exception{
        return Pattern.matches(regularExpression.regName, userName);
    }

    @Override
    public boolean passwordValidation(String userPassword) throws Exception{
        return Pattern.matches(regularExpression.regPassword, userPassword);
    }
}
