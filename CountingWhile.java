// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class CountingWhile
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);	
 	System.out.println("Type in a message, and I'll display it five times.");
	System.out.print("Message: ");

	String message = scan.nextLine();
	System.out.print("How many times? ");
	int howMany = scan.nextInt();
	int n = 0;
	while(n < howMany){
		System.out.println((n+1) + ". " + message);
		n++;	
	 }	
	}

}

