
import java.util.*;

public class card {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 9; j++) {//(i+i*k)k==0,1,2
                for (int k = 1; k <= 3; k++) {
                    System.out.print(k+3*i + "*" + j + "=" + j * k + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
//iv    j>
