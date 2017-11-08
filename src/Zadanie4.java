import java.util.Scanner;

public class Zadanie4 {

	public static void main (String[] args) {
	
		System.out.println("Podaj swój miesiêczny dochód");
		
		Scanner odczyt = new Scanner(System.in);
		
		float dochod = odczyt.nextFloat();
		
		float dochod_roczny = dochod*12;
		
		float nadwyzka = dochod_roczny - 85528;
		
		float procentnadwyzki = nadwyzka * 0.32f;
		
		float podatek1 = 0;
		
		if (dochod_roczny <= 85528) {
			
			podatek1 = dochod_roczny*0.18f - 556.02f;
			
			System.out.println(podatek1);
			
		}else if (dochod_roczny > 85528) {
			
			podatek1 = 14839.02f + procentnadwyzki;
			
			System.out.println(podatek1);
			
		}
		

		
		
	}
	
}
