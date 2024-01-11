import java.util.*;
public class pg48ex1 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
        System.out.println("input num:");
         String suit=cin.next();
         switch (suit){
             case "1":
                 System.out.println("good");break;
             case "2":
                 System.out.println("excellent");break;
                 
             case"3":
                 System.out.println("perfect");break;
             default:
                 System.out.println("wrong!");
         }
                 
        
    }
}
