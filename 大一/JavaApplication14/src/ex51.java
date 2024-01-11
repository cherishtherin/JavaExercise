import java.util.Random;
public class ex51 {
    public static void main (String[]arsg){
        Random r= new Random (111);
        int studNo=100;
        int [] score= new int[studNo];
        for (int i=0; i<score.length; i++){
            score[i]=r.nextInt(101);
            System.out.println(score[i]);
        }
        int [] cnt= new int[11];
         for (int i=0; i<score.length; i++){
             score[i]=score[i]/10;
             for (int j=0; j<cnt.length; j++){
                 if(score[i]==j)cnt[j]++;
                
             }
         }
         for (int j=0; j<cnt.length; j++){
             System.out.println("["+j+"]"+cnt[j]);
         }
    }
}
