
public class ex23 {
    public static void main (String[]args){
        double []d= new double[10];
        for(int i=0;i<d.length;i++){
            d[i]=0.5+i*1.0;
            System.out.print(d[i]+"\t");
            
        }System.out.println("");
        double[] e= new double[20];
        for(int i=0; i<e.length;i++){
            e[i]=10.0+i*0.25;
            System.out.print(e[i]+"\t");
    
    }System.out.println("");
    int index=0;
        double []m= new double[d.length+e.length];
        for(int i=0; i<d.length;i++){
            m[index]=d[i];
           
            System.out.print(m[index++]+"\t");
    }
         for(int i=0; i<e.length;i++){
            m[index]=e[i];
           
            System.out.print(m[index++]+"\t");
    }System.out.println("");
}}
