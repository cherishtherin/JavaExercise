
public class HWK4_409630497_03 {
    public static void main (String[]args){
        double []a = new double[6];
        double []b = new double[6];
        double []c = new double[6];
        filldoubleArray(a,2,10);
        filldoubleArray(b,2,10);
        printArr("a[] =",a,3);
        printArr("b[] =",b,3);
        sumArray(a,b,c);
        printArr("c[] =",c,2);
        
    }
    public static void filldoubleArray(double [] num, int lb,int ub){
        for(int i=0; i<num.length; i++){
            num[i]=lb+Math.random()*(ub-lb);
        }
    }
    public static void printArr(String number, double []num,int numToDecimal)   {
        System.out.print(number+"\t");
        for(int i=0; i<num.length; i++){
            System.out.printf("%."+numToDecimal+"f\t",num[i]);
        }
        System.out.println("");
          
    } 
    public static void sumArray(double [] num1, double [] num2, double [] num3){
    for (int i=0; i<num3.length; i++){
        num3[i]=num1[i]+num2[i];
    }
}
        
    
}
