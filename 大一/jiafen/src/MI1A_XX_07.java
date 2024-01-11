import java.util.Arrays;
public class MI1A_XX_07 {
    public static void main(String[] args) {
        System.out.println("----- print2DArray(m) ---- 4%");
        int[][] m = {{0,0,0,0}, {0,0}, {0,0,0,0,0}, {0,0,0}} ;
        print2DArray("Originally, m[][]=", m) ; 
        
        System.out.println("----- fillByRow(m)---- 4%");
        fillByRow(m) ;        
        print2DArray("** fill by row, m[][]=", m) ; 
        
        System.out.println("----- fillByColumn(m)---- 7%");
        fillByColumn(m) ;
        print2DArray("** fill by column, m[][]=", m) ; 
        
        int[][] data = {{80,77,66,53,44,90,0},
                        {97,34,50,88,92,10,0},
                        {70,60,72,40,77,80,0},
                        {0, 0, 0, 0, 0, 0, 0}} ;
        System.out.println("----- calRowAvg(m)---- 5%");        
        calRowAvg(data) ; 
        print2DArray("** calRowAvg(data), data[][]=", data) ; 

        System.out.println("----- calColMax(m)---- 6%");              
        calColMax(data) ;         
        print2DArray("** calColAvg(data), data[][]=", data) ;          
    }

    public static void print2DArray(String header, int[][] m) { // 4%
        for(int i=0; i<m.length; i++){
            System.out.println(Arrays.toString(m[i]));
            }
        
    }    
    public static void fillByRow(int[][] m) { // 4%
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                m[i][j]=(i+1)*10+(j);
            }
        }
    }    
    public static void fillByColumn(int[][] m) { // 7%
       for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                m[i][j]=(j+1)*10+i;
            }
            }
    }        
    public static void calRowAvg(int[][] m) { // 5%
        for (int i=0; i<m.length; i++){
            int sum=0;
            for (int j=0; j<m[i].length; j++){
                sum+=m[i][j];
            }
            m[i][m[i].length-1]=sum/(m[i].length-1);
            }
            
    }
    public static void calColMax(int[][] m) { // 6%
        
        for (int i=0; i<m[0].length; i++){
           int max=0;
           for (int j=0; j<m.length-1; j++){
               if (m[j][i]>max)max=m[j][i];
           }
           m[3][i]=max;
        }
        
    }        
}
/* [程式輸出]
----- print2DArray(m) ---- 4%
Originally, m[][]=
[0, 0, 0, 0]
[0, 0]
[0, 0, 0, 0, 0]
[0, 0, 0]
----- fillByRow(m)---- 4%
** fill by row, m[][]=
[10, 11, 12, 13]
[20, 21]
[30, 31, 32, 33, 34]
[40, 41, 42]
----- fillByColumn(m)---- 7%
** fill by column, m[][]=
[10, 20, 30, 40]
[11, 21]
[12, 22, 31, 41, 50]
[13, 23, 32]
----- calRowAvg(m)---- 5%
** calRowAvg(data), data[][]=
[80, 77, 66, 53, 44, 90, 68]
[97, 34, 50, 88, 92, 10, 61]
[70, 60, 72, 40, 77, 80, 66]
[0, 0, 0, 0, 0, 0, 0]
----- calColMax(m)---- 6%
** calColAvg(data), data[][]=
[80, 77, 66, 53, 44, 90, 68]
[97, 34, 50, 88, 92, 10, 61]
[70, 60, 72, 40, 77, 80, 66]
[97, 77, 72, 88, 92, 90, 0]
*/

