package com.company.mytest;

import java.util.*;

public class Main6 {
    public static void main(String args[]) {
        test3();
    }

    public static void mapTest() {
        Map test = new HashMap();

        test.put("test", new HashMap());

        System.out.println(test.get("test"));

        Map test3 = (HashMap) test.get("test");
        test3.put("test3", "use");

        if(test.containsKey("test"))
            System.out.println("있음");
        else
            System.out.println("없음");

        if(test.equals(test3))
            System.out.println("있음");
        else
            System.out.println("없음");

        System.out.println(((Map) test.get("test")).get("test3"));
    }

    public static void mapTest2(){
        Map test = new HashMap();

        test.put("박" , new Test(30));
        test.put("김" , new Test(40));
        test.put("황" , new Test(50));

        Iterator printTest = test.keySet().iterator();

        while(printTest.hasNext()){
            String key = printTest.next().toString();
            System.out.println(key + " " + test.get(key));
        }

        System.out.println(test.keySet());

        sort(test);
    }

    public static void sort(Map map){
        List list = new ArrayList();
        list.addAll(map.keySet());

        for(Object object : list){
            System.out.print(object.toString());
        }
        System.out.println();

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double value1 = ((Test)map.get(o1)).avg;
                double value2 = ((Test)map.get(o2)).avg;

                return ((Comparable) value2).compareTo(value1);
            }
        });

        for(Object object : list){
            System.out.print(object.toString());
        }
        System.out.println();
    }

    public static void test3(){
        Map map = new HashMap();
        Map map2 = new HashMap();

        map.put("테스트1", "1");
        map.put("테스트1", "2");
        map.put("테스트1",new HashMap());
        ((Map)map.get("테스트1")).put("테스트2","");

        System.out.println(((Map)map.get("테스트1")).keySet());

        System.out.println(map.get("테스트1"));
    }
}

class Test{
    double avg;
    public Test(double avg){
        this.avg = avg;
    }
}
