
import java.util.*;
import java.util.Random;

public class HWK4_409630497_01{

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("密碼長度: ");
        int n = cin.nextInt();
        System.out.println("使用字元集 (1) 完整字元集 (2)不含數字:  ");
        int word = cin.nextInt();
        System.out.println("第一碼是否為英文字母(y/n))?  :");
        String letter = cin.next();
        System.out.println("字元是否可重複使用(y/n))? :");
        String reuse = cin.next();
        System.out.println("初始密碼: ");
        psswd(n, word, letter, reuse);
    }

    public static void psswd(int n, int word, String letter, String reuse) {
        Random r = new Random();
        char[] content = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        //0-25 small letters, 26-51 capital, 52-61 num

        char[] psswd = new char[n];
        int st;
        st =  r.nextInt(52);
        if (letter.equals("n")) {
            st = 52+r.nextInt(10);
        }
        psswd[0] = content[st];
        System.out.print(psswd[0]);

        char checker = psswd[0];
        for (int i = 1; i < psswd.length; i++) {
            st = r.nextInt(62);
                if (word == 2) {
                    st = r.nextInt(52);
                }
                psswd[i] = content[st];
            if (reuse.equals("n")) {
                while(checker==psswd[i])
                {st = r.nextInt(62);
                if (word == 2) {
                    st = r.nextInt(52);
                }
                psswd[i] = content[st];}
                checker=psswd[i];
                
            }
            System.out.print(psswd[i]);
        }

    }

}
