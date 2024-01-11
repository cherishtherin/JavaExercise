public class HWK3_409630497_05 {
    public static void main(String[] args){
	 print("Name List-1: ", "Peter", "Paul") ; // Name List1: Peter, Paul
    	 print("Name List-2: ", "Peter", "Paul", "Mary","Joe","Timothy","Joan") ;
    }
    
    // DIY, 請完成以下print()函數
     public static void print(String header, String ... name  ) {
         System.out.print(header);
         for (int i=0; i<name.length; i++){
             
             if (i==name.length-1)System.out.println(name[i]);
             else System.out.print(name[i] +", ");
         }
         
     }    
}
/* [程式輸出]
Name List-1: Peter,Paul
Name List-2: Peter,Paul,Mary,Joe,Timothy,Joan
*/
