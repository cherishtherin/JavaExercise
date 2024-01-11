import java.util.Random;
public class dvd {
    static Random r= new Random (110);
    public static void main (String[]args){
        int [] deck= new int[52];
    for(int i=0; i<52; i++){
    deck[i]=i;
}
    shuffle(deck,1000);
    print(deck);
    }
    public static void print(int[] deck){
        for (int i=0; i<deck.length; i++){
            if(i%13==0)System.out.println("");
            System.out.print(deck[i]+" ");
        }
    }
    public static void shuffle (int[] deck, int time){
        for ( int i=0; i<deck.length ; i++){
        int a= r.nextInt(51);
        int alt=deck[0];
        deck[0]=deck[a];
        deck[a]=alt;
        
    }
    }
}
