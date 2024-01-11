import java.util.*;
import java.util.Random;
public class HWK4_409630497_02 {
    public static void main (String[]args){
        
        int [] score= new int[50];
        Random r= new Random(111);
        randomFill(score,r,20,80);
        System.out.println("a[] :"+Arrays.toString(score));
        double avg= avg(score);
        double std= std(score);
        System.out.printf("avg : %.3f\n",avg);
        System.out.printf("std : %.3f\n",std);
        int max= max(score);
        int max2= maxSec(score);
        System.out.println("max :"+ max +"\tmax 2 :"+max2);
        
    }
    public static void randomFill(int []a, Random r, int lb, int ub){
       
       for(int i =0; i<a.length; i++){
           a[i]=lb+r.nextInt(ub-lb-1);
           
       }
    }
    public static double avg(int[]a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+= a[i];
        }
        return (double)sum/(double)a.length;
    }
    public static double std(int []a){
        double average= avg(a);
        double stdSum=0;
        for(int i =0; i<a.length; i++){
            stdSum+=Math.pow((a[i]-average),2);
        }
        return Math.sqrt(stdSum/a.length);
        
    }
    public static int max(int[]a){
        int max=a[0];
        for(int i =1; i<a.length; i++){
            if(a[i]>max)max=a[i];
        }
        return max;
    }
    public static int maxSec(int[]a){
        int max2=0;
        int max= max(a);
        for(int i =1; i<a.length; i++){
           if(a[i]>max2&&max!=a[i])max2=a[i];
           
        }
        return max2;
    }
}
