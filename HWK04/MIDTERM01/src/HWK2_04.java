
import java.util.Arrays;
import java.util.Random;

public class HWK2_04 {
    public static void main(String[] args) {
        Random r = new Random(222);
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1001);
        }
        System.out.println("a[]="+Arrays.toString(a));
        // DIY 
        // 印出a[]中的最大值與最小值
        // 並印出其所在的註標(index)
        int maxIndex = 0 ;
        for (int i=1; i<a.length; i++) {
            if (a[i]>a[maxIndex]) maxIndex = i ;
        }
        System.out.println("max="+a[maxIndex]+", index="+maxIndex );
        int minIndex=0;
        for (int i=0; i<a.length; i++){
            if (a[i]<a[minIndex])minIndex=i;
        }
        System.out.println("min="+a[minIndex]+", index="+minIndex );

    }    
}
/*
a[]=[946, 510, 517, 330, 992, 909, 163, 554, 541, 579, 682, 157, 574, 747, 140]
max=992, index=4
min=???, index=??
*/