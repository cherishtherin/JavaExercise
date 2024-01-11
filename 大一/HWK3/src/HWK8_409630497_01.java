
public class HWK8_409630497_01 {

    public static void main(String[] args) {
        double total = 0, avg = 0;
        total = sum(1, 2, 3, 4);
        avg = average(1, 2, 3, 4);
        System.out.println(total + "," + avg);
        total = sum(1, 2, 3, 4, 5, 6);
        avg = average(1, 2, 3, 4, 5, 6);
        System.out.println(total + "," + avg);
    }
public static int sum (int ...a){
    int sum=0;
    for (int i=0; i<a.length; i++){
        sum+=a[i];
        
    }
    return sum;
}
public static double average(int ... a){
    return (double)sum(a)/a.length;
}

}
