
import java.util.Arrays;

public class HWK6_409630497_03 {

    public static void main(String[] args) {
        int[] source = {18, 25, 33, 7, 20};
        System.out.println("source[]=" + Arrays.toString(source));
        int[] desti = copyN(source, 3);  
        System.out.println("desti[]=" + Arrays.toString(desti));
    }

    public static int[] copyN(int[] source, int times) {
        int [] x= new int [source.length*times];
        for (int i=0; i<x.length;i++){
            x[i]=source[i%source.length];
        }
        return x;
// DIY     
    }
}
