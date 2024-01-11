
class MDate {
    int y, m, d; //西元紀年
    static String[] cnum = {"○", "一", "二", "三", "四",
                            "五", "六", "七", "八", "九", "十"};

    MDate() {  }
    MDate(int y, int m, int d) {
        this.y = y;    this.m = m;    this.d = d;
    }
    public String toString() {
        String yy="", mm="", dd="";
        int y1, y2, y3, y4;
        y1=y/1000;
        y2=y%1000/100;
        y3=y%100/10;
        y4=y%10;
        yy+=cnum[y1];
        yy+=cnum[y2];
        yy+=cnum[y3];
        yy+=cnum[y4];
        
        if (m>10&& m<=12){
            mm+=cnum[10];
            mm+=cnum[m-10];
        }
        else{
            mm+=cnum[m];
            
        }
        if (d>10&& d<20){
           dd+=cnum[10];
            dd+=cnum[d-10];
        }
        else if (d>=20&& d<30){
            dd+=cnum[2];
           dd+=cnum[10];
           if(d-20!=0)dd+=cnum[d-20];
        }
        else if (d>=30){
            dd+=cnum[3];
           dd+=cnum[10];
            if(d-30!=0)dd+=cnum[d-30];
        }
        else{
            dd+=cnum[d];
            
        }
        
        
                
                
        
        
        
        return "西元"+yy+"年"+mm+"月"+dd+"日"; // DIY 
    } 
}

public class HWK09_04 {
    public static void main(String[] args) {
        MDate md = new MDate(1905, 10, 23); // 1905, 10, 12
        System.out.println(md); //印出: 西元一九○五年十月二十三日
        
        md = new MDate(2018, 12, 18) ;
        System.out.println(md); //印出: 西元二○一八年十二月十八日
    }
}