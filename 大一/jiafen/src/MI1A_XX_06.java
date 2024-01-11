import java.util.Arrays;
public class MI1A_XX_06 {
    public static void main(String[] args) {
	
        int a[] = {12, 13, 14, 15, 16, 17} ;
        int b[] = {34, 28, 71, 89} ;
        System.out.println("---- concat(a[],b[])---- 5%");
        int[] c = concat(a,b) ;
        System.out.println("c[]=a[]+b[]="+Arrays.toString(c));    
	
        System.out.println("---- count(data[])---- 7%");        
        int[] data = {88, 74, 69, 12, 85, 89, 72, 43, 15, 43, 39, 78, 8} ;
        int[] cnt = count(data) ;
        System.out.println("cnt[] = "+Arrays.toString(cnt));
	
	
        System.out.println("---- delRepeat(d[])---- 9%");
        int[] d = {1,2,2,2,3,3,4,5,6,7,7,7,7,9,2,2,2,4,4} ;
        System.out.println("d[]="+Arrays.toString(d));
        int[] unique = delRepeat(d) ;
        System.out.println("unique[]="+Arrays.toString(unique));
	
    }
        public static int[] concat(int []a,int[] b){
            int [] x= new int [a.length+b.length];
            for (int i=0; i<a.length; i++){
                x[i]=a.length;
            }
            for (int i=a.length; i<x.length; i++){
                x[i]=b[i-a.length];
            }
            return x;
        }

    public static int[]count(int []score){
        int [] x= {0,0,0,0,0,0,0,0,0,0,0};
        for (int i=0; i<score.length; i++){
            int a=score[i]/10;
            x[a]++;
        }
        return x;
    }
    public static int[]delRepeat(int []a){
        int cnt=1, curr=a[0];
        for (int i=1; i<a.length; i++){
            if (a[i]!=curr){
                cnt++;
                curr=a[i];
        }
        }
        int [] x= new int[cnt];
        cnt=0;
        curr=a[0]; x[cnt++]=curr;
        for (int i=1; i<a.length; i++){
            if (a[i]!=curr){
                x[cnt++]=curr;
                curr=a[i];
            }
            
           
        }
        return x;
    }
    // [功能]: 將a[]中連續重複的元素去除，並將結果存於一新陣列中傳回
    // [注意]: 本題不可使用任何內建函數或轉為字串，否則不給分
}
/* [程式輸出]
---- concat(a[],b[])---- 5%
c[]=a[]+b[]=[12, 13, 14, 15, 16, 17, 34, 28, 71, 89]
---- count(data[])---- 7%
cnt[] = [1, 2, 0, 1, 2, 0, 1, 3, 3]
---- delRepeat(d[])---- 9%
d[]=[1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 7, 9, 2, 2, 2, 4, 4]
unique[]=[1, 2, 3, 4, 5, 6, 7, 9, 2, 4]
*/

