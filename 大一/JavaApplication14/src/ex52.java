
public class ex52 {
    public static void main (String[]args){
        
    
    int [][]a= new int[3][4];
    for(int i=0;i<a.length;i++){
        System.out.print("["+i+"]");
        for(int j= 0; j<a[i].length; j++){
            a[i][j]=-1;
            System.out.print(a[i][j]);
        }
        System.out.println("");
        
    }
}
}
