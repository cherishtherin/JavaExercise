import java.util.Arrays;

public class HWK2_409630497_03 {
    public static void main(String[] args) { 
        int[] a = {10, 40, 70, 30, 20} ;
        System.out.println("a[]="+Arrays.toString(a));// 印出a[]的內容
        
	int[] b = new int[15] ;
        fillArray(a, b) ; // 用a[]重複填滿b[]
        System.out.println("b[]="+Arrays.toString(b));// 印出b[]的內容
        
      	int[] c = new int[17] ;
        fillArray(a, c) ; // 用a[]重複填滿c[]
        System.out.println("c[]="+Arrays.toString(c));// 印出c[]的內容

    }
    public static void fillArray(int[] source, int[] target) {
        // 用soure[]重複填滿target[]
        int x=0;
        for (int i=0; i<(target.length/source.length); i++){
	System.arraycopy (source,0,target,x,source.length);      
            x+=source.length;
        }
        if(target.length%source.length!=0){
            System.arraycopy (source,0,target,x,target.length%source.length);  
        }
    }   
}
/* [程式輸出]
a[]=[10, 40, 70, 30, 20]
b[]=[10, 40, 70, 30, 20, 10, 40, 70, 30, 20, 10, 40, 70, 30, 20]
c[]=[10, 40, 70, 30, 20, 10, 40, 70, 30, 20, 10, 40, 70, 30, 20, 10, 40]
*/
