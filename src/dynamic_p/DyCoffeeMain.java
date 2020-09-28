package dynamic_p;

////두개의 커피점의 판매점에서 커피를 판매하세요
/*






///  원두는 각 본사에 누적 처리

///  나머지 재료는 각 판매점에 누적 처리



출력정보

1. 각주문 내용

2. 각 음료별 판매 내역 (수량, 금액)

3. 각 지점별 재료 , 판매 금액

4. 본사 원두 사용
*/


//부모 (본사 - 본사데이터 :본사 이름, 원두사용량, 커피 판매량)
//자식 (커피숍 - 자식데이터 :지점 이름, 각 재료 사용량, 음료 판매량)

class DyRS{  /// 원두 : 20  혹은  우유:30
    String name;
    int cnt;
    public DyRS(String name, int cnt) {
        this.name = name;
        this.cnt = cnt;
    }

    String ppp() {
        return "["+name+":"+cnt+"]";
    }

}

class DyMenu{
    String name;

    DyRS [] rs;


    public DyMenu(String name,int price, DyRS ... rs) {
        super();
        this.name = name;
        this.price = price;
        this.rs = rs;
    }



    int cnt,price;

    String rsPPP() {
        String res = "";  ////문자열 뽑기

        for (DyRS dyRS : rs) { /// 메뉴의 레시피들 돌리기
            res += dyRS.ppp();  ///문자열에 레시피 출력물 뺑뺑이
        }

        return res;
    }

    String ppp() {
        return "["+name+":"+cnt+"]";
    }
}

class DyBonsaData{



    public DyBonsaData(String name, DyMenu ...drinks) {

        this.name = name;
        this.drinks = drinks;
    }

    String name;




    DyMenu [] drinks;

    void add(int no) {   ///본사데이터 add()
        drinks[no].cnt++; //그 번호에 해당하는 메뉴의 갯수 누적 증가 하겠다
        //System.out.println(name+drinks[no].ppp());
    }


    void total() {

        System.out.println(name+" -------------------------");

        int wondu = 0;

        for (DyMenu dyMenu : drinks) {
            System.out.println(dyMenu.ppp());

            //System.out.println(dyMenu.rs[0].ppp());
            wondu += dyMenu.rs[0].cnt*dyMenu.cnt; //원두 카운트 올리기

        }

        System.out.println(name+" 원두 :"+wondu);
    }


}


class DyBonsa{  //부모

    DyBonsaData bd;//부모가 가지고 있는 본사 데이터



    public DyBonsa(DyBonsaData bd) { //외부에서 받아와 멤버로 처리
        super();
        this.bd = bd;
    }




    //부모 오더 (폼)
    void order(String name) {

    }

}


class DyCoffeeData{
    String name;

    DyRS [] totRS = {
            new DyRS("원두", 0),
            new DyRS("우유", 0),
            new DyRS("카라멜", 0),
            new DyRS("유자", 0),
            new DyRS("쌍화", 0),
            new DyRS("경찰", 0)

    };

    public DyCoffeeData(String name, DyMenu ...dd) {
        //본사 메뉴들

        this.name = name;   /// 자식데이터 생성시 이름을 받아옴(역삼, 강남, 서초 등등...)


        //// 자식메뉴들 = 본사 메뉴들(깊은 복사)
        this.drinks = new DyMenu[dd.length];

        ///deep copy   <-> shallow copy

        //// 배열을 새로 생성해서 내용을 똑같이 만들어서 넣어야 한다.
        for (int i = 0; i < dd.length; i++) {
            //dd[i]  : 메뉴 1개

            DyRS [] arr = new DyRS [dd[i].rs.length];
            //arr       = dd[i].rs 그메뉴의 레시피들
            //새로운 레시피들

            for (int j = 0; j < arr.length; j++) {
                //각 레시피 한개 = 새로생성 (이름, 수량) ; 값을 새로 받아 넣는다.
                arr[j] = new DyRS(dd[i].rs[j].name, dd[i].rs[j].cnt);
            }

            drinks[i] = new DyMenu(dd[i].name, dd[i].price, arr);
        }
    }

    //커피빈 : 아메리카노(원두:20),    2000

    //  카푸치노(원두:15, 우유:10), 2200

    // 카라멜마끼아또(원두:10,우유:10,카라멜:5) 2300

///       유자차(유자:30) 3000, 쌍화차(쌍화:25) 1800, 경찰차

    DyMenu [] drinks ;

    int add(String menu) { ///메뉴가 들어오면 자식 카운트를 올릴꺼야
        int i = 0;
        for (; i < drinks.length; i++) {

            if(drinks[i].name.equals(menu)) {
                ///찾았다
                drinks[i].cnt++;
                totRSAdd(drinks[i]);
                System.out.println(name+drinks[i].ppp());
                break;
            }

        }


        return i;///찾은 번호를 가지고 나와  카푸치노 - 1, 카라멜마끼아또-2, 쌍화차-4
    }


    void totRSAdd(DyMenu menu) {
        //System.out.println("재료 누적:"+menu.rsPPP());

        for (DyRS  rs : menu.rs) {
            System.out.println(rs.ppp());

            for (DyRS me: totRS) {
                if(rs.name.equals(me.name)) {
                    me.cnt+=rs.cnt;
                    //System.out.println(me.ppp());

                }
            }
        }


    }




    void total() {

        System.out.println(name+" -------------------------");

        int sum = 0;

        for (DyMenu dyMenu : drinks) {
            System.out.println(dyMenu.ppp()+":"+dyMenu.rsPPP()+dyMenu.price*dyMenu.cnt);
            //wondu += dyMenu.rs[0].cnt*dyMenu.cnt;
            sum += dyMenu.price*dyMenu.cnt;
        }

        System.out.println(name+" 재료 >>>");

        for (DyRS rs :totRS) {
            System.out.println(rs.ppp());
        }

        System.out.println(name+" 금액 :"+sum);
    }





}


class DyCoffeeShop extends DyBonsa{ //커피숍 : 자식 - 본사를 상속 (본사데이터 접근 가능 :bd)


    DyCoffeeData cd;



    public DyCoffeeShop(DyBonsaData bd, String name) {
        super(bd);
        cd = new DyCoffeeData( name, bd.drinks); //자식데이터에 지점이름을 넣어 생성
    }

    //자식 오더 (실제 구현부)
    void order(String menu) {

        ///본사의 멤버:본사데이터               자식의 멤버:자식데이터
        /// 본사이름 - 본사데이터(bd).이름(name) + 자식데이터(cd).이름(name) + 메뉴
        System.out.println(bd.name+" "+cd.name+" : "+menu);

        int no = cd.add(menu);  //번호를 가지고 나왔네
        if(no<3 ) //0-아메리카노,1-카푸치노,2-카라멜마끼아또   (커피라면)
            bd.add(no);  //부모(본사 데이터) add를 실행
    }
}





/// 할리스: 아메리카노(원두:25), 2100

///       카푸치노(원두:17, 우유:13),  2200

///카라멜마끼아또(원두:8,우유:7,카라멜:10) 2500

///       유자차(유자:25) 3100, 쌍화차(쌍화:20) 1700, 경찰차(경찰:13) 4500


public class DyCoffeeMain {

    public static void main(String[] args) {
        DyBonsaData hhs = new DyBonsaData("할리스",
                new DyMenu("아메리카노",2100,
                        new DyRS("원두", 25)

                ),
                new DyMenu("카푸치노",2200,
                        new DyRS("원두", 17),
                        new DyRS("우유", 13)),
                new DyMenu("카라멜마끼아또",2500,
                        new DyRS("원두", 8),
                        new DyRS("우유", 7),
                        new DyRS("카라멜", 10)),


                new DyMenu("유자차",3100,
                        new DyRS("유자", 25)
                ),
                new DyMenu("쌍화차",1700,
                        new DyRS("쌍화", 20)
                ),
                new DyMenu("경찰차",4500,
                        new DyRS("경찰", 13)
                )


        );  ///부모데이터 - 할리스

        /// 커피빈 : 아메리카노(원두:20),    2000

        //카푸치노(원두:15, 우유:10), 2200

        //카라멜마끼아또(원두:10,우유:10,카라멜:5) 2300

        ///       유자차(유자:30) 3000, 쌍화차(쌍화:25) 1800, 경찰차(경찰:15) 5000
        DyBonsaData cfg = new DyBonsaData("커피빈",
                new DyMenu("아메리카노",2000,
                        new DyRS("원두", 20)
                ),
                new DyMenu("카푸치노",2200,
                        new DyRS("원두", 15),
                        new DyRS("우유", 10)),
                new DyMenu("카라멜마끼아또",2300,
                        new DyRS("원두", 10),
                        new DyRS("우유", 10),
                        new DyRS("카라멜", 5)),
                new DyMenu("유자차",3000,
                        new DyRS("유자", 30)
                ),
                new DyMenu("쌍화차",1800,
                        new DyRS("쌍화", 25)
                ),
                new DyMenu("경찰차",5000,
                        new DyRS("경찰", 15)
                )
        );  ///부모데이터 - 커피빈


        DyCoffeeShop [] shops = {
                new DyCoffeeShop(hhs, "역삼"),  // 각 커피지점 생성시 부모데이터를 각자 받음 - 할리스
                new DyCoffeeShop(hhs, "강남"),
                new DyCoffeeShop(hhs, "서초"),

                new DyCoffeeShop(cfg, "동대문"),  // 각 커피지점 생성시 부모데이터를 각자 받음 - 커피빈
                new DyCoffeeShop(cfg, "역삼"),
                new DyCoffeeShop(cfg, "신촌")
        };


        shops[0].order("아메리카노");
        shops[1].order("카푸치노");
        shops[2].order("카라멜마끼아또");
        shops[3].order("경찰차");
        shops[4].order("유자차");
        shops[5].order("쌍화차");
        shops[0].order("아메리카노");
        shops[1].order("카라멜마끼아또");
        shops[2].order("경찰차");
        shops[0].order("카푸치노");
        shops[3].order("아메리카노");
        shops[4].order("카라멜마끼아또");
        shops[5].order("아메리카노");
        shops[0].order("카푸치노");
        shops[1].order("카라멜마끼아또");
        shops[2].order("경찰차");
        shops[0].order("카라멜마끼아또");
        shops[3].order("유자차");
        shops[1].order("쌍화차");
        shops[4].order("아메리카노");
        shops[3].order("아메리카노");
        shops[5].order("유자차");
        shops[2].order("아메리카노");
        shops[1].order("유자차");


        System.out.println("[[[[[[지점]]]]]]]]");
        for (DyCoffeeShop sh : shops) {
            sh.cd.total();
        }


        System.out.println("[[[[[[본사]]]]]]]]");
        hhs.total();

        cfg.total();
    }

}