import java.util.*;
public class pg28 {
    public static void main(String[]args){
        Scanner cin=new Scanner (System.in);
        double tax;
        System.out.println("income=");
        double income=cin.nextInt();
        if(income<240000){
            tax=0;
        }
        else if(income>1000000){
            tax=income*0.13;
        }
        else{
            tax=income*0.06;
        }
        System.out.println("tax="+tax);
        
    }
}
