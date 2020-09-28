//package com.company.homework5Math.assembler;
//
//import com.company.homework5Math.game.Rule;
//import com.company.homework5Math.player.User;
//
//import java.util.Scanner;
//
//public class GameAssembler {
//    public void assembler(){
//        Scanner scanner = new Scanner(System.in);
//        User user = new User();
//
//        while(true){
//            try {
//                System.out.println("1. START 2. SHOW ODDS 4. EXIT");
//                int cmd = scanner.nextInt();
//
//                switch (cmd) {
//                    case 1:
//                        play(user);
//                        break;
//                    case 2:
//                        double odds = user.calcOdds();
//                        System.out.println("ODDS : " + odds + "%");
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        throw new Exception("EXIT");
//                    default:
//                        throw new Exception("INPUT ERROR");
//
//                }
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//    private void play(User user) throws Exception{
//        System.out.println("1. 가위 2. 바위 3. 보");
//        Rule rule = new Rule();
//
//        Scanner scanner = new Scanner(System.in);
//
//        int userAttack = scanner.nextInt();
//
//        if(userAttack < 1 || userAttack > 3)throw new Exception("INPUT ERROR");
//
//        int comAttack = (int)(Math.random() * 3) + 1;
//
//        if(rule.gameValidation(userAttack - 1, comAttack - 1)){
//            user.increaseWin();
//            throw new Exception("USER WIN");
//        }
//
//        user.increaseLose();
//        throw new Exception("USER LOSE");
//    }
//
//}
