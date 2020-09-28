package com.company.homework7Member.assembler;

import com.company.homework7Member.member.entity.MemberVO;
import com.company.homework7Member.member.service.impl.MemberServiceImpl;

import java.util.Scanner;

public class MemberAssembler {
    public void excute() {
        MemberServiceImpl memberService = new MemberServiceImpl();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("1.로그인 2.회원가입");
                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        MemberVO session = null;
                        session = memberService.memberLogin();
                        if (session == null) {
                            throw new Exception("로그인 오류");
                        }
                        memberService.setCurrentUser(session);
                        member(memberService);
                        break;
                    case 2:
                        memberService.memberRegister();
                        break;
                    default:
                        throw new Exception("입력 형식이 잘못되었습니다.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void member(MemberServiceImpl memberService) {
        Scanner scanner = new Scanner(System.in);

        MemberVO currentUser = memberService.getCurrentUser();
        boolean exit = true;

        while (exit) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("1.유저정보 확인 2.로그아웃 3.전체 유저 출력 4.유저 검색");
                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        currentUser.ppp();
                        break;
                    case 2:
                        memberService.logout();
                        exit = false;
                        break;
                    case 3:
                        memberService.listAll();
                        break;
                    case 4:
                        scanner = new Scanner(System.in);
                        String search = scanner.nextLine();
                        MemberVO searchVO = memberService.selectByUserId(search);

                        if (searchVO == null) throw new Exception("찾는 유저가 없습니다.");

                        System.out.println("--[유저 정보]--");
                        System.out.println("[ID : " + searchVO.getUserId() + "]");
                        System.out.println("[이름 : " + searchVO.getUserName() + "]");
                        System.out.println("[성별 : " + searchVO.getUserSex() + "]");
                        System.out.println("--------------");
                        break;
                    default:
                        throw new Exception("입력 형식이 잘못되었습니다.");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
