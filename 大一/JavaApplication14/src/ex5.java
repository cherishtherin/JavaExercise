import java.util.*;
public class ex5 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        int a,b,c;
        
        while(true){
            a=cin.nextInt();
            b=cin.nextInt();
            c=cin.nextInt();
            if(a>b && a>c){
                if(a*a== b*b+c*c){
                    System.out.println("is a right angle");
                }
                else{
                    System.out.println("is not a rigth angle");break;
                }}
            else if(b>a && b>c){
                if(b*b== a*a+c*c){
                    System.out.println("is a right angle");
                }
                else{
                    System.out.println("is not a rigth angle");break;
                }}
            else if(c>b && c>a){
                if(c*c== b*b+a*a){
                    System.out.println("is a right angle");
                }
                else{
                    System.out.println("is not a rigth angle");break;
                }}
            
        
    }
        System.out.println("bye!");
    }
}