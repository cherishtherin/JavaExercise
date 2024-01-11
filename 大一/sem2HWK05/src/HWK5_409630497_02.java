public class HWK5_409630497_02 {
    public static void main(String[]args){
        int[] a={1,2,3,4};
        int[] b={15,28,99,105};
        int[] c=concat(a,b);
        for(int i=0;i<c.length;i++){
         System.out.println("c["+i+"}="+c[i]);
        }
    }
    public static int[] concat(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length;i<c.length;i++){
                c[i]=b[i-a.length];
        }
        return c;
    }
}