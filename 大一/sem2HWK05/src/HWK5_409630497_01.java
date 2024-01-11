 public class HWK5_409630497_01 {
    public static void main(String[]args){
        int[] data={15,-9,18,-1,-12,77,-3,32};
        int[] pos=getposarr(data);
        for(int i=0;i<pos.length;i++)System.out.println(pos[i]);
    }
    public static int[]getposarr (int[]a){
        int cnt=0;
        int cnt1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                cnt++; 
            }
    }
        int[] rlt=new int[cnt];
            for(int i=0;i<a.length;i++){
            if(a[i]>0){
                rlt[cnt1]=a[i];
                cnt1++; 
            }    
            }
        return rlt;
    }
}