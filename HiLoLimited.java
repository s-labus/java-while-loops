// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{

	public static void main(String[] args){
	
	Random r = new Random();	
	int secret = 1+r.nextInt(100);
	int guess;
	int tries = 1;
	Scanner scan = new Scanner(System.in);

	System.out.println("I have chosen a number between 1 and 100. You have 7 guesses.");
	System.out.print("First guess: ");
	guess = scan.nextInt();
	
	while(secret != guess && tries < 7){
	if(guess < secret){
		System.out.println("Sorry, you are low.");
	}else if(guess > secret){System.out.println("Sorry, you are too high.");}
	System.out.print("Guess #"+(tries+1)+": ");
	 guess = scan.nextInt();
	tries++;
	System.out.println(tries);
	 if(secret == guess){System.out.println("You guessed it! What are the odds?!?"); break;}
	 if(tries == 7){System.out.println("Sorry, you didn't guess it in 7 tries. You lose. It was " + secret);}
	}
 }
}

