import java.util.Arrays;
public class MI1A_37_01 {
        public static void main(String[] args) {
        int a = 2*2*3*3*3*5*7*11*13, b = 3*3*7*11*37 ;
        System.out.println("gcd(a,b)="+gcd(a,b));
        
        int[] c = {2*2*3*3*3*5*7*11*37, 3*3*7*11*37, 2*3*9*7*37*97, 3*3*7*11*37*43} ;
        System.out.println("gcdAll(c[])="+gcdAll(c));
        
        int[] x = {3, 7, 4, 6}, y={4, 1, 8, 2}, z={6,4,7,9} ;
        adjust(x,y,z) ;
        System.out.println("x[]="+Arrays.toString(x));
        System.out.println("y[]="+Arrays.toString(y));
        System.out.println("z[]="+Arrays.toString(z));
        
    }
    public static int gcd(int a, int b) { // 5%
        int gcd=0;
        int least=a;
        if (b<least)least=b;
        for (int i=2; i<=least; i++){
            if(a%i==0&&b%i==0)gcd=i;
        }
        return gcd;
    }
    public static int gcdAll(int[] data) { // 6%
        // 找出data[]中所有整數之最大公因數
        int get=data[0];
        for (int i=1; i<data.length; i++){
             get =gcd(get,data[i]);
            
        }
        return get;
// DIY, 自行修改
    }
    public static void adjust(int[] a, int[] b, int[] c) { // 8%
        // 比較a[0], b[0],c[0]，將最大的放在a[0], 次大存於b[0], 最小的存於c[0]
        // 依此施行至(a[1],b[1],c[1])(a[2],b[2],c[2]) .....
		// DIY here
          for (int i=0; i<a.length; i++){
              int [] x= {a[i],b[i],c[i]};
              int max=0;
              for (int j=0; j<x.length; j++){
                  if (x[j]>max)max=x[j];
              }
              a[i]=max;
              int max2=0;
              for (int j=0; j<x.length; j++){
                  if(x[j]>max2&&x[j]<max)max2=x[j];
              }
              b[i]=max2;
               int min=x[0];
               for (int j=0; j<x.length; j++){
                   if(x[j]<min)min=x[j];
               }
              c[i]=min;
          }      
    }
   
}
/* [程式輸出]
gcd(a,b)=693
gcdAll(c[])=2331
x[]=[6, 7, 8, 9]
y[]=[4, 4, 7, 6]
z[]=[3, 1, 4, 2]
*/


