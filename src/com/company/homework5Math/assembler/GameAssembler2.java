package com.company.homework5Math.assembler;

import com.company.homework5Math.game.Rule;
import com.company.homework5Math.player.User;

import java.util.Scanner;

public class GameAssembler2 {
    public void assembler(){
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while(true){
            try {
                System.out.println("1. START 2. SHOW ODDS 4. EXIT");
                int cmd = scanner.nextInt();

                switch (cmd) {
                    case 1:
                        play(user);
                        break;
                    case 2:
                        double odds = user.calcOdds();
                        System.out.println("ODDS : " + odds + "%");
                        break;
                    case 3:
                        break;
                    case 4:
                        throw new Exception("EXIT");
                    default:
                        throw new Exception("INPUT ERROR");

                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void play(User user)throws Exception{
        Rule rule = new Rule();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. 가위 2. 바위 3. 보");
            int userAttack = scanner.nextInt();

            if (userAttack < 1 || userAttack > 3) throw new Exception("INPUT ERROR");
            int comAttack = (int)(Math.random() * 3) + 1;

            if(rule.continuePlay(userAttack - 1,comAttack - 1)){
                showCurrent(rule.getAttack(userAttack - 1), rule.getAttack(comAttack - 1));
                String flag = rule.gameValidation(userAttack - 1, comAttack - 1);

                while(true){

                    System.out.println("1. 가위 2. 바위 3. 보");
                    int suserAttack = scanner.nextInt();

                    if (userAttack < 1 || userAttack > 3) throw new Exception("INPUT ERROR");
                    int scomAttack = (int)(Math.random() * 3) + 1;

                    showCurrent(rule.getAttack(suserAttack - 1), rule.getAttack(scomAttack - 1));

//                    if(flag.equals("")){
//                        flag = rule.gameValidation(suserAttack - 1, scomAttack - 1);
//                        System.out.println("현 상황 USER : " + flag);
//                    }

                    if(!rule.continuePlay(suserAttack - 1, scomAttack - 1)){
                        if("승".equals(flag)){
                            user.increaseWin();
                            throw new Exception("USER WIN");
                        }
                        user.increaseLose();
                        throw new Exception("USER LOOSE");
                    }

                    flag = rule.gameValidation(suserAttack - 1, scomAttack - 1);
                }
            }

            showCurrent(rule.getAttack(userAttack - 1) , rule.getAttack(comAttack - 1));
        }
    }

    public void showCurrent(String user, String com){
        System.out.println("USER : " + user + " " + "COM : " + com);
    }
}
