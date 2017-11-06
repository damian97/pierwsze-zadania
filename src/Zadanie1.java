import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);
    	float stopnie = reader.nextFloat();
    	float stopnie_fahrenhaita =  ((stopnie*1.8f)+32);
    	System.out.println(stopnie +  " Stopni Celsjusza to: " + stopnie_fahrenhaita + " Stopni Fahrenheita");
    }

}


