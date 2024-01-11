import java.util.Random;
public class ex31 {
    public static void main (String[]args){
        Random r= new Random(111);
        double[] temp= new double[30];
        double sum=0, avg=0;
        for(int i=0; i<temp.length; i++){
            temp[i]=r.nextDouble()*13+15;
            
            sum+=temp[i];
            avg=sum/temp.length;
           
        }
        for(double tt:temp){
            System.out.println(tt%.2f);
        }
        System.out.println("avg= "+avg);
        
    }
}
