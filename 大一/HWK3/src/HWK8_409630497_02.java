import java.util.Random;
public class HWK8_409630497_02{
    public static void main (String[]args){
      
        Random r = new Random(111);
        int data_num = 10;
        int[] id = new int[data_num];
        boolean[] gender = new boolean[data_num];
        double[] salary = new double[data_num];
        for (int i=0; i<data_num; i++){
            id[i]=1001+r.nextInt(200);
            gender[i]=r.nextBoolean();
            salary[i]= r.nextDouble()*60000+40000;
            if (gender[i]!=true)
            {System.out.printf("#%d\t%d\tmale\t%.1f\n",(i+1),id[i],salary[i]);}
            else{ System.out.printf("#%d\t%d\tfemale\t%.1f\n",(i+1),id[i],salary[i]);}
        }
    }
}