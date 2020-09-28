package com.company.homework3Member.member.service.impl;

import com.company.homework3Member.member.entity.MemberData;
import com.company.homework3Member.member.entity.MemberVO;
import com.company.homework3Member.member.service.MemberService;
import com.company.homework3Member.member.service.MemberValidationService;

import java.util.Scanner;

public class MemberServiceImpl extends MemberValidationServiceImpl implements MemberService, MemberValidationService {
    private MemberData memberData = new MemberData();
    private MemberVO currentUser;

//    public void setMemberData(MemberData memberData){
//        this.memberData = memberData;
//    }
    public void setCurrentUser(MemberVO currentUser){
        this.currentUser = currentUser;
    }

    public MemberVO getCurrentUser(){
        return currentUser;
    }

    public void logout(){
        currentUser = null;
    }

    @Override
    //public void memberRegister(MemberVO memberVO) throws Exception {//유저 가입
    public void memberRegister() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        MemberVO memberVO = null;

        do {
            try {
                while(true) {
                    try {
                        System.out.println("--[아이디 입력]--");
                        String userId = scanner.nextLine();

                        if (inputValidation(userId)) {
                            throw new Exception("아이디를 입력해주십시오");
                        }

                        if (memberDuplicationCheck(userId)) {
                            throw new Exception("아이디 중복");
                        }
                        memberVO = new MemberVO();

                        memberVO.setUserId(userId);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                while (true) {
                    try {
                        System.out.println("--[비밀번호 입력]--");
                        String userPassword = scanner.nextLine();

                        if (inputValidation(userPassword)) {
                            throw new Exception("비밀번호를 입력해주십시오");
                        }

                        memberVO.setUserPassword(userPassword);

                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }


                while (true) {
                    try {
                        System.out.println("--[비밀번호 재 입력]--");
                        String confirmPassword = scanner.nextLine();

                        if (inputValidation(confirmPassword)) {
                            throw new Exception("확인 비밀번호를 입력해주십시오");
                        }

                        memberVO.setConfirmPassword(confirmPassword);

                        if (!memberVO.passwordCheck()) {
                            throw new Exception("입력한 비밀번호와 다릅니다.");
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try {
                        System.out.println("--[이름 입력]--");
                        String userName = scanner.nextLine();

                        if (inputValidation(userName)) {
                            throw new Exception("이름을 입력해 주십시오");
                        }

                        memberVO.setUserName(userName);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try{
                        System.out.println("--[이메일 입력]--");
                        String userEmail = scanner.nextLine();

                        if(inputValidation(userEmail)){
                            throw new Exception("이메일을 입력해 주십시오");
                        }

                        memberVO.setUserEmail(userEmail);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try{
                        System.out.println("--[취미 입력]--");
                        String hobby = scanner.nextLine();

                        if(inputValidation(hobby)){
                            throw new Exception("취미를 입력해 주십시오");
                        }

                        memberVO.setHobby(hobby);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try{
                        System.out.println("--[특기 입력]--");
                        String specialty = scanner.nextLine();

                        if(inputValidation(specialty)){
                            throw new Exception("특기를 입력해 주십시오");
                        }

                        memberVO.setSpecialty(specialty);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try{
                        System.out.println("--[전화번호 입력]--");
                        System.out.println("-을 제외하고 입력해 주세요");

                        String phoneNum = scanner.nextLine();

                        if(inputValidation(phoneNum)){
                            throw new Exception("전화번호를 입력해 주십시오");
                        }
                        if(phoneNumValidation(phoneNum)){
                            throw new Exception("정확히 입력하여 주십시오");
                        }

                        memberVO.setPhoneNum(phoneNum);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    try{
                        System.out.println("--[생일 입력]--");
                        System.out.println("EX) 19900221 8자리 입력해주십시오");
                        int userBirth = scanner.nextInt();


                        if(inputValidation(userBirth)){
                            throw new Exception("생일을 입력해 주십시오");
                        }

                        birthValidation(userBirth);
                        memberVO.setUserBirth(userBirth);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                while(true){
                    String[] sex = new String[]{"남자", "여자"};
                    try{
                        System.out.println("--[성별 입력]--");
                        System.out.println("[1 : 남자][2 : 여자]");

                        int choice = scanner.nextInt();

                        if(choice < 1 || choice > 2){
                            throw new Exception("1,2 둘중 하나 입력해주십시오");
                        }

                        memberVO.setUserSex(sex[choice - 1]);
                        break;
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            flag = false;
        } while (flag);
        memberData.setMemberVOList(memberVO);
    }

    @Override
    //public void memberLogin(String userId, String userPassword) throws Exception {//로그인
    public MemberVO memberLogin() throws Exception {
        Scanner scanner = new Scanner(System.in);
        MemberVO memberVO = null;
        String userId = scanner.nextLine();

        memberVO = selectByUserId(userId);
        if(memberVO == null){
            throw new Exception("아이디가 맞지않습니다");
        }

        String userPassword = scanner.nextLine();

        if(!memberVO.loginPasswordCheck(userPassword)){
            throw new Exception("비밀번호가 틀립니다.");
        }


        return memberVO;
    }

    @Override
    public MemberVO selectByUserId(String userId) {//유저 검색
        MemberVO memberVO = null;

        for (int index = 0; index < memberData.getMemberVOList().length; index++) {
            if (userId.equals(memberData.getMemberVO(index).getUserId())) {
                memberVO = memberData.getMemberVO(index);
            }
        }

        return memberVO;
    }

    @Override
    public boolean memberDuplicationCheck(String userId) {
        MemberVO memberVO = selectByUserId(userId);

        if (memberVO != null) {
            return true;
        }

        return false;
    }

    @Override
    public void listAll() throws Exception {//전체 출력
        MemberVO[] memberData = this.memberData.getMemberVOList();

        for(MemberVO memberVO : memberData){
            memberVO.ppp();
        }
    }
}
