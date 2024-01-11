
class Circle {

    double x, y, r;
}

class Rect {

    double x, y, w, h;
    
   
}

class Plotter { // 繪圖工具程式
    // 記錄0-359度的sin,cos值, sinTable[0] -> sin(0。)
    // 使用Math.sin(double rad) 弧度(180<->pi)

    static final double[] sinTable = new double[360], cosTable = new double[360];
    // DIY: 靜態初始化區塊, 初始化sinTable[]與cosTable[]
// 範例: sinTable[i] = Math.sin(i*Math.PI/180) ;

    static void paint(Circle c, char[][] board) {
        for (int i = 0; i < 360; i++) {
            int col = (int) (c.x + c.r * cosTable[i]); // 欄
            if (col >= 0 && col < board[0].length) {
                int row = (int) (c.y + c.r * sinTable[i]); // 列
                if (row >= 0 && row < board.length) {
                    board[row][col] = '*';
                }
            }
        }
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static void clearBoard(char[][] board) {
        // DIY 
    }
}

public class HWK7_409630497_02 {

    public static void main(String[] args) {
        char[][] board = new char[60][60];  //繪圖板

        Circle c1 = new Circle(), c2 = new Circle();
        c1.x = 20;
        c1.y = 20;
        c1.r = 10; // 圓心(20,20), r=10
        Rect r1 = new Rect();

        Plotter.printBoard(board);
        // ==== 呼叫繪圖工具函數 ====
        // (1) 清空繪圖板board[][]
        // (2) 將c1繪製在board中
        // (3) 印出繪圖版 board[][]		
    }
}
