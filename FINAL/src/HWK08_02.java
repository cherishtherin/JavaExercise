//package cc;

import java.util.Scanner;

public class HWK08_02 {

	public static void main(String[] args) 
	{
            Scanner cin = new Scanner(System.in) ; 
            System.out.print(">command=");
	    String a = cin.next();
            double b = cin.nextDouble();
            double c = cin.nextDouble();
            if (a.equalsIgnoreCase("add")){
                System.out.println(b+"+"+c+"="+(b+c));
            }
            else if (a.equalsIgnoreCase("sub")){
                System.out.println(b+"-"+c+"="+(b-c));
            }
            else if (a.equalsIgnoreCase("mul")){
                System.out.println(b+"*"+c+"="+(b*c));
            }
            else if (a.equalsIgnoreCase("div")){
                System.out.println(b+"/"+c+"="+(b/c));
            }

	    // 完成Add, Sub, Mul, Div等功能

		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
