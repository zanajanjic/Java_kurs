package predavanje1;

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

	static String getMessage(int target, int attempt) {
		return "Pogodaaak!!";
	}
	
	
	
	public static void main(String[] args) {
		
		Random izvuceniBroj = new Random();
		
		int rand = izvuceniBroj.nextInt(50);
		
		//System.out.println("Izvuceni broj je: " + rand);
		
		Scanner input = new Scanner(System.in);
		
		int prviBroj = input.nextInt();
		
		if (prviBroj == rand) {
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
		} else if(prviBroj >= rand-5 && prviBroj <= rand+5){
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
		} else {
			System.out.println("Vise srece sledeci put...");
		}

		input.close();
	}

	
	
	
}