import java.util.Random;
public class shuffle {
    public static void main (String[]args){
        Random r= new Random (111);
        int [] deck= new int [52];
        for (int i=0; i<deck.length; i++){
            deck[i]=i;
        }
        for (int i=0; i<100; i++){
            int a=r.nextInt(51);
            int sub;
            sub =deck[a];
            deck[a]=deck[0];
            deck[0]=sub;
        }
        for (int i=0; i<deck.length; i++){
            if (i%13==0)System.out.println("");
            System.out.print(deck[i]+" ");
        }
    }
}
