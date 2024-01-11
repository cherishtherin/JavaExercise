
public class pg108 {
    public static void main (String[]args){
        int [][]voteCnt = {{30,60,70,60,80,90},
                           {23,36,47,36,98,29},
                           {77,23,74,32,90,20}};
        for (int i=0; i<voteCnt[0].length; i++){
            int sum=0;
            for (int j=0; j<voteCnt.length; j++){
                sum+=voteCnt[j][i];
            }
            System.out.print(sum+" ");
        }
        System.out.println("");
        for (int i=0; i<voteCnt.length; i++){
            int sum=0;
            for (int j=0; j<voteCnt[i].length; j++){
                sum+=voteCnt[i][j];
            }
            System.out.println(sum+"");
        }
    }
}
