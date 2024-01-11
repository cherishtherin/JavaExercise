import java.util.Arrays;
public class pg103 {
    public static void main (String[]args){
     int [] data = {2,49,-29,3,-39,48,-29};
     int [] pos= getPos(data);
        System.out.println(Arrays.toString(pos));
        int [] a= {1,2,3,4};
        int [] b= {15,22,34,57};
        System.out.println(Arrays.toString(concat(a,b)));
    }
    
    public static int [] getPos(int []x){
       
       int cnt=0;
       for (int i=0; i<x.length; i++){
           if (x[i]>0)cnt++;
       } 
       int a[] = new int[cnt];int index=0;
        for (int i=0; i<x.length; i++){
            if (x[i]>0)a[index++]=x[i];
        }
        return a;
    }
    public static int[] concat(int[]a ,int [] b){
        int [] c= new int [a.length+b.length];
        for (int i=0 ;i<c.length; i++){
            if (i<a.length)c[i]=a[i];
            else c[i]=b[i-a.length];
        }
        
        return c;
    }
}
