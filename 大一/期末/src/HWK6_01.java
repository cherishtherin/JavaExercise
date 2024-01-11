
import java.util.*;

public class HWK6_01 {

    static char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
    static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static Random r = new Random(111);

    public static void main(String[] args) {
        int[] deck = new int[51];

//一開始假設紙牌依序排好   
        System.out.println("Originally, deck[] = ");
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        printCards(deck, 0, deck.length);
        System.out.println("");
        System.out.println("After Shuffling, deck[] = ");
        shuffle(deck, 1000);
// shuffle(deck, deck.length) ;  
        printCards(deck, 0, deck.length);
        System.out.println("");
        System.out.println("---- Dealing the cards -----");
        int playerNo = 4, cardNo = 5;
        int[][] cardsOfPlayer = new int[playerNo][cardNo];
// 發牌給4位梭哈玩家，每人5張     
        int start = 0; // 由牌堆deck[]中的第0張牌開始發起      
        dealCards(deck, start, cardsOfPlayer);
// DIY: 印出4位玩家的牌面，每位玩家一列    
    }

    public static String cardString(int cardId) {
        int a = cardId / 13;
        char shape = suits[a];
        int b = cardId % 13;
        String num = ranks[b];
        return shape + num;
    }

    public static void printCards(int[] deck, int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 13 == 0) {
                System.out.println("");
            }
            System.out.print(cardString(deck[i]));
        }
    }

    public static void shuffle(int[] deck, int times) {
        for (int i = 0; i < times; i++) {
            int a = r.nextInt(51);
            int sub;
            sub = deck[a];
            deck[a] = deck[0];
            deck[0] = sub;
        }
    }

    public static void dealCards(int[] deck, int start, int[][] cardsOfPlayer) {
        for (int j = 0; j < cardsOfPlayer[0].length; j++) {
            for (int i = 0; i < cardsOfPlayer.length; i++) {
                cardsOfPlayer[i][j] = deck[start++];

            }

        }
        for (int i = 0; i < cardsOfPlayer.length; i++) {
            System.out.print("Player "+(i+1)+"] ");
            for (int j = 0; j < cardsOfPlayer[0].length; j++) {
                System.out.print(cardString(cardsOfPlayer[i][j])+" ");
            }
            System.out.println("");
        }
    }
}
