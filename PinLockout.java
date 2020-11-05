// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class PinLockout
{

	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	int pin = 12345;	
	int tries = 0;

	System.out.println("WELCOME TO THE BANK OF MITCHELL.");
	System.out.print("ENTER YOUR PIN: ");

	int entry = keyboard.nextInt();
	tries++;
	int max_tries = 4;
	while(entry != pin && tries <max_tries){
		System.out.println("\nINCORRECT PIN. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		tries++;
	 }
	
	if(entry == pin){
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");		
		}
	else if(tries>=max_tries){
		System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
	}

	}

}

