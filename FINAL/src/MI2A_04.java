public class MI2A_04 {
    public static void main(String[] args) {
        // 撰寫一規則式檢查身分證字號的正確性 (6%)
        // (1) 頭一碼為大小寫字母，接著一個數字1或2，再接著8碼數字                     [a-zA-Z]
        // (2) 若缺身分證號，也可填寫"None"     
        String regx1= "[a-zA-Z][12][\\d]{8}|None";
        //String regx1 = "[a-zA-Z][12]\\d{8}|None" ; // DIY here                          \\d{8}
        String[] test1 = {"A100987638", "Z123456780", "MK23456780", 
                          "None","@335680539","M33445566"} ;
        testRegx(regx1, test1, "ID Number") ; 
        
        // 某商品序號規則如下，請撰寫規則式檢查字串是否符合規定 (9%) 
        // (1) 開頭可能是QX, BN或者KC                                               (QX|BN|KC)
        // (2) 接下來是7個數字xxxxxxx，但允許xxxx-xxx格式                            (\\d{7}|\\d{4}-\\d{3})
        // (3) 最後會以T,J,O中任一個字母結尾                                         (T|J|O)
        String regx2 = "(QX|BN|KC)[\\d]{4}-?[\\d]{3}[TJO]";
                //"(QX|BN|KC)(\\d{7}|\\d{4}-\\d{3})(T|J|O)" ; // DIY here
        String[] test2 = {"QX5385-475T","BN3734475J","KC8502-777O",
                            "BN593446M", "MX5385-475T", "BN8853344M"} ;
        testRegx(regx2, test2, "Product ID") ;
	}
    public static void testRegx(String regx, String[] testStrs, String header) {
        System.out.println("----- regx test: "+header+" -----") ;         
        for (String s:testStrs) {
            System.out.print(s+"("+(s.matches(regx)?"O":"X")+") ");
        }
        System.out.println("");    
    }
}
/* [程式輸出]
----- regx test: ID Number -----
A100987638(O) Z123456780(O) MK23456780(X) None(O) @335680539(X) M33445566(X) 
----- regx test: Product ID -----
QX5385-475T(O) BN3734475J(O) KC8502-777O(O) BN593446M(X) MX5385-475T(X) BN8853344M(X) 
*/
