import java.util.*;
public class MI1A_37_04 {
    public static void main(String[] args) {
        System.out.println("------ aboveAvg(a,aList) ------ 6%");
        int[] a = {28, 34, 95, 75, 82, 36, 90, 77, 57, 33} ;
        int[] aList = new int[a.length] ;
        int cnt = aboveAvg(a, aList) ;
        System.out.println("#Above_average of a[] = "+cnt);        
        System.out.println("List of above_average = "+Arrays.toString(Arrays.copyOf(aList,cnt)));

        System.out.println("------ getGrade(score) ------ 7%");
        int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 98, 73, 68, 59, 42} ;
        int[] grade = getGrade(score) ;
        System.out.println("grade[]="+Arrays.toString(grade));
        
        System.out.println("------ subMatrix(m, r1, c1, r2, c2) ------ 4%");
        int[][] m1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}} ;
        subMatrix(m1, 1, 1, 2, 3); // 左上(1,1), 右下(2,3) 
        
        System.out.println("------ transform(b[], shape[]) ------ 8%");
        int[] b = {1,2,3,4,5,6,7,8,9} ;
        int[] shape={4,2,3} ;
        int[][] m2 = transform(b, shape) ;
        for (int[] arr:m2)
            System.out.println(Arrays.toString(arr));
    }
    public static int aboveAvg(int a[], int aList[]) { // 6%
        // [功能]: 將a[]中高於平均值的元素依序存於aList[]中，並將個數傳回
        int cnt = 0 ; // 記錄高於平均值的元素個數
        int sum=0, avg;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        avg= sum/a.length;
        for (int i=0; i<a.length; i++){
            if(a[i]>avg)cnt++;
            
        }
        aList= new int[cnt];
        int index=0;
        for (int i=0; i<a.length; i++){
            if(a[i]>avg)aList[index++]=a[i];
            
        }
       
        return cnt ; 
    }
    public static int[] getGrade(int[] score) { // 7%
        // [說明]: 已知分數(百分制)與級分(1-10級分)的對應表如下: 
        //    18(1), 27(2), 41(3), 55(4), 70(5), 80(6), 84(7), 90(8), 95(9), 100(10)
        //    意義為: 18分以下(不含18)者1級分，18-27分(不含27)者2級分, ....類推
        // [功能]: 請將score[]中的分數轉換為級分後傳回
        // [注意]: 本題需使用查表法，使用if-else者不給分
        int [] lim={18,27,41,55,70,80,84,90,95,100};
         int[] rlt = new int[score.length] ;
         
        for (int i=0; i<score.length; i++){
             for (int j=0;j<lim.length; j++){
                 if (score[i]>lim[j])rlt[i]=(j+1);
             }
        }
        

        return rlt ;
    }
    public static void subMatrix(int[][] m, int r1, int c1, int r2, int c2) { // 4%
        // [功能]: 印出m[][]中(r1,c1)~(r2,c2)中的子陣列
        // [說明]:  左上角(r1,c1), 右下角(r2,c2) 
		// DIY here
        for (int i=r1; i<r2; i++){
            for (int j=c1; j<c2; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] transform(int[] a, int[] shape) { // 8%
        // [功能]: 依照shape[]中指定的每列個數，將a[]轉換為二維陣列傳回
        // [說明]: 若a[]={1,2,3,4,5,6}, shape[]={2,3,1}, 則結果將會是
        //         rlt[][] = {{1,2}, {3,4,5}, {6}} 
        int [][] x= new int[shape.length][];
        int index=0;
        for (int i=0; i<shape.length; i++){
            
            for (int j=0; j<shape[i]; j++){
                x[i][j]=a[index++];
                
            }
        }
        return x; // DIY, 自行修改
    }
}
/* [程式輸出]
------ aboveAvg(a,aList) ------ 6%
#Above_average of a[] = 5
List of above_average = [95, 75, 82, 90, 77]
------ getGrade(score) ------ 7%
grade[]=[1, 2, 3, 3, 4, 5, 6, 7, 9, 10, 6, 5, 5, 4]
------ subMatrix(m, r1, c1, r2, c2) ------ 4%
6	7	8	
10	11	12	
------ transform(b[], shape[]) ------ 8%
[1, 2, 3, 4]
[5, 6]
[7, 8, 9]
*/
