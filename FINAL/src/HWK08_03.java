
public class HWK08_03 {

    // 某系統中合法副檔名
    public static String[] legalExt = {"pdf", "doc", "docx", "txt"};

    public static void main(String[] args) {
        String[] fileName = {"test.pdf", "test.mp3", "test.docx", "test.txt",
            "test_doc", "pdf"};
        String fName = "test.doc";
        System.out.println(fName.endsWith("doc"));
        for (String x:fileName){
           System.out.print(x+"->");
           if(legalExtension(x))System.out.println("V");
           else System.out.println("X");
        }
        
        // 撰寫一迴圈，依序測試fileName[]中的檔名，印出是否合法
    }

    public static boolean legalExtension(String filename) {
        // 根據legalExt[]判別filename是否具有合法的副檔名
        // 如果是，回傳true，否則回傳false

        for (int i = 0; i < legalExt.length; i++) {
            if (filename.endsWith("." + legalExt[i])) {
                return true;
            }

        }
        return false;
        // 自行修改]
    }
}
/* [程式輸出]
test.pdf -> V
test.mp3 -> X
test.docx -> V
test.txt -> V
test_doc -> X
pdf -> X
 */
