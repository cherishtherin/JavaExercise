
public class arrays3 {
    public static void main(String[]args){
        int[]d={12,11,13,35};
        int[]e={2,1,4,8,6};
        int[]f= new int[d.length+e.length];
        System.out.print("d[] ");
        for(var td:d){
            System.out.print(td+"   ");
        }
        System.out.print("\ne[] ");
        for(var te:e){
            System.out.print(te+"  ");
            
        }System.out.print("\nf[] ");
        int index=0;
        for(int i=0; i<d.length; i++){
            f[index]=d[i];
            System.out.print (f[index++]+"  ");
        }
        for(int i=0; i<e.length; i++){
            f[index]=e[i];
            System.out.print (f[index++]+", ");
        }
    }
}
