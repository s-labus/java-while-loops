// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class NumberGuesingWithACounter
{

	public static void main(String[] args){
	
	Random r = new Random();	
	int secret = 1+r.nextInt(10);
	int guess;
	int tries = 1;
	Scanner scan = new Scanner(System.in);

	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	System.out.print("Your guess: ");
	guess = scan.nextInt();
	
	while(secret != guess){
	 System.out.println("That is incorrect. Guess again.");	
	 System.out.print("Your guess: ");
	 guess = scan.nextInt();
		tries++;
	}	

	System.out.println("That's right! You are a good guesser.");	
	System.out.println("It only took you " + tries + " tries.");
	}

}

