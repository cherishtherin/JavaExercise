import java.util.Arrays;

public class test3 {
  public static void main(String[] args) {
        int[] score = {58, 37, 69, 88, 98, 74, 23, 80, 63} ;        

        System.out.println("----- min(score[]) ----- 5%") ;        
        System.out.println("score[]="+Arrays.toString(score)) ;
        int minScore = min(score) ; 
        System.out.println("min="+minScore) ;
      
        System.out.println("----- avg(score[]) ----- 5%") ;
        double avgScore = avg(score) ; 
        System.out.printf("avg=%.3f\n", avgScore) ;
        
        System.out.println("----- modify(score[]) ----- 10%") ;
        modify(score) ;         
        System.out.println("modify score[], score="+Arrays.toString(score)) ;
        int[] score2 = {58, 37, 50, 57, 98, 44, 23, 68, 15} ;
        System.out.println("score2[]="+Arrays.toString(score2)+", avg="+avg(score2)) ;
        modify(score2) ; 
        System.out.println("modify score2[], score2="+Arrays.toString(score2)) ;        
    }
      public static int min(int[] a) { 
          int min=a[0];
          for(int i=0; i<a.length; i++){
              if(a[i]<min)min=a[i];
          }
          return min;
      }
      public static double avg (int[]a){
          double sum=0;
          for (int i=0; i<a.length;i++){
              sum+=a[i];
          }
          return sum/a.length;
      }
      public static int [] modify (int[]a){
          int []mod =new int [a.length];
          double avg= avg(a);
          if (avg<60){
              for(int i=0; i<mod.length; i++){
                  if(a[i]<avg)mod[i]= (int)avg;
                  else if (a[i]>avg && a[i]<60)mod[i]=59;
                  else mod[i]+=5;{if (mod[i]>100)mod[i]=100;}   
              }
        
          }
          else{
              for(int i=0; i<mod.length; i++){
                      if(a[i]<avg)mod[i]= 59;
                  else if (a[i]>avg && a[i]<60)mod[i]=(int)avg;
                  else mod[i]+=5;{if (mod[i]>100)mod[i]=100;}   
              
                      }
              
      }
          return mod;
      }
}
