
import java.util.Arrays;
public class HWK09_409630497_01 {
    public static void main(String[] args) {
        String s = "Peter,15,35,44,77\nMary,88,65\nPaul,45,63,85" ;        
        //  利用split()函數切割s，並計算印出每列的平均
        String [] ss= s.split("\n");
        for (int i=0;i<ss.length; i++){
            double sum=0;
            String []ss2= ss[i].split(",");
            System.out.print (ss2[0]+"\t");
            for (int j=1; j<ss2.length; j++){
                System.out.print(ss2[j]+" ");
                sum+=Double.valueOf(ss2[j]);
            }
            System.out.printf("(%.2f) \n",(sum/(ss2.length-1)));
        }
    }    
}
/* [程式輸出]
Peter	15 35 44 77 (42.75)
Mary    88 65 (76.50)
Paul 	45 63 85 (64.33)
*/