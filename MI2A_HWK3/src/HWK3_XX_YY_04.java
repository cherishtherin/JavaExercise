import java.util.Arrays;

public class HWK3_XX_YY_04 {
    public static void main(String[] args){
        int[] data = {15, -9, 18, -1, 32, 7, -18, 32, -18, -1, 44} ;
        int[] pos = getPosArr(data) ; 
        System.out.println("Pos Number in data[]="+Arrays.toString(pos)) ;
    }

    public static int[] getPosArr(int[] data) {
        // DIY, 回傳一陣列，儲存data[]中的正數
        return new int[] {15,18,32} ; // 請自行刪除本行
    }
}
/*
Pos Number in data[]= [15, 18, 32, 7, 32, 44]
*/