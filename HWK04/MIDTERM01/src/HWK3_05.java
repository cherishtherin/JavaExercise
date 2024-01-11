public class HWK3_05 {
    public static void main(String[] args){
	 print("Name List-1: ", "Peter", "Paul") ; // Name List1: Peter, Paul
    	 print("Name List-2: ", "Peter", "Paul", "Mary","Joe","Timothy","Joan") ;
    }
    
    public static void print (String dex, String ... name){
        System.out.print(dex);
        for (int i=0; i<name.length; i++){
            if(i==name.length-1) System.out.print(name[i]);
            else System.out.print(name[i]+", ");
        }
        System.out.println("");
      
     }    
}
/* [程式輸出]
Name List-1: Peter,Paul
Name List-2: Peter,Paul,Mary,Joe,Timothy,Joan
*/
