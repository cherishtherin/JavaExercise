import java.util.* ;
import java.util.Arrays;
public class MI1A_XX_04 {
    public static void main(String[] args) {
        Random r1 = new Random(111) ;
        Random r2 = new Random(222) ;
        int[] a = new int[19]; 
        System.out.println("------ RandomFill() ----- 5%");
        randomFill(a, r1, r2, -20, 20, -10, 30) ;
        System.out.println("------ printArray() ----- 5%");
        printArray("a[]=", a, 10) ;
        
        System.out.println("----- buildAcc(a,acc) ---- 4%");
        int[] acc = new int[a.length] ; 
        buildAcc(a,acc) ;
        printArray("acc[]=",acc,8) ;
        
        System.out.println("----- move(a[]) ---- 8%");
        int[] a3 = {10, -20, -1, -3, 2, 5, 7, -2, -9, 4, 1, -7} ;
        printArray("Originally, a3[]=",a3,15) ;
        move(a3) ; // 將正數移至陣列前段，負數移至後段
        printArray("move(a3), a3[]=",a3,15) ;            
    }
    
    public static void randomFill(int[] a, Random r1, Random r2, 
            int lb1, int ub1, int lb2, int ub2) { // 5%
        // 利用亂數物件r1將[lb1,ub1]中的整數填入a的偶數位置元素, a[0], a[2] ,...
        // 利用亂數物件r2將[lb2,ub2]中的整數填入a的偶數位置元素, a[1], a[3] ,...
        for (int i=0; i<a.length; i++){
            if(i%2==0){
                a[i]=lb1+r1.nextInt(ub1-lb1);
            }
            else{
                a[i]=lb2+r2.nextInt(ub1-lb1);
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void printArray(String msg, int[] a, int itemPerLine) { // 5%
       for (int b=0; b<a.length; b++){
           if(b%10==0){
               System.out.println("");
               System.out.print(a[b]+"\t");
           }
           else{
                System.out.print(a[b]+"\t");
           }
        }
        System.out.println("");
    }
    public static void buildAcc(int[] a, int acc[]) { // 4%
        // [功能]: 將a[]的累加值存於acc[]中，acc[i] = a[0]+a[1]+...+a[i]
		// DIY here
        for (int i=0; i<acc.length ;i++){
                acc[i]=0;
                for (int j=i; j>=0;j--){
                    acc[i]+=a[j];
            }
        }        
    }
    public static void move(int[] a) { // 8%
        // [功能]: 移動a[]的內容，讓正數集中於前段，負數在後段(參考程式輸出)
        //        移動的方式如下，(本題需依照以下步驟撰寫，否則不給分)
        //        (a) 逐一檢查a[]的內容，碰到負數即停止，
        //        (b) 再檢查其後的整數，碰到第一個正數即停止
        //        (c) 將(a),(b)找到的負數與正數對調
        //        (d) 持續執行(a)(b)(c)一直到陣列後段已全為負數，或到達陣列末尾
        int cnt=1;
        while(cnt!=0){
        int neg=0, negDigi=0, pos=0, posDigi=0;
	for (int i=0; i<a.length/2;i++){
            if (a[i]<0){neg=a[i];negDigi=i;break;}
        }
        
        for (int i=negDigi; i<a.length;i++){
            if (a[i]>0){pos =a[i]; posDigi=i;break;
                
            }
        }
        a[negDigi]=pos;a[posDigi]=neg;
         cnt=0;
        for(int i=0; i<a.length/2; i++){
            if(a[i]<0)cnt++;
        }
        }
        System.out.print(Arrays.toString(a));
    }    
}
/* [程式輸出]
------ RandomFill() ----- 5%
------ printArray() ----- 5%
a[]=
-11	63	15	49	1	33	-1	32	-13	51	
-17	37	11	37	7	36	18	66	-4	
----- buildAcc(a,acc) ---- 4%
acc[]=
-11	52	67	116	117	150	149	181	
168	219	202	239	250	287	294	330	
348	414	410	
----- move(a[]) ---- 8%
Originally, a3[]=
10	-20	-1	-3	2	5	7	-2	-9	4	1	-7	
move(a3), a3[]=
10	2	5	7	4	1	-3	-2	-9	-20	-1	-7	
*/
