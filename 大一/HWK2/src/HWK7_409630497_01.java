
public class HWK7_409630497_01 {
    public static int cnk(int n, int k){
       
        if(k==0)return 1;
        if(k==n)return 1;
        if(k>n)return 0;
        
        return cnk(n-1, k-1)+cnk(n-1,k);
    }
    public static void main (String[]args){
        System.out.println(cnk(5,3));
    }
}
