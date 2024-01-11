
class TimeX { // 24小時進制的時間

    int h, m, s;

    // DIY here, 依照main()中的需求，自行加入以下之靜態函數
    // static void set(TimeX t, int h, int m, int s) {...}
    // print(), inc(), diff()
    static void set(TimeX t, int a, int b, int c) {
        t.h = a;
        t.m = b;
        t.s = c;
    }

    static void print(TimeX t, String s) {
        System.out.printf("%02d:%02d:%02d%n",t.h,t.m,t.s);
    }

    static void inc(TimeX t, int x) {
        t.h+=x/3600;
        t.m+=x%3600/60;
        t.s+=x%3600%60;
        if(t.s>=60){
            t.s-=60;
            t.m++;
        }
        if(t.m>=60){
            t.m-=60;
            t.h++;
        }
        
        
        
        
    }
    static int diff(TimeX t1, TimeX t2){
        if(t2.s<t1.s){
            t2.s+=60;
            t2.m--;
        }
        if(t2.m<t1.m){
            t2.h+=60;
            t2.h--;
        }
        if(t2.h<t1.h){
            t2.h+=24;
        }
        return (t2.h-t1.h)*3600+(t2.m-t1.m)*60+(t2.s-t1.s);
}
}
public class HWK4_04 {

    public static void main(String[] args) {
        TimeX t1 = new TimeX();
        TimeX t2 = new TimeX();
        TimeX.set(t1, 17, 20, 30);
        TimeX.set(t2, 6, 35, 45);
        TimeX.print(t1, "t1=");
        TimeX.print(t2, "t2=");

        TimeX.inc(t2, 5000); //將t2的時間向前撥5000秒
        TimeX.print(t2, "t2=");
        int diff = TimeX.diff(t1, t2);
        System.out.println("diff of t1 and t2=" + diff);
    }
}
/*
[程式輸出] :Time.diff(t1,t2):若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2為隔天時間
t1 = 17:20:30
t2 = 06:35:45
t2 = 07:58:20
diff of t1 and t2 = 52670 sec(s) 
 */
