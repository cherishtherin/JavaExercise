import java.util.* ; 
public class P138_Demo3_TableLookup {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] hourTable = {2, 4, 7, Integer.MAX_VALUE};
        int[] feeTable = {30, 50, 80, 100};
        // == 輸入停車的時間(單位:小時) ==
        System.out.print("h=");
        int h = cin.nextInt();
        int hourFee = 0;
        for (int i = 0; i < feeTable.length; i++) {
            if (h <= hourTable[i]) {
                hourFee = feeTable[i];
                break;
            }
        }
        System.out.println("total fee=" + (hourFee * h));
    }
}
    

