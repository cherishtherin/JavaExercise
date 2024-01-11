
public class test2 {
        public static void main(String[] args) {
        System.out.println("------- mid(a,b,c) ---- 5%") ;
        int mid = mid(5, 12, 7) ;
         System.out.println("mid(5,12,7)="+mid(5,12,7));
        
        System.out.println("------- discount(price) ---- 6%") ; 
        int[] price = {-1, 300, 600, 1500, 2500, 4000} ;
        double [] discP= discount(price);
        for (int i=1; i<price.length; i++){
            System.out.printf("price (%d) ,price discount = %.1f",price[i],discP[i]);
            System.out.println("");
        }
        
        System.out.println("------- formula(n) ----- 7%") ; 
        System.out.printf("formula(5)=%.4f\n",formula(5)) ; 
        System.out.printf("formula(10)=%.4f\n",formula(10)) ;     
}
public static int mid(int a, int b, int c){
    
    int [] row= {a,b,c};
    int min=row[0], max=row[0];
    for (int i=0; i<row.length; i++){
    if(row[i]<min)min=row[i];
    if(row[i]>max)max=row[i];
}int middle = 0;
    for (int i=0; i<row.length; i++){
        if(row[i]!=max&& row [i] !=min){
            middle=row[i];
        }
    }
    return middle;
}
public static double[] discount(int []x){
    double []discP= new double [x.length];
    for(int i=0; i<x.length; i++){
        if(x[i]>=2000){
            discP[i]=x[i]*80/100;}
        else if(x[i]>=1000){
            discP[i]=x[i]*90/100;}
        else if(x[i]>=500){
            discP[i]=x[i]*95/100;}
        else{
            discP[i]=x[i];}
    }
    return discP;
}
public static double formula(int x){
    double p=0;
    for (int i=1; i<=x; i++){
        
        if(i%2==0)p-=(double)i/(i+1);
        else p+=(double)i/(i+1);
    }
    return p;
}
}
