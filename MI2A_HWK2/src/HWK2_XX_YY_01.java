
public class HWK2_XX_YY_01 { // XX:學號, YY:姓名
    public static void main(String[] args) {
        printRect('=', 3, 5, true);     // 使用=號畫出3x5的實心方形
        printRect('*', 5, 7, false);	// 使用*號畫出5x7的空心方形
        printRightTriangle('*', 5) ;
    }
    public static void printRect(char symbol, int r, int c, boolean filled) {
        // DIY: 以symbol印出rxc形狀的矩形，filled變數指定是否為實心或空心矩形
    }   
    public static void printRightTriangle(char symbol, int height) {
        // DIY: 印出實心正三角形
    }
}
/* [程式輸出]
=====
=====
=====
*******
*     *
*     *
*     *
*******
    *
   ***
  *****
 *******
*********
*/