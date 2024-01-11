import java.util.*;
public class hwk2_01 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        while(true){
        int a,b;
            System.out.println("input a, b:");
            a= cin.nextInt();
            b= cin.nextInt();
            if(a==0&&b==0){System.out.println("bye!");break;}
            System.out.print("reduce a/b ?");
            frac(a,b);
        
        }
        
    }
    public static void frac(int a, int b){
        int gcd = 0;
        int least=a;
        if(b<a)least=b;
        for(int i=2; i<least; i++){
            if(a%i==0 && b%i==0)gcd=i;
        }
        int x,aa,bb;
        aa=a/gcd; 
        bb=b/gcd;
        if(a>b){
            x=a/b;
            System.out.println(x+" +  "+(aa-x*bb)+"/"+bb);
        }
        else{
            System.out.println(aa+"/"+bb);
        }
    }
}
