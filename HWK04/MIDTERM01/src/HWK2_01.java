
public class HWK2_01 { // XX:學號, YY:姓名

    public static void main(String[] args) {
        printRect('=', 3, 5, true);     // 使用=號畫出3x5的實心方形
        printRect('*', 5, 7, false);	// 使用*號畫出5x7的空心方形
        printRightTriangle('*', 5);
    }

    public static void printRect(char symbol, int r, int c, boolean filled) {
        if (filled) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(symbol);
                }
                System.out.println("");
            }
        } else {
           for (int i=0; i<r; i++){
               for (int j=0; j<c; j++){
                   if (i==0|i==r-1|j==0|j==c-1)System.out.print(symbol);
                   else System.out.print(" ");
               }
               System.out.println("");
           }
        }
    }

    public static void printRightTriangle(char symbol, int h) {
        int dex=0;
        for (int i=0; i<h; i++){
            for (int j=0; j<h*2-1; j++){
                if(j>=h-1-dex&& j<=h-1+dex){
                    System.out.print("*");
                    
                }
                else System.out.print(" ");
            }
            System.out.println("");
            dex++;
        }
        
//        for (int i = 0; i < h; i++) {
//            int sideL = h - 1 - i, sideR = h - 1 - i;
//            int starL = h - 1 - sideL,starR = h - 1 - sideR;
//            while (sideL > 0) {
//                System.out.print(" ");
//                sideL--;
//            }
//            while (starL > 0) {
//                System.out.print(symbol);
//                starL--;
//            }
//            System.out.print(symbol);
//            
//            while (starR > 0) {
//                System.out.print(symbol);
//                starR--;
//            }
//            while (sideR > 0) {
//                System.out.print(" ");
//                sideR--;
//            }
//            System.out.println("");
//        }
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
