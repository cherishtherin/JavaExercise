public class HWK10_01{
    public static void main(String[] args) {
		EX1() ;
                EX2();
                EX3();
                
	}
    public static void EX1 () { // 變數名稱
        String regExpr = "[_$a-zA-Z][\\w_]{0,255}";  //規則式, DIY
        System.out.print("string to be test=");
        String[] queryStr = {"A5384", "abc_0507", "_index_of", "@Hello", " 7area"};  //待測字串, DIY
        for (int i = 0; i < queryStr.length; i++) {
            if (queryStr[i].matches(regExpr)) //檢查待測字串是否符合規則式
            {
                System.out.println(queryStr[i] + " matches " + regExpr);
            } else {
                System.out.println( queryStr[i] + " does not match " + regExpr);
            }
        }}
    public static void EX2 () { // 電話號碼
        String regExpr = "([\\d]{2}-)?[\\d]{8}(#[\\d]{4})?";//"([\\d]{2}-)?2[\\d]{7}(#[\\d]{4})?";  //規則式, DIY
        System.out.print("string to be test=");
        String[] queryStr = {"02-26215656#2645", "26215656", "02-2378421#45"};
        for (int i = 0; i < queryStr.length; i++) {//待測字串, DIY
            if (queryStr[i].matches(regExpr)) //檢查待測字串是否符合規則式
            {
                System.out.println(queryStr[i] + " matches " + regExpr);
            } else {
                System.out.println("***" + queryStr[i] + " does not match " + regExpr);
            }
        }
    }

    public static void EX3 () { // 網址
        String regExpr = "(\\w+.){2,5}(jp|de)";  //規則式, DIY
        System.out.print("string to be test=");
        String queryStr = "A1.B2.de" ;  //待測字串, DIY
        if (queryStr.matches(regExpr))  //檢查待測字串是否符合規則式
                System.out.println(queryStr+" matches "+regExpr) ;
        else 
                System.out.println("***"+queryStr+" does not match "+regExpr) ;	        
    }

}
