import java.util.Arrays;

public class HWK3_409630497_04 {
    public static void main(String[] args){
        int[] data = {15, -9, 18, -1, 32, 7, -18, 32, -18, -1, 44} ;
        int[] pos = getPosArr(data) ; 
        System.out.println("Pos Number in data[]="+Arrays.toString(pos)) ;
    }

    public static int[] getPosArr(int[] data) {
        int [] pos;
        int cnt=0;
        for (int i=0; i<data.length; i++){
            if (data[i]>0)cnt++;
        }
        pos= new int[cnt];
        int index=0;
        for (int i=0; i<data.length; i++){
            if (data[i]>0){
                pos[index++]=data[i];
            }
        }
        return pos;
    }
}
/*
Pos Number in data[]= [15, 18, 32, 7, 32, 44]
*/