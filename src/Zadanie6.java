import java.util.Scanner;

public class Zadanie6 {

	public static void main(String[] args) {
		
		int pierwsza, druga;
		String znak;
		
		System.out.println("Jeste kalklulatore");
		System.out.println("Wykonuj� dzi�ania: +  -  *  /  ");
		System.out.println("Na liczbach rzeczywistych");
		System.out.println("");
		System.out.println("Podaj pierwsz� liczb�");
		Scanner odczyt = new Scanner(System.in);
		
		pierwsza = odczyt.nextInt();
		
		System.out.println("Poda�e� liczb�: "+pierwsza);
		System.out.println("Podaj znak");
		
		znak = odczyt.next();
		
		System.out.println("Poda�e� znak: "+znak);
		System.out.println("Podaj drug� liczb�");
		
		druga = odczyt.nextInt();
		
		System.out.println("Poda�e� liczb�: "+druga);
		
		
		
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
			System.out.println("Niestety co� posz�o nie tak. Spr�buj jeszcze raz.");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
