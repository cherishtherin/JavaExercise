
public class HWK7_409630497_02 {
     public static void main (String[]args){
        int [] a= {5,1,9,2,7};
        reversePrint (a,a.length-1);
    }
    public static void reversePrint(int []a, int x){
        if(x==-1){
            System.out.println();
            return;
            
        }
        System.out.print(a[x]+"\t");
        reversePrint(a,x-1);
    }
}

