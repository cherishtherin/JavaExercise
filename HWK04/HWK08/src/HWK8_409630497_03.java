
public class HWK8_409630497_03 {
    // 某系統中合法副檔名

    public static String[] legalExt = {"pdf", "doc", "docx", "txt"};

    public static void main(String[] args) {
        String[] fileName = {"test.pdf", "test.mp3", "test.docx", "test.txt",
            "test_doc", "pdf"};
        String fName = "test.doc";
        System.out.println(fName.endsWith("doc"));
        // 撰寫一迴圈，依序測試fileName[]中的檔名，印出是否合法
        for (int i = 0; i < fileName.length; i++) {
            System.out.print(fileName[i] + " -> ");
            if (legalExtension(fileName[i])) {
                System.out.println("V");
            } else {
                System.out.println("X");
            }
        }
    }

    public static boolean legalExtension(String filename) {
        // 根據legalExt[]判別filename是否具有合法的副檔名
        // 如果是，回傳true，否則回傳false
        boolean legal = false;
        for (int i = 0; i < legalExt.length; i++) {
            if (filename.endsWith("."+legalExt[i])) {
                legal= true;
            }
        } // 自行修改]
        return legal;
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
