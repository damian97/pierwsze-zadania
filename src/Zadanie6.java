import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		
		int pierwsza, druga;
		String znak;
		
		System.out.println("Jeste kalklulatore");
		System.out.println("Wykonujê dzi³ania: +  -  *  /  ");
		System.out.println("Na liczbach rzeczywistych");
		System.out.println("");
		System.out.println("Podaj pierwsz¹ liczbê");
		Scanner odczyt = new Scanner(System.in);
		
		pierwsza = odczyt.nextInt();
		
		System.out.println("Poda³eœ liczbê: "+pierwsza);
		System.out.println("Podaj znak");
		
		znak = odczyt.next();
		
		System.out.println("Poda³eœ znak: "+znak);
		System.out.println("Podaj drug¹ liczbê");
		
		druga = odczyt.nextInt();
		
		System.out.println("Poda³eœ liczbê: "+druga);
		
		
		
		switch(znak) {
		
		case "+":
			int dodawanie = pierwsza + druga;
			System.out.println("Twoja operacja to: "+pierwsza+ znak + druga);
			System.out.println("Wynik to:");
			System.out.println(dodawanie);
			break;
		case "-":
			int odejmowanie = pierwsza - druga;
			System.out.println("Twoja operacja to: "+pierwsza+ znak + druga);
			System.out.println("Wynik to:");
			System.out.println(odejmowanie);
			break;
		case "*":
			int mnozenie = pierwsza * druga;
			System.out.println("Twoja operacja to: "+pierwsza+ znak + druga);
			System.out.println("Wynik to:");
			System.out.println(mnozenie);
			break;
		case "/":
			int dzielenie = pierwsza / druga;
			System.out.println("Twoja operacja to: "+pierwsza+ znak + druga);
			System.out.println("Wynik to:");
			System.out.println(dzielenie);
			break;
		default:
			System.out.println();
			System.out.println("Niestety coœ posz³o nie tak. Spróbuj jeszcze raz.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
