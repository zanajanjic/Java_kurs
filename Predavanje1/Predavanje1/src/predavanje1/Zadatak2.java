package predavanje1;

import java.util.Scanner;

public class Zadatak2 {
	
	


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj");
		int a = input.nextInt();
		
		System.out.println("Unesite drugi broj");
		int b = input.nextInt();

		System.out.println("Unesite kod zeljene racunske opracije:S,O,M,D");
		char o = input.next().charAt(0);
		
		
		switch(o) {
		case 's' :
			System.out.println(a + " + " + b + " = " + (a+b) );
			break;
		case 'o' :
			System.out.println(a + " - " + b + " = " + (a-b) );
			break;
		case 'm' :
			System.out.println(a + " * " + b + " = " + (a*b) );
			break;
		case 'd' :
			
			if(b == 0) {
				System.out.println("Deljenje sa O nije dozvoljeno");
			}else {
				System.out.println(a + " / " + b + " = " + ((double)a/b) );
				
			}
			break;
		default: 
			System.out.println("Uneli ste nepoznatu komandu");
		}


		


		input.close();	
	}

	
	
	
	
	
	
	
	
	
	
	
}
