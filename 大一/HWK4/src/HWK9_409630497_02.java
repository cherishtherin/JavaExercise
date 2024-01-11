

import java.util.* ; 

public class HWK9_409630497_02 {
    public static void main(String[] args) {
	int size=20; 
	int[] a = new int[size] ;
	Random r = new Random(111) ; 
	for(int i=0; i<a.length; i++){
            a[i]=-10+r.nextInt(21);
        }       
        System.out.println("a[]="+Arrays.toString(a));
        
	int[] pos = new int[size] ; // 最多可以裝20個元素的容器
	int[] neg = new int[size] ; // 最多可以裝20個元素的容器
	int posNo=0, negNo=0; 
	for (int i=0; i<a.length ;i++){
            if(a[i]>=0)pos[posNo++]=a[i];
            else neg[negNo++]=a[i];
        }
        System.out.println("pos[]="+Arrays.toString(pos));
        System.out.println("neg[]="+Arrays.toString(neg));
        
	       System.out.printf("avg of pos %.2f \n", avg(pos));
               System.out.printf("avg of neg %.2f", avg(neg));
    }  
    public static double avg(int[]a){
        double sum=0,cnt=0;
        for (int i=0; i<a.length;i++){
            if(a[i]!=0){
                sum+=a[i];
                cnt++;
            }
        }
        return sum/cnt;
    }
}
/* [程式輸出]
a[]=[9, 10, -3, 10, -2, -6, 8, 7, 9, 8, 7, 5, 1, 4, 9, -8, 5, -5, 4, -10]
pos[]=[9, 10, 10, 8, 7, 9, 8, 7, 5, 1, 4, 9, 5, 4, 0, 0, 0, 0, 0, 0]
neg[]=[-3, -2, -6, -8, -5, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
avg of pos[]=6.86
neg of neg[]=-5.67
*/