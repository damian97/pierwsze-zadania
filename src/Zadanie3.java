import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		
		System.out.println("Podaj swoj� wag� w kilogramach");
		
		Scanner odczyt = new Scanner(System.in);
		
		float waga = odczyt.nextFloat();
		
		System.out.println("Podaj sw�j wzrost w metrach");
		
		
		float wzrost = odczyt.nextFloat();
		
		float wzrost2 = wzrost * wzrost;
	
		float BMI = waga/wzrost2;
		
		if (BMI >= 24.9f) {
			
			System.out.println("Nadwaga");
			
		}else if (BMI <= 18.5f) {
			
			System.out.println("Niedowaga");
			
		}else {
			
			System.out.println("Waga prawid�owa");
			
		}
		
		
	}
	
}

