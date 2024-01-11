
import java.util.Arrays;

public class MI1A_37_02 {
     public static void main(String[] args) {
        int[] ct = {12, 20, 30, 36, 22, 15, 18, 25, 28, 32} ;
        int[] level = infectLevel(ct) ;
        System.out.println("CT values="+Arrays.toString(ct));
        System.out.println("Infection Level="+Arrays.toString(level));
        
        int[] cnt = count(level) ;
        System.out.println("count[]="+Arrays.toString(cnt));
        
        int[] data = {15, 27, 27, 33, 45, 45, 45, 57, 88, 99, 99, 100} ; 
        int[] data2 = removeDuplicate(data) ;
        System.out.println("removeDuplicate(data), data2[]="+Arrays.toString(data2));
    }
    public static int[] infectLevel(int[] ct) { // 15%
        // 已知肺炎CT值與傳染程度值的對應表如下: 
        // CT值:   <16  16-20,  21-27,  28-31,  32-34,  >=35
        // 傳染力:   5    4      3      2      1      0
        // 請使用[查表法]，將CT值陣列(ct[])轉換為對應之傳染力陣列(參考程式輸出)
        int [] ctlvl={Integer.MIN_VALUE,16,20,27,31,34};
        int[] power= {5,4,3,2,1,0};
        int [] temp= new int [ct.length];
    
        for (int i=0; i<ct.length; i++){
             for (int j=0; j<ctlvl.length; j++){
            if (ct[i]>ctlvl[j]){
                temp[i]=power[j];
            }
        }
        }
       return temp;
    }
    public static int[] count(int[] level) { // 5%
        // 統計level[]中各種值出現的次數 (只有0,1,2,3,4,5共6種)
        int [] temp= new int[6];
       for (int i=0; i<level.length; i++){
            for (int j=0; j<temp.length; j++){
                if (level[i]==j)temp[j]++;
            }
       }
       return temp;
    }
    public static int[] removeDuplicate(int[] data) { // 10%
        // 將data[]中重複的元素去除，並存於一新陣列傳回
        int [] a= new int[data.length];
        for (int i=0; i<a.length ;i++){
            a[i]=data[i];
        }
       for (int i=0; i<a.length ;i++){
           for (int j=i+1; j<a.length; j++){
               if(data[i]==a[j])a[j]=0;
           }
       }
           int cnt=0;
           for (int i=0; i<a.length ;i++){
               if(a[i]!=0)cnt++;
           }
           data= new int[cnt];int index=0;
           for (int i=0; i<a.length ;i++){
               if(a[i]!=0)data[index++]=a[i];
           }
       
     return data;           
            
        
    }
}
/* [程式輸出]
CT values=[12, 20, 30, 36, 22, 15, 18, 25, 28, 32]
Infection Level=[5, 4, 2, 0, 3, 5, 4, 3, 2, 1]
count[]=[1, 1, 2, 2, 2, 2]
removeDuplicate(data), data2[]=[15, 27, 33, 45, 57, 88, 99, 100]
*/

