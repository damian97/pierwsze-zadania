import java.util.Scanner;

public class Zadanie5 {

	public static void main (String[] args) {
		
		System.out.println("Podaj cenê towaru (od 100 z³ do 10 tyœ. z³)");
		
		Scanner odczyt = new Scanner(System.in);
		
		float oprocentowanie;
		int cena = odczyt.nextInt();
		float rata, procent;
		
		if (cena < 100 || cena > 10000) {
			
			System.out.println("Podaj cenê z zakresu od 100 do 10 tyœ z³");
			
		}else 
		{
			
			System.out.println("Podaj liczbê rat");
			int raty = odczyt.nextInt();
			
			if (raty < 6 || raty > 48) {
				
				System.out.println("Minimalna liczba rat to 6, a maksymalna to 48");
					
			}else
			{
				
				if (raty >= 6 && raty <= 12) {
					
					oprocentowanie = 0.025f;	
					procent = oprocentowanie*cena;
					rata = (cena/raty) + procent;
					System.out.println(rata);
				}else if (raty >= 13 && raty <= 24){
					
					oprocentowanie = 0.5f;
					procent = oprocentowanie*cena;
					rata = (cena/raty) + procent;
					System.out.println(rata);
				}else if (raty >= 25 && raty <= 48){
					
					oprocentowanie = 0.10f;
					procent = oprocentowanie*cena;
					rata = (cena/raty) + procent;
					System.out.println(rata);
				}
				
			}
			
		
			
			
			
			
			
			
		}
		
		
	}	
	
}
