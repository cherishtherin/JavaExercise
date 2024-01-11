
public class HWK8_409630497_03 {
    public static void main(String[] args) {
        int[] data = {30_0000, 150_0000, 300_0000, 450_0000} ;
        for (int income: data) {
            System.out.println("income: "+income);
            System.out.println("tax: "+calTax(income));
        }
    }
    public static int calTax(int income) {
        int [] incomeLim= {540000,710000,1250000,1500000,0};
        double []tax= {0.06,0.13,0.20,0.30,0.40};
                int total=0;
        for (int i=0; i<incomeLim.length; i++){
            if (income!=0&&i==incomeLim.length-1){
                total+=income*tax[i];
                System.out.print(income+"*"+tax[i]);
            }
            else if (income-incomeLim[i]>0){
                total+=incomeLim[i]*tax[i];
                income-=incomeLim[i];
                System.out.print(incomeLim[i]+"*"+tax[i]+"+");
                
        }
            else{
                total+=incomeLim[i]*tax[i];
                System.out.print(incomeLim[i]+"*"+tax[i]);
                break;
            }
            
    }
        return total;
}
} 
/*
[累進稅額]: 假設淨收入300萬，tax=54萬*0.06+71萬*0.13+125萬*0.2+50萬*0.3
0<=income<54萬           6%
54萬<=income<125萬	13%
125萬<=income<250萬	20%
250萬<=income<400萬	30%
400萬<=income           40%
*/    

