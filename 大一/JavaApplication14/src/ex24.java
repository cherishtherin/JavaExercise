import java.util.Random;
public class ex24 {
    public static void main (String[]args){
        Random r= new Random(111);
        int[] score= new int[50];
        double[]n= new double[50];
        int sum=0;
        double avg,std = 0;
        for(int i =0; i<score.length; i++){
            score[i]= r.nextInt(101);
            sum+= score[i];
            System.out.println(score[i]);
        }
        avg=sum/score.length;
        System.out.println("avg= "+avg);
        for(int i =0; i<score.length; i++){
            n[i]= Math.pow((score[i]-avg),2);
            std+=n[i];
        }
        std=Math.sqrt(std/(n.length-1));
        System.out.printf("std=%.2f ",std);
    }
}
