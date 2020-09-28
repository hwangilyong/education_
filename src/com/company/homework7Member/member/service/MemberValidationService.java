package com.company.homework7Member.member.service;

public interface MemberValidationService {
    public void birthValidation(int userBirth) throws Exception;
    public boolean inputValidation(String value) throws Exception;
    public boolean inputValidation(int value) throws Exception;
    public boolean memberDuplicationCheck(String userId);
    public boolean phoneNumValidation(String phoneNum) throws Exception;
    public boolean emailVaildation(String userEmail) throws Exception;
    public boolean imageValidation(String fileName) throws Exception;
    public boolean nameValidation(String userName) throws Exception;
    public boolean passwordValidation(String userPassword) throws Exception;
}
