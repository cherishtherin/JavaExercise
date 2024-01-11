
public class arrays3 {
    public static void main (String[]args){
    int [] arr= {2,5,3};
    int [][] arrDemo =new int [arr.length][];
    int cnt=1;
    for (int i=0; i<arrDemo.length; i++){
        arrDemo[i]=new int [arr[i]];
        for (int j=0; j<arrDemo[i].length; j++){
            arrDemo[i][j]=cnt++;
            System.out.print(arrDemo[i][j]+" ");
        }System.out.println("");
        
    }
}
}
