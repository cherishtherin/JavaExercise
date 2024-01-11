
import java.util.*;

public class HWK8_409630497_01 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Input a line:");
        String aLine = cin.nextLine();
        System.out.print("-->" );
        while(true){
        char c = aLine.charAt(0);
        if (c >= 'a' && c <= 'z') {
            c = (char) ('A' + (c - 'a'));
        }
        System.out.print(c);
        for (int i = 1; i < aLine.length(); i++) {
            if (aLine.charAt(i-1) == ' ') {
                char c2 = aLine.charAt(i);
                if (c2 >= 'a' && c2 <= 'z') {
                    c2 = (char) ('A' + (c2 - 'a'));
                }
                System.out.print(c2);
            }
            else System.out.print(aLine.charAt(i));
        }
            System.out.println("");
        System.out.print("Input a line:");
         aLine = cin.nextLine();
        System.out.print("-->" );
        if(aLine.equals("bye")){
            break;
        }
            
// DIY後，請將本行加上註解
        // DIY here, 請檢視aLine中各單字的字首，若為英文字母，則將其改為大寫後印出
    }
        System.out.println("Bye!");

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
