import java.util.*;
public class HWK1_409630497_04 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        int x,y;
        System.out.println("input number:");
        x= cin.nextInt();
        y= cin.nextInt();
        int z= myPower(x,y);
        System.out.println(x+"**"+y+"="+z);
    }
    public static int myPower(int x, int y){
        int i=1,pow=1;
        while(i<=y){
           pow *=x;
           i++;
        }
        return pow;
        
    }
    
}
