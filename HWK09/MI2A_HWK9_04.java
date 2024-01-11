
class MDate {
    int y, m, d; //西元紀年
    static String[] cnum = {"○", "一", "二", "三", "四",
                            "五", "六", "七", "八", "九", "十"};

    MDate() {  }
    MDate(int y, int m, int d) {
        this.y = y;    this.m = m;    this.d = d;
    }
    public String toString() {
        return "Not Yet"; // DIY 
    } 
}

public class MI2A_HWK9_04 {
    public static void main(String[] args) {
        MDate md = new MDate(1905, 10, 23); // 1905, 10, 12
        System.out.println(md); //印出: 西元一九○五年十月二十三日
        
        md = new MDate(2018, 12, 18) ;
        System.out.println(md); //印出: 西元二○一八年十二月十八日
    }
}