
public class HWK5_409630497_04 {
    public static void main (String[]args){
        int x=1;
    int [] rowLen = {2,4,3};
    int [][] mx=new int[rowLen.length][4];
    for (int i=0; i<mx.length; i++){
        for(int j=0; j<rowLen[i]; j++){
            mx[i][j]=x;
            System.out.print(mx[i][j]+" " );x++;
        }
        System.out.println("");
    }
    }
}
