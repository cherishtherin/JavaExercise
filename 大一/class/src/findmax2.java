
public class findmax2 {
    public static void main (String[]args){
         int [] a={58, 37, 69, 88, 98, 74, 23, 80, 63} ;
         int max=0,max2=0;
         for (int i=0; i<a.length; i++){
             if(a[i]>max)max=a[i];
         }
         for (int i=0; i<a.length; i++){
             if(a[i]>max2&&a[i]<max)max2=a[i];
         }
         System.out.println("max2 ="+max2);
         
         double avg,total=0;
         for (int i=0; i<a.length; i++){
             if(a[i]!=max2)total+=a[i];
         }
        avg=total/a.length-1;
         
         System.out.printf("avg %.2f ",avg);
    }
}
