
public class HWK1_409630497_02 {
    public static void main (String[]args){
        double xo=1, yo=2, r=8.5;
        double []x= new double[360]; double []y=new double[360];
        
        for(int i=0; i<x.length; i++){
            x[i]=xo+r*Math.cos(Math.toRadians(i));
            y[i]=yo+r*Math.sin(Math.toRadians(i));
    }
        for(int i=0; i<x.length; i++){
            if(i%15==0){
                System.out.println(i+": ("+x[i]+","+y[i]+")");
            }
        }
    }
}
