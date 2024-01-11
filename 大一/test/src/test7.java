import java.util.*;
public class test7 {
    public static void main (String[]args){
    Scanner cin=new Scanner(System.in);
        System.out.print("input score");
        int score, sum ,cnt;
        double avg;
        int score1,sum1, cnt1,score2,sum2,cnt2,score3,sum3,cnt3;
        double avg1,avg2,avg3;
        score=cin.nextInt();
        cnt=1;sum=0;avg=0;
         cnt1=1;sum1=0;avg1=0;
          cnt2=1;sum2=0;avg2=0;
           cnt3=1;sum3=0;avg3=0;
        while(score>=0 && score<=100){
            sum+=score;
            avg=sum/cnt;
            cnt++;
           
            if(score>=60){
            sum1+=score;
            avg1=sum1/cnt1;
            cnt1++;
            }
            else if (score<40){
            sum2+=score;
            avg2=sum2/cnt2;
            cnt2++;
            }
            else{
            sum3+=score;
            avg3=sum3/cnt3;
            cnt3++;
            }
         score= cin.nextInt();
         
           
        }
        System.out.println("total_student="+cnt+", avg="+ avg);
        System.out.println("[60,100] StudNO="+cnt1+", avg="+avg1);
        System.out.println("[40,59] StudNO="+cnt3+", avg="+avg3);
        System.out.println("[0,39] StudNO="+cnt2+", avg="+avg2);
    
    }
}
