

/*
>有10筆記錄，
    格式: (id: int, gender: boolean, salary: double)
    範圍: id(1001~1200), gender(true, false), salary(40000.0, 100000.0) 
*/
import java.util.* ; 
public class P137_EX_ParallelArray {
    public static void main(String[] args) {
        Random r= new Random(111);
        int no = 10 ;
        int[] id = new int[no] ;
        boolean[] gender = new boolean[no] ; 
        double[] salary = new double[no] ;
        for (int i=0; i<no; i++){
         id[i]=1001+r.nextInt(200);
         gender[i]=r.nextBoolean();
         salary[i]=40000+60000*r.nextDouble();
         if(!gender[i]){
             System.out.printf("(id %d gender: girl salary: %.2f)\n",id[i],salary[i]);
         }
         else{
             System.out.printf("(id %d gender: boy salary: %.2f)\n",id[i],salary[i]);
         }
             
        
            
    }
}
}
