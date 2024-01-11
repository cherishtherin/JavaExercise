
public class random {
    public static void main (String[]args){
       
    int [] arr = {8, 9, 10, 2, 5, 6};
    System.out.println("max is "+max(arr,arr[0]));
    int [] arr2 = {8, 9, 10, 12, 15};
    System.out.println("max is "+max(arr2,0));
    int [] arr3 = {10, 8, 6, 5, 3, 2};
    System.out.println("max is "+max(arr3,0));
    
    
        
    }

public static int max(int[]a, int start){
    if (start==a.length-1)return start;
    if(a[start]>a[++start])start=a[start];
    else start=a[++start];
    int [] x= new int [a.length-1];
    x[0]=x[start];
    for (int i=1; i<x.length; i++){
        x[i]=a[i];
    }
    return max(x,start);
}
}
