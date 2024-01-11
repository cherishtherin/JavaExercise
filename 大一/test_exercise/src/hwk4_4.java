
import java.util.Random;
public class hwk4_4 {
    public static void main (String[]rags){
        Random r= new Random(111);
        int [] score = new int[50];
        randomFill(score, r, 20,80);
    }
    public static void randomFill(int [] x, Random r, int lb, int ub){
        for(int i= 0; i<x.length; i++){
            x[i]=lb+r.nextInt(lb-ub);
        }
        
    }
    public static double avg(   )
}
