import java.util.*;
public class primechecker {
    public static void main (String[]args){
        Scanner cin= new Scanner (System.in);
        int n=0;
        
            while(n!=-1){
                System.out.print("input an integer:");
                n= cin.nextInt();
                int cnt=0;
                for(int i=2; i<n; i++){
                    if(n%i==0)cnt++;
                }
                if(cnt==0){
                    System.out.println(" is a prime");
                }
                else{
                    System.out.println(" is not a prime");
                }
            }
        
    }
}
