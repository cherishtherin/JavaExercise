
import java.util.*;

public class HWK1_409630497_02 {
     public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
     
        System.out.print("First Name, Last Name:");
        String Firstname = cin.next();
        String Lastname = cin.next();
        
         double h1, h2;
         System.out.print("Height=");
     
         h1 = cin.nextDouble();
         h2 = cin.nextDouble();
         h1*=30.3;
         h2*=2.54;
       double height;
         height=h1+h2;
         System.out.println("***Report***");
         System.out.println(Lastname + "," + Firstname+"\t"+ height+ "cm");
         
     }
}
