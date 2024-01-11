

import java.util.*;

public class HWK08_01 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (true) {
            System.out.println("Input a line:");
            String aLine = cin.nextLine();
            System.out.print("-->" ); // DIY後，請將本行加上註解
            if (aLine.equalsIgnoreCase("bye")) {
            
                break;
            }
            String[] arr = aLine.split(" ");
            for (String x : arr) {
                if (x.charAt(0) >= 'a' && x.charAt(0) <= 'z') {
                    char dex = (char) ('A' + x.charAt(0) - 'a');
                    System.out.print(dex);
                    for (int i = 1; i < x.length(); i++) {
                        System.out.print(x.charAt(i));
                    }
                } else {
                    for (int i = 0; i < x.length(); i++) {
                        System.out.print(x.charAt(i));
                    }
                    

                }System.out.print(" ");
            }
            System.out.println("");
// DIY here, 請檢視aLine中各單字的字首，若為英文字母，則將其改為大寫後印出
        }
        System.out.print("Bye!");
    }
}
/* [參考執行過程]
Input a line:peter Jackson
-->Peter Jackson
Input a line:kenny roggers
-->Kenny Roggers
Input a line:123man   oops  am11 (單字間有多個空格)
-->123man   Oops  Am11
Input a line:bye
-->Bye! (結束執行)
 */
