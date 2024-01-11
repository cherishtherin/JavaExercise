
import java.util.Arrays;

public class array2d {

    public static void main(String args[]) {
        int m = 5, n = 3;
        int[][] x = new int[3][5];
        int index = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = index++;
            }

        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
        
        int [] rowLen={2,3,4};
        int [][] mx=new int [3][];
        int tel=1;
       for(int i=0; i<mx.length; i++){
           mx[i]= new int [rowLen[i]];
           for (int j=0; j<mx[i].length; j++){
               mx[i][j]=tel++;
           }
       }
        for(int i=0; i<mx.length; i++){
            System.out.println(Arrays.toString(mx[i]));
        }
    }
}
