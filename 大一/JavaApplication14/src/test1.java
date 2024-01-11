
import java.util.Random;

public class test1 {

    public static void main(String[] args) {
        Random r = new Random(111);
        int[] score = new int[35];
        int fail_cnt = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = r.nextInt(71) + 20;
            if (score[i] < 60) {
                fail_cnt++;
            }
            if ((i + 1) % 6 == 0) {
                System.out.println(score[i]);
            } else {
                System.out.print(score[i] + "\t");
            }

        }
        System.out.println("");
        int []fail=new int[fail_cnt];
        int index=0;
        System.out.println("fail: "+fail_cnt);
        System.out.print("fail[]=[");
         for (int i = 0; i < score.length; i++) {
                if(score[i]<60&& index+1==fail_cnt){
                 System.out.print(score[i]+"]");}
                else if (score[i]<60){
             fail[index++]=score[i];
             System.out.print(score[i]+", ");
                
             }
             
         }
    }
}
