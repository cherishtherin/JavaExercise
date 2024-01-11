
public class MI1A_XX_02 {

    public static void main(String[] args) {
        System.out.println("----- isPrime(n) ------ 4%");
        System.out.println("isPrime(17)=" + isPrime(17));
        System.out.println("isPrime(57)=" + isPrime(57));

        System.out.println("----- C(n,k) ------ 5%");
        int n = 17, k = 12;
        System.out.printf("Cnk(%d,%d)=%d\n", n, k, cnk(n, k));
        n = 100;
        k = 95;
        System.out.printf("Cnk(%d,%d)=%d\n", n, k, cnk(n, k));

        System.out.println("----- sumOfDigits(n) ------ 6%");
        n = 135792468;
        System.out.printf("sumOfDigits(%d)=%d\n", n, sumDigits(n));

        System.out.println("----- factorize(n)----  7%");
        n = 2 * 2 * 2 * 3 * 5 * 5 * 7 * 11 * 11 * 13 * 13 * 17;
        factorize(n);

    }

    public static boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt == 0;
    }

    public static int cnk(int n, int k) { // 5%
        k = n - k;
        int up = 1, down = 1;
        for (int i = 1; i <= k; i++) {
            up *= n;
            n--;
        }
        for (int i = k; i > 0; i--) {
            down *= i;
        }
        return up / down;
    }

    public static int sumDigits(int n) { // 5%

        int a, sum = 0;
        while (n != 0) {
            a = n % 10;
            sum += a;
            n = n / 10;
        }
        return sum;
    }

    public static void factorize(int n) { // 7%

        int i = 2;
        while (i <= n) {

            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else {
                i++;
            }

        }
    }
}
