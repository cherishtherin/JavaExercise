import java.util.Arrays;
public class MIA2 {
    public static void main (String[]args){
        int ub=100,lb=1;
        int[] list35 = new int[100];
        int cnt=0;
        for(int i=lb; i<ub; i++){
            list35[i]=i;
        }
        for(int i=lb; i<ub; i++){
            if(list35[i]%15==0)cnt++;
    }
        int[] list = new int[cnt];
        int dex=0;
        for(int i=lb; i<ub; i++){
            if(list35[i]%15==0)list[dex++]=list35[i];
    }
        System.out.println("list [] "+Arrays.toString(list));
}
}
