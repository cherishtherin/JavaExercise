
import java.util.Arrays;
import java.util.Random;

public class HWK2_05 {

    public static void main(String[] args) {
        Random r = new Random(111);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        System.out.println("a[]=" + Arrays.toString(a));
        int[] temp = new int[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            a[(i+1)%a.length]=temp[i];
//            a[(i + 1) % a.length] = temp[i];
        }

        System.out.println("a[]=" + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            a[i] = temp[(i + 1) % a.length];
        }
        System.out.println("a[]=" + Arrays.toString(a));

    }
}
/*
a[]=[93, 70, 57, 97, 9, 20, 84, 12, 97, 65]
a[]=[65, 93, 70, 57, 97, 9, 20, 84, 12, 97] (向右循環位移1次)
a[]=[70, 57, 97, 9, 20, 84, 12, 97, 65, 93] (在向左循環位移2次)
*/
