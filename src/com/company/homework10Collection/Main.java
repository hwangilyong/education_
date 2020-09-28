package com.company.homework10Collection;

import com.company.homework10Collection.student.assembler.Assembler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        Assembler assembler = new Assembler();
        assembler.assembler();
    }

    public static void test() {

/*
 * 1. 숫자가 몇번 나오는지 출력하세요(오름차순 정렬 요망)
   3,5,7,9,1,3,5,6,2,3,5,9,3,7,9


2. h : home,   a:away
h3,a5,a7,h9,h1,h3,a5,a6,h2,a3,a5,h9,h3,a7,h9

home
1:?
3:?
9:?


away
5:?
7:?

*/

        int[] arr = {3, 5, 7, 9, 1, 3, 5, 6, 2, 3, 5, 9, 3, 7, 9};

      /*
      Map hit = new HashMap();
      for (int i : arr) {
         int vv = 1;

         if(hit.containsKey(i))
            vv += (int)hit.get(i);

         hit.put(i,vv);
      }

      TreeSet kk = new TreeSet(hit.keySet());

      for (Object ob : kk) {
         System.out.println(ob+":"+hit.get(ob));
      }*/


        TreeMap hit = new TreeMap();
        for (int i : arr) {
            int vv = 1;

            if (hit.containsKey(i))
                vv += (int) hit.get(i);

            hit.put(i, vv);
        }

        for (Object ob : hit.entrySet()) {
            System.out.println(ob);
        }


        TreeMap tot = new TreeMap();
        for (String str : "h3,a5,a7,h9,h1,h3,a5,a6,w2,a3,k5,h9,h3,a7,h9".split(",")) {

            char team = str.charAt(0);
            if (!tot.containsKey(team))
                tot.put(team, new TreeMap());

            int i = str.charAt(1) - '0';

            TreeMap now = (TreeMap) tot.get(str.charAt(0));
            int vv = 1;
            if (now.containsKey(i))
                vv += (int) now.get(i);

            now.put(i, vv);
        }

        for (Object ooo : tot.entrySet()) {

            Map.Entry me = (Map.Entry) ooo;

            System.out.println(me.getKey());

            for (Object ob : ((TreeMap) me.getValue()).entrySet()) {
                System.out.println(ob);
            }
        }
    }

}

