// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class KeepGuesing
{

	public static void main(String[] args){
	
	Random r = new Random();	
	int secret = r.nextInt(11);
	int guess;

	Scanner scan = new Scanner(System.in);

	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	System.out.print("Your guess: ");
	guess = scan.nextInt();
	
	while(secret != guess){
	 System.out.println("That is incorrect. Guess again.");	
	 System.out.print("Your guess: ");
	 guess = scan.nextInt();
	}	

	System.out.println("That's right! You are a good guesser.");	

	}

}

