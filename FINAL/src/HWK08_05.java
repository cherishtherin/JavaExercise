
class StringX { // 自行建構字串類別

    char[] str; // 記錄字串的各個字元, 字串是字元所成的集合
    int len;    // 字串的長度

    StringX() {

    }

    StringX(char[] cs) {
        // conversion constructor
        // DIY: 利用cs[]建構一個StringX物件
        this.len = cs.length;

        str = new char[len];
        System.arraycopy(cs, 0, str, 0, len);

    }

    int length() {
        return len;
    }

    char charAt(int index) {
        return str[index];
    }

    StringX concat(StringX s2) {
        // [功能]: 將this與s2串接後，存於新的StringX物件傳回
        // [注意]: 本題不可轉為String後，在使用內建工具函數來達成
        StringX s3 = new StringX();
        s3.len = s2.len + this.len + 1;
        s3.str = new char[s3.len];
        System.arraycopy(this.str, 0, s3.str, 0, this.len);
        s3.str[this.len] = ' ';
        System.arraycopy(s2.str, 0, s3.str, this.len + 1, s2.len);
        return s3; // DIY 自行修改
    }

    StringX longest_substr(StringX s2) {
        // DIY: 找出this與s2最長的共同子字串，並以StringX格式傳回
        // 請參考[程式輸出]
        StringX s3 = new StringX();
        char[] checker = this.str;
        if (s2.len < this.len) {
            checker = s2.str;
        }
        int dex = 0;
        int cnt = 0, cntF=0;
        for (int j = 0; j < checker.length; j++) {
            for (int i = 0; i < s2.str.length; i++) {//s2 is checker longer
                if (this.str[dex++] == s2.str[i]) {
                    cnt++;
                }
                else{
                    if(cnt>cntF){
                        cntF=cnt;
                    }
                    cnt=0;
                }
            }
        }
        return s3;  // DIY 自行修改
    }

    public String toString() {
        // 直接使用，勿修改
        if (str == null) {
            return "Null String";
        }
        return String.valueOf(str); // char[]轉換為String物件的方法
    }

}

public class HWK08_05 {

    public static void main(String[] args) {
        char[] cs = {'H', 'e', 'l', 'l', 'o'};
        StringX s1 = new StringX(cs);
        System.out.println("s1=" + s1);

        cs[0] = 'W';
        cs[1] = 'o';
        cs[2] = 'r';
        cs[3] = 'l';
        cs[4] = 'd';
        StringX s2 = new StringX(cs);
        System.out.println("s2=" + s2);

        StringX s3 = s1.concat(s2);
        System.out.println("s3=s1+s2=" + s3);

        StringX pattern1 = new StringX("ABACDDACBABBDADCBABEC".toCharArray());
        StringX pattern2 = new StringX("BABECCDDAADCABABECBABBDABA".toCharArray());
        System.out.println("pat1=" + pattern1);
        System.out.println("pat2=" + pattern2);
//        StringX lcs = pattern1.longest_substr(pattern2);
//        System.out.println("longest_common_substr of pat1, pat2=" + lcs);
    }
}
/* [程式輸出]
s1=Hello
s2=World
s3=s1+s2=HelloWorld
pattern1=ABACDDACBABBDADCBABEC
pattern2=BABECCDDAADCABABECBABBDABA
longest_common_substr of pat1, pat2=CBABBD
 */
