import java.util.Random;
public class ex42 {
    public static void main (String[]args){
        Random r= new Random (111);
    int[]a = new int[50];
    int sum=0;
    for(int i=0; i<a.length; i++){
        a[i]=r.nextInt(101);
        sum+=a[i];
    }
        System.out.println("sum = "+sum);
    int min=a[0];
    for(int i=0; i<a.length; i++){
        if(a[i]<min)min=a[i];
    }
    for(int i=0; i<a.length; i++){
        if(a[i]==min)
            System.out.println("["+i+"]"+min);
    }
        
    }
}
