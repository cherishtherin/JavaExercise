
class MDate {

    int y, m, d; //西元紀年
    static String[] cnum = {"○", "一", "二", "三", "四",
        "五", "六", "七", "八", "九", "十"};

    MDate() {
    }

    MDate(int y, int m, int d) {
        
        this.y = y;//y1.charAt(0)
        this.m = m;
        this.d = d;
    }

    public String toString() {
         int [] year= {y/1000,y/100%10,y/10%10,y%10};
         
         int [] month= {m/10,m%10};
         int [] date= {d/10,d%10};
         
         
        return "西元"+cnum[year[0]]+
                cnum[year[1]]+cnum[year[2]]+cnum[year[3]]+"年"+cnum[month[0]]+cnum[month[1]]+"月"+
                cnum[date[0]]+cnum[date[1]]+"日"; // DIY 
    }
}

public class HWK09_409630497_04 {

    public static void main(String[] args) {
        MDate md = new MDate(1905, 10, 23); // 1905, 10, 12
        System.out.println(md); //印出: 西元一九○五年十月二十三日

        md = new MDate(2018, 12, 18);
        System.out.println(md); //印出: 西元二○一八年十二月十八日
    }
}
