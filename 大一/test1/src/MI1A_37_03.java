
public class MI1A_37_03 {

    public static void main(String[] args) {
        int[] score = {58, 37, 69, 88, 98, 74, 23, 80, 63};
        int max2 = findMax2(score); // 找到score[]中第二大的值
        System.out.println("max2=" + max2);

        double avg=avg(score); // 去除score[]中的最大值與最小值後，求平均值
        System.out.printf("avg= %.2f",avg) ; 
    }

    public static int findMax2(int[] x) {

        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        int max2=0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max2&&x[i]!=max) {
                max2 = x[i];
            }
        }
        return max2;
    }

    public static double avg(int[] x) {
        double sum = 0, cnt = 0;
        int max2=findMax2(x);
        for (int i = 0; i < x.length; i++) {
            if(x[i]!=max2){
                cnt++;
                sum+=x[i];
            }
        }
        return sum/cnt;
    }
}
/* [程式輸出]
max2=88
avg=???
 */
