
public class hwk1_02 {
    public static void main (String[]args){
        double x0= 1, y0= 2, r= 8.5;
        double [] x= new double [360];
        double [] y= new double [360];
        for(int i=0; i<x.length; i+=15){
            x[i]=x0+Math.cos(Math.toRadians(i));
            y[i]=y0+Math.sin(Math.toRadians(i));
            System.out.print(i+": ( "+Math.round(x[i]*100)/100.0+" , "+Math.round(y[i]*100)/100.0+" )");
        }
    }
    
}
