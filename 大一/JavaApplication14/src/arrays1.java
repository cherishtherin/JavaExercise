
public class arrays1 {
    public static void main (String[]args){
        int [][] board= {{-1,0,-1},{1,0,1},{0,1,-1}};
        for(int i=0; i<board.length; i++){
            for (int j=0;j< board[i].length; j++){
                switch (board[i][j]){
                        case -1:
                            System.out.print(" \t");break;
                        case 1:
                            System.out.print("X\t");break;
                        case 0:
                            System.out.print("O\t");break;
                                }
            }System.out.println("");
        }
    }
}
