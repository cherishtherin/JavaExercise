import java.util.*;
public class pg42ex1 {
    public static void main (String[]args){
        Scanner cin= new Scanner(System.in);
        System.out.println("n:");
        int n=cin.nextInt();
        boolean flag= false;
        for(int i=2;i<n;i++){
            int x=n%i;
            if (x==0){
                flag=true;
                break;
        
            }
            
    }
        if(!flag){
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
    }
}

