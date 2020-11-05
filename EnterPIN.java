// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class EnterPIN
{

	public static void main(String[] args){
	Scanner key = new Scanner(System.in);
	int pin = 8076;

	System.out.println("WELCOME TO THE BANK OF MITCHELL.");
	System.out.println("ENTER YOUR PIN: ");	
	
	int entry = key.nextInt();

	while(entry != pin){
		System.out.println("\nINCORRECT PIN. TRY AGAIN.");
		System.out.println("ENTER YOUR PIN: ");
		entry = key.nextInt();		
	}
	
	System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
 }

}

