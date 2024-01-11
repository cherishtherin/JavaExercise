
public class ex32 {
    public static void main (String[]args){
        int [] a={3,5,7,9};
        int []b={4,7,8,9,15,13,22};
        int [] c= new int[a.length+b.length];
        for( int val:a){
            System.out.print(val);
        }
        System.out.println("");
        for(int val1:b){
            System.out.print(val1);
        }System.out.println("");
        for(int i=0; i<a.length;i++){
            c[i]=a[i];
            
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];}
        
    }
}
