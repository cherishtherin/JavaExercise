import java.util.*;

public class ex2 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        
           System.out.println("input score:");
           int score= cin.nextInt();
           int res= score/20;
           while(score>0){
               switch(res){
                    case 0:
                       System.out.println("e");break;
                    case 1 :
                       System.out.println("d");break;
                    case 2:
                       System.out.println("c");break;
                    case 3:
                       System.out.println("b");break;
                    case 4:
                       System.out.println("a");break;
                    default:
                       System.out.println("a+");
                       
               }
               System.out.println("input score:");
               score=cin.nextInt();
               
           }
           
        
    }
    
}
