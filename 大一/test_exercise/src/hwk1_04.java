import java.util.*;
public class hwk1_04 {
    public static void main (String []args){
        Scanner cin= new Scanner (System.in);
        int x, y;
        System.out.println("input x, y: ");
        x = cin.nextInt();
        y= cin.nextInt();
        double pow = power (x,y);
        System.out.println(x+"**"+y +" = "+pow);
    }
    public static  double power (int x, int y){
        return Math.pow(x,y);
    }
}
