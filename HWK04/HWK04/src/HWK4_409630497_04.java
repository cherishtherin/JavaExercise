
class TimeX { // 24小時進制的時間
    int h, m, s ; 
     //DIY here, 依照main()中的需求，自行加入以下之靜態函數
    static void set(TimeX t, int h, int m, int s) {
    t.h=h;t.m=m;t.s=s;
    }
    static void print(TimeX t, String s){
         System.out.println(s +" = "+t.h+":"+t.m+":"+t.s);
     }
     static void inc(TimeX t, int x){
         int hour, min, sec;
         hour= x/3600;
         x-=(hour*3600);
         min=x/60;
         sec=x-(60*min);
         t.h+=hour;
         t.m+=min;
         t.s+=sec;
         if (t.s>=60){
             t.s-=60;
             t.m++;
         }
         if(t.m>=60){
             t.m-=60;
             t.h++;
         }
         
     }
     static int diff(TimeX t1, TimeX t2){
         int hour, min, sec;
        if(t2.s<t1.s){
            sec=t2.s+60-t1.s;
            t2.m--;
            if(t2.m<t1.m){
                min= t2.m+60-t1.m;
                t2.h--;}
            else{
                min=t2.m-t1.m;
            }
                if(t2.h<t1.h)
                    hour=t2.h+24-t1.h;
                else hour=t2.h-t1.h;
        }
        else{
            sec=t2.s-t1.s;
            if(t2.m<t1.m){
                min= t2.m+60-t1.m;
                t2.h--;}
            else{
                min=t2.m-t1.m;
            }
                if(t2.h<t1.h)
                    hour=t2.h+24-t1.h;
                else hour=t2.h-t1.h;
        }
        return hour*3600+min*60+sec;
     }
     
}
public class HWK4_409630497_04{
    public static void main(String[] args) {
	TimeX t1 = new TimeX();
      TimeX t2 = new TimeX();
	TimeX.set(t1,17, 20, 30) ;	
      TimeX.set(t2, 6, 35, 45) ;
        TimeX.print(t1, "t1="); 	
      TimeX.print(t2, "t2=") ;

	TimeX.inc(t2, 5000) ; //將t2的時間向前撥5000秒
	TimeX.print(t2, "t2=") ; 
	int diff = TimeX.diff(t1, t2) ; 
	System.out.println("diff of t1 and t2="+diff) ; 
    }
     
}
/*
[程式輸出] :Time.diff(t1,t2):若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2為隔天時間
t1 = 17:20:30
t2 = 06:35:45
t2 = 07:58:20
diff of t1 and t2 = 52670 sec(s) 
*/