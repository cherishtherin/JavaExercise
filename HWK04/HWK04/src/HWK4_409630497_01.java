class Time{
    int h,m,s;
}
//time1=23:20:25,  time2=09:30:45
public class HWK4_409630497_01 {
    public static void main (String[]args){
        Time t1= new Time(),t2= new Time();
        t1.h=23;t1.m=20;t1.s=25;
        t2.h=9;t2.m=30;t2.s=45;
       printTime("1",t1,t1.h,t1.m,t1.s);
       printTime("2",t2,t2.h,t2.m,t2.s);
       Time t3= new Time();
       if (t1.s<t2.s){
           t3.s=t1.s+60-t2.s;
           t1.m--;
           if(t1.m<t2.m){
               t3.m=t1.m+60-t2.m;
               t1.h--;
               t3.h=t1.h-t2.h;
           }
           else{
               t3.m=t1.m-t2.m;
               t3.h=t1.h-t2.h;
           }
       }
       else {
           t3.s=t1.s-t2.s;
           if(t1.m<t2.m){
               t3.m=t1.m+60-t2.m;
               t1.h--;
               t3.h=t1.h-t2.h;
           }
           else{
               t3.m=t1.m-t2.m;
               t3.h=t1.h-t2.h;
           }
           
       }
       printTime("diff",t3,t3.h,t3.m,t3.s);

    }
    static void printTime(String n,Time t, int h, int m, int s){
        
        System.out.println("Time "+n+"  "+h+":"+m+":"+s);
    }
    
}
