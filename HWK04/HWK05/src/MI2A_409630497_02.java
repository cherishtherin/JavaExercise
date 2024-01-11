class Time { // 24小時進制的時間
    int h, m, s ; // h: 0~23: m, s: 0~59
   
    public void set(int a, int b, int c) {
        if (a<0 || a>23 || b<0 || b>59 || c<0 ||c>59)
            h=m=s=0 ;
        else {h=a; m=b; s=c;}
    }
    // DIY here, 請依照main()中要求，完成print(), inc(), diff()
    // inc(): 5%
    // diff(): 6%
    // print(): 4%   
    void print(String sym){
        System.out.println(sym+" "+h+":"+m+":"+s);
    }
    void inc(int t){
        h+=t/3600;
        t=t%3600;
        m+=t/60;
        t=t%60;
        s+=t;
        if(s>=60){
            s-=60;m++;
        }
        if(m>=60){
            m-=60;
            h++;
        }
    }
    int diff(Time t){
        int hour,min, sec;
        if(h<t.h){
            hour= t.h-h;min=t.m-m; sec= t.s-s;
        }
        else{
            hour= t.h+24-h;min=t.m-m; sec= t.s-s;
        }
        return hour*3600+min*60+sec;
    }
}
public class MI2A_409630497_02{
    public static void main(String[] args) {
        Time t1 = new Time(), t2 = new Time() ; 
        t1.set(17, 20, 30) ;		
        t2.set(6, 35, 45) ;
        t1.print("t2="); t2.print("t2=") ;
        t2.inc(5000) ; //將t2的時間向前撥5000秒
        t2.print("t2=") ; 
        int diff = t1.diff(t2) ; 
        System.out.println("diff of t1 and t2="+diff+" sec(s)") ; 
    }
}
/*[程式輸出] : t1.diff(t2): 若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2是明天的時間
t1 = 17:20:30
t2 = 06:35:45
t2 = 07:59:05
diff of t1 and t2 = 52715 sec(s) 
*/
