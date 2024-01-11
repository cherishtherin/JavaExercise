public class HWK5_409630497_03 { 
    public static void main(String[] args) { 
        int[][] m = new int [3][5];
        int num=1;
        
        for(int i = 0; i < m.length; i++) { 
            for(int j = 0; j < m[i].length; j++) {
                m[i][j]=num;
                System.out.print(m[i][j] + " ");num++; }
            
            System.out.println(); 
        } 
    } 
}  

