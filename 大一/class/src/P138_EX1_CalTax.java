


public class P138_EX1_CalTax {
    public static void main(String[] args) {
        int[] data = {30_0000, 150_0000, 300_0000, 450_0000} ;
        for (int income: data) {
            System.out.println("income: "+income);
            System.out.println("tax: "+calTax(income));
        }
    }
    public static int calTax(int income) {
        int [] value={540000,710000,1250000,1500000,0};
        double [] tx= {0.06,0.13,0.2,0.3,0.4};
        int total=0;
        for (int i=0; i<value.length; i++){
            if(i==value.length-1){
                total+=income*tx[i];
            }
            else if(income-value[i]<0){
                total+=income*tx[i];break;  
            }
            else{
                total+=value[i]*tx[i];
                income-=value[i];
            }
        }
        return total ; // 請自行修改
    }
/*
[累進稅額]: 假設淨收入300萬，tax=54萬*0.06+71萬*0.13+125萬*0.2+50萬*0.3
0<=income<54萬           6%
54萬<=income<125萬	13%
125萬<=income<250萬	20%
250萬<=income<400萬	30%
400萬<=income           40%
*/    
}
