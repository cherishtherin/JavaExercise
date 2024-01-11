import java.util.Random;
public class arrays2 {
    public static void main(String[]args){
        Random r= new Random (99);
        int [][]maze= new int [6][6];
        System.out.print("   ");
        for(int j=0; j<maze[0].length;j++){
            System.out.print(j+"  ");
        }
        System.out.println("");
        for (int i=0; i<maze.length; i++){
            System.out.print(i+"  ");
            for(int j=0; j<maze[i].length;j++){
                
                maze[i][j]=r.nextInt(2);
                System.out.print(maze[i][j]+"  ");
            }System.out.println("");
        }
    }
}
