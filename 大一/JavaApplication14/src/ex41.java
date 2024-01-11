import java.util.*;
import java.util.Random;
public class ex41 {
   public static void main (String[]args){
       Scanner cin = new Scanner(System.in);
       Random r= new Random(111);
       int studNo=100;
       int [] score= new int[studNo];
       for(int i=0; i<score.length; i++){
           score[i]= r.nextInt(101);
           
       }
       System.out.println("input key:");
       int key= cin.nextInt();
       int cnt=0;
       for(int i=0; i<score.length; i++){
           if(score[i]==key){
               cnt++;
               System.out.println("["+i+"] = "+ key);
           }
       }
               System.out.println("cnt ="+cnt);
   } 
}
