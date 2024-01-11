
public class HWK2_409630497_01 { // XX:學號, YY:姓名
    public static void main(String[] args) {
        printRect('=', 3, 5, true); 
        System.out.println("");// 使用=號畫出3x5的實心方形
        printRect('*', 5, 7, false);
        System.out.println("");// 使用*號畫出5x7的空心方形
        printRightTriangle('*', 5) ;
        
    }
    public static void printRect(char symbol, int r, int c, boolean filled) {
        // DIY: 以symbol印出rxc形狀的矩形，filled變數指定是否為實心或空心矩形
        if (filled){
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                    System.out.print(symbol);
                }
                System.out.println("");
            }
        }
        else{
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                   if (i==0 ||i==r-1||j==0||j==c-1){
                        System.out.print(symbol);
                    } 
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }   
    public static void printRightTriangle(char symbol, int height) {
        // DIY: 印出實心正三角形
        for (int i=0; i<height; i++){
            for (int j=0; j<height*2; j++){
                if(i>j||j+i>=height*2-1)System.out.print(" ");
                else System.out.print(symbol);
            }
            System.out.println("");
        }
        
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