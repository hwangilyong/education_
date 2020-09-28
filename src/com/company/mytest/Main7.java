package com.company.mytest;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

//Set
public class Main7 {
    public static void main(String args[]) {
        TrStud[] asdfg = {
                new TrStud("개나리", "두가인", 99, 99, 99, 100),
                new TrStud("닭나리", "넷", 84, 84, 84),
                new TrStud("닭나리", "다섯", 72, 72, 72),
                /*
                new TrStud("소나리", "현빈", 65, 65, 65),
                new TrStud("닭나리", "하나", 93, 93, 93, 93),
                new TrStud("닭나리", "셋", 87, 87, 77, 87),
                new TrStud("소나리", "장서건", 99, 99, 98, 99),
                new TrStud("개나리", "삼효리", 85, 67, 94, 99),
                new TrStud("개나리", "원빈", 99, 90, 80, 88),
                new TrStud("닭나리", "여섯", 66, 66, 66),
                new TrStud("개나리", "장동건", 70, 70, 70),
                new TrStud("소나리", "정좌성", 85, 85, 85),
                new TrStud("소나리", "한간인", 75, 75, 75),
                new TrStud("개나리", "이효리", 80, 80, 80),
                new TrStud("개나리", "이찬", 80, 80, 80),
                new TrStud("소나리", "장남성", 90, 90, 90, 90),
                new TrStud("닭나리", "둘", 96, 96, 96, 96),
                new TrStud("소나리", "정우성", 89, 95, 97, 89)
*/
        };

        TreeMap<String, TreeMap<String, TreeSet<TrStud>>> map = new TreeMap();

//        System.out.println(map.entrySet());

        for (TrStud tr : asdfg) {
            TreeMap<String, TreeSet<TrStud>> kind;

            if (map.containsKey(tr.kind)) {
                kind = map.get(tr.kind);
            } else {
                kind = new TreeMap(new Comparator<String>() {
                    String kk = "개나리, 소나리, 닭나리";

                    @Override
                    public int compare(String me, String you) {
                        int res = kk.indexOf(me) - kk.indexOf(you);

                        System.out.println(res);

                        return res;
                    }
                });
                map.put(tr.kind, kind);

                //개나리, 소나리, 닭나리
                TreeSet<TrStud> ban;

                if (kind.containsKey(tr.ban))
                    ban = kind.get(tr.ban);
                else
                    ban = new TreeSet();


                ban.add(tr);
                kind.put(tr.ban, ban);
            }


            ////출력부

            for (Map.Entry<String, TreeMap<String, TreeSet<TrStud>>> kindObj :
                    map.entrySet()) {

                System.out.println(kindObj.getKey());

                for (Map.Entry<String, TreeSet<TrStud>> banObj : kindObj.getValue().entrySet()) {

                    System.out.println("\t" + banObj.getKey());

                    for (TrStud stObj : banObj.getValue()) {

                        stObj.rankCalc(banObj.getValue());

                        System.out.println(stObj);
                    }

                }

            }
        }
    }
}

class TrStud implements Comparable<TrStud> {
    String kind, name, ban;
    int[] jum;
    int total, avg, rank;

    public TrStud(String ban, String name, int... jum) {
        super();
        this.kind = "특기, 일반".split(",")[4 - jum.length];
        this.ban = ban;
        this.name = name;
        this.jum = jum;

        calc();
    }

    public void calc() {
        total = 0;

        for (int index : jum) {
            total += index;
        }

        avg = total / jum.length;
    }

    public void rankCalc(TreeSet<TrStud> banSet) {
        rank = 1;
        for (TrStud obj : banSet) {
            if (obj.avg > avg) {
                rank++;
            }
        }
    }

    @Override
    public int compareTo(TrStud o) {
        int res = o.avg - avg;

        if (res == 0) res = name.compareTo(o.name);

        if (res == 0) res = 1;

        return res;
    }

    @Override
    public String toString() {
        String ttt = kind + "\t" + name + "\t" + ban + "\t";

        for (int i : jum) {
            ttt += i + "\t";
        }

        if (kind.equals("일반"))
            ttt += "\t";
        ttt += total + "\t" + avg + "\t" +
                "가가가가가가양미우수수".charAt(avg / 10) + "\t" + rank;

        return ttt;
    }
}

