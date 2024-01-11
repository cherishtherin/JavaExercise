import java.util.Arrays;
import java.util.Random;

public class HWK3_XX_YY_02 {
    public static void main(String[] args) {
        System.out.println("--------- normalize() ----------");
        int[] a = {-10, 5, 18, -2, 33, -9, -14, 9} ; // -14: 0, 33:1
        System.out.println("a[]="+Arrays.toString(a)) ;
        
        // normalize(a) ; 
        System.out.println("after normalization, a[]="+Arrays.toString(a)) ;
        
        System.out.println("--------- distance() ----------");
        int[] x=new int[6], y=new int[6];
        Random r = new Random(111) ;
        for (int i = 0 ; i<x.length; i++) { // 填入[0,50]間的亂數
            x[i] = r.nextInt(51) ;  
            y[i] = r.nextInt(51) ;
        }
        System.out.println("x[]="+Arrays.toString(x)) ;
        System.out.println("y[]="+Arrays.toString(y)) ;
        
        double[] d=new double[6] ;
        // distance(x, y, d) ; 
        System.out.println("dist[] ="+Arrays.toString(d)) ;        
    }
    // DIY, 完成以下各函數
    // normalize(a[])
    // [功能]: 利用a[]中的最小值, 最大值對a[]中的值進行線性正規化
    
    // distance(x[],y[],d[]): 可接收三個陣列，
    // 前二個陣列(x[], y[])代表平面上各點的座標, 請將各點間的距離算出後，存入d[]中。
    // [例如]: (x[0],y[0])與(x[1],y[1])的距離存入d[0]中    
}
