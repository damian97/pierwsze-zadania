import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
       
		 System.out.println("Podaj kolejno 3 cyfry");
        
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();	 

        int b = reader.nextInt();

        int c = reader.nextInt();
        
    	  if (a > b && a > c) {
          	
          	System.out.println("Najwieksza cyfra to "+ a);
          	
          }
    	  else if(b > a && b > c ) {
    		  
    		  System.out.println("Najwieksza cyfra to "+ b);
    		  
    	  }
    	  else if(c > a && c > b ) {
    		  
    		  System.out.println("Najwieksza cyfra to "+ c);
    		  
    	  }
    	  else if(a == b || a == c || c == b || c == a || b == a || b == c ) {
    		  
    		  System.out.println("Cyfry nie mog¹ byæ takie same!");
    		  
    	  }
      
        
    	  
    	  
        
    }

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
