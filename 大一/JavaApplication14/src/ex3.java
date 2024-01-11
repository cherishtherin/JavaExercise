import java.util.*;
public class ex3 {
    public static void main (String[]args){
         Scanner cin = new Scanner (System.in);
         
         int cnt=0;
         while(true){
             System.out.print("year:");
             int year= cin.nextInt();
             if(year<1900){
                 cnt++;
                 System.out.println("wrong input try again");
             }
             else{
                 cnt=0;
                 if(year%4==0 &&year %100!=0|| year%400==0){
                     System.out.println(year+"is a leap year");
                 }
                 else{
                     System.out.println(year+"is not a leap year");
                 }
             }
             if(cnt==3)break;
             
    }
         System.out.println("fail");
    }
}
