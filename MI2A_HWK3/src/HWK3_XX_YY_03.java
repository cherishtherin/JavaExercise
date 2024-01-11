

import java.util.Arrays;

public class HWK3_XX_YY_03 {
    public static void main(String[] args){
        System.out.println("------- concat() --------");
        int[] a = {1, 2, 3, 4} ;
        int[] b ={15, 28, 99, 44, 55} ;
        System.out.println("a[]="+Arrays.toString(a));
        System.out.println("b[]="+Arrays.toString(b));

        // int[] c = concat(a, b) ;                
        // System.out.println("c[]=a[]+b[]="+Arrays.toString(c));
        
        System.out.println("------- calRowAvg() --------");
        int[][] data = {{18,22,39,33}, {28, 35, 29}, {15, 26, 27, 93, 88}} ;             
        double[] rowAvg = {0, 0, 0}; // 完成calRowAvg()之後，請刪除此行。            
        // double[] rowAvg = calRowAvg(data) ;
        System.out.println("avg of row1 ="+rowAvg[0]) ;
        System.out.println("avg of row2 ="+rowAvg[1]) ;
        System.out.println("avg of row3 ="+rowAvg[2]) ;        
    }
    // DIY, 完成以下函數，並產生規定功能 
    // concat(a[], b[]): 將a[], b[]串接後，回傳串接後的新陣列 
    
    // calRowAvg(m[][]): 接收一個二維陣列m，並將其列平均傳回(一個一維陣列)
}
/* [程式輸出]
a[]=[1, 2, 3, 4]
b[]=[15, 28, 99, 44, 55]
c[]=a[]+b[]=[1, 2, 3, 4, 15, 28, 99, 44, 55]
*/
