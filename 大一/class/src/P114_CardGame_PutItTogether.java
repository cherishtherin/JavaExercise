
import java.util.Random;

public class P114_CardGame_PutItTogether {

    static char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
    // static String[] suits = {"S", "H", "D", "C"}; // Spade, Heart, Diamond, Club
    static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public static void main(String[] args) {
        int[] deck = new int[52]; //一開始假設紙牌依序排好
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        printCards(deck, 0, deck.length);

        shuffle(deck, 52);  // shuffle(deck, deck.length) ;

        int playerNo = 4, cardNo = 5;
        int[][] cardsOfPlayer = new int[playerNo][cardNo];
        // 發牌給4位梭哈玩家，每人5張
        int start = 0; // 由牌堆deck[]中的第0張牌開始發起
        dealCards(deck, start, cardsOfPlayer);

        // DIY: 印出4位玩家的牌面，每位玩家一列
    }

    public static String cardString(int cardId) {
        // 將cardID轉換為代表牌面的字串，例如15 -> 紅心2 (紅心是特殊符號)
        return suits[cardId / 13] + ranks[cardId % 13];
    }

    public static void printCards(int[] deck, int start, int end) {
        // 印出deck[start~end-1]的牌，注意: 不包含deck[end]
        for (int i = start; i < end; i++) {
            if (i % 13 == 0) {
                System.out.println("");
            }
            System.out.print(cardString(deck[i]));
        }
    }

    public static void printCards(int[] deck) {
        // 印出deck[]中所有的牌
        printCards(deck, 0, deck.length);
    }

    public static void shuffle(int[] deck, int times) {
        // [洗牌] 依照講義中的說明，將deck[]中的內容混亂化，模擬洗牌動作
        Random r = new Random(111);
        int temp;
        for (int i = 0; i < times; i++) {
            int a = r.nextInt(52);
            temp = deck[0];
            deck[0] = deck[a];
            deck[a] = temp;
        }
        System.out.println("");
        printCards(deck);
    }

    public static void dealCards(int[] deck, int start, int[][] cardsOfPlayer) {
        // [發牌]: 由牌堆deck[]的第start張牌開始，依序發牌給各玩家，並存於cardsOfPlayer[]中
        // 玩家數: cardsOfPlayer.length
        // 發給每人的牌數: cardsOfPlayer[i].length
        // DIY here
        int[][] temp = new int[cardsOfPlayer.length][cardsOfPlayer[0].length];
        int index = 0;
        for (int i = 0; i < temp[0].length; i++) {

            for (int j = 0; j < temp.length; j++) {

                temp[j][i] = deck[index++];

            }
        }for (int i=0; i<temp.length;i++){
            System.out.print("Player "+(i+1));
            printCards(temp[i]);
            System.out.println("");
        }
    }

}
