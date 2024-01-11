
import java.util.Arrays;

public class HWK3_04 {

    public static void main(String[] args) {
        int[] data = {15, -9, 18, -1, 32, 7, -18, 32, -18, -1, 44};
        int[] pos = getPosArr(data);
        System.out.println("Pos Number in data[]=" + Arrays.toString(pos));
    }

    public static int[] getPosArr(int[] data) {
        int pos = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                pos++;
            }
        }
        int[] a = new int[pos];
        int dex = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                a[dex++] = data[i];
            }
        }

        return a; // 請自行刪除本行
    }
}
/*
Pos Number in data[]= [15, 18, 32, 7, 32, 44]
*/
