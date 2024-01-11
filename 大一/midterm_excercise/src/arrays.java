
public class arrays {
    public static void main(String[] args) {
        int[] data = {15, -9, 18, -1, -12, 77, -3, 32};
        int[] pos = getPosArr(data);
        for (int i = 0; i < pos.length; i++) {
            System.out.println(pos[i]);
        }
    }
    public static int [] getPosArr(int [] x){
       int cnt=0;
    for (int i=0; i<x.length; i++){
        if(x[i]<0)cnt++;
    }
    int [] pos= new int [cnt];
    int index=0;
    for (int i=0; i<x.length; i++){
        if(x[i]<0){
        pos[index++]=x[i];
        }}
    return pos;
}
}
