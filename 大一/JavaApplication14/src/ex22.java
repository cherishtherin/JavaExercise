
public class ex22 {
    public static void main (String[]args){
        int []a= new int[11];
        a[0]=1;
        for(int i=1; i<=a.length-1; i++){
            a[i]= 2*a[i-1]+1;
        }
         for(int i=0; i<=a.length; i++){
             System.out.println(a[i]);
         }
    }
}
