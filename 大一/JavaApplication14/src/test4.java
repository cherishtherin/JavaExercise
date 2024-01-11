import java.util.*;
public class test4 {
    public static void main (String[]args){
        Scanner cin = new Scanner(System.in);
        int []cnt = {0,0,0,0,0};
        while(true){
            String no= cin.next();
            if(no.equals("X")){break;}
            switch(no){
                    case "A":
                    case "a":
                        cnt[0]++;break;
                    case "B":
                    case "b":
                        cnt[1]++;break;
                    case "C":
                    case "c":
                        cnt[2]++;break;
                    case "D":
                    case "d":
                        cnt[3]++;break;  
                    case "E":
                    case "e":
                        cnt[4]++;    
                        
        }
            
        } System.out.print("cnt[]=[");
        for(int i=0; i<cnt.length; i++){
            
            if(i==cnt.length-1){
                System.out.print(cnt[i]+"] ");
            }
            else{
                System.out.print(cnt[i]+", ");
            }
       
        }
        int max= cnt[0];
        String [] level= {"A","B","C","D","E"};
        String max1= level[0];
    
         for(int i=0; i<cnt.length; i++){
             if(cnt[i]>max){max=cnt[i];max1=level[i];
         }
         
       
         }System.out.println(" The max number is max"+max1+"with amount of"+max);
    }
}
