
public class MI2A_03 {

    public static String toUpper(String s) { // 6%
        // [功能]: 將s字串中所有的小寫字母轉換為大寫字母，傳回轉換 
        // 本題不可使用內建大小寫轉換函數，否則不給分
        String ss="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>='a'&&s.charAt(i)<='z')
                ss+=(char)(s.charAt(i)-'a'+'A');
            else ss+=s.charAt(i);
        }
        return ss;
    }

    public static int diff(String s1, String s2) { // 7%
        // [功能]: 逐一比較s1與s2所有字元，傳回相異字元的個數
        //        如 "Hello","hexlo" -> 2
        //           "ABCDE", "xBC" ->  3
        int cnt;
        int len;
        if(s2.length()<s1.length()){
            len=s2.length();
            cnt=s1.length()-s2.length();
        }
        else{
            len=s1.length();
            cnt=s2.length()-s1.length();
        }
        for (int i=0; i<len; i++){
            if(s2.charAt(i)!=s1.charAt(i))cnt++;
            
        }
        
        return cnt;
    }

    public static int occurence(String str, String q) { // 8%
        // 找出q在str中出現的次數，大小寫不分
        int cnt=0, last=0;
        String sstr=str.toUpperCase();
        String qq= q.toUpperCase();
        while(true){
            last=sstr.indexOf(qq,last);
            if(last!=-1){
                cnt++;
                last++;
            }
            else{
                break;
            }
            
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s2 = "Hello", s3 = "hexlo";
        String s4 = "ABCDE", s5 = "xBC";
        System.out.println("diff(s2,s3)=" + diff(s2, s3)); // 2        
        System.out.println("diff(s4,s5)=" + diff(s4, s5)); // 3                

        String s1 = "Abc123aBc@List";

        String s6 = toUpper(s1);
        System.out.println("toUpper(s1)=" + s6);

        String s7 = "TheKEYnetthesurveythethirstytametheeytheymelt.";
        int times = occurence(s7, "the"); // 計算"the"在s7中出現的次數
        System.out.println("#times of 'the' in s7 is " + times);

    }
}
/* [程式輸出]
diff(s2,s3)=2
diff(s4,s5)=3
toUpper(s6)=ABC123ABC@LIST
#times of 'the' in s7 is 5
*/
