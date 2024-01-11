import java.util.*;
public class hwk1_05 {
    public static void main (String[]args){
        Scanner cin = new Scanner (System.in);
       while(true){
        int c, k;
        System.out.println("input (c ,k) :");
        c= cin.nextInt();
        k= cin.nextInt();
        double cnk=cnK(c,k);
           System.out.println("Cnk :"+cnk);
           System.out.println("continue(y/n): ");
           String con=cin.next();
           if(con.equals("n")){
               System.out.println("Bye!");break;
           }
       }
    }
    public static double cnK(int c, int k){
        double up=1, down=1;
        for(int i=c; i>(c-k); i--){
            up*=i;
        }
        for(int i=1; i<=k; i++){
            down*=i;
        }
        return up/down;
    }
}
