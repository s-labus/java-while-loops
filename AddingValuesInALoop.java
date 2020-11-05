// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class AddingValuesInALoop
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	

	int num;
	int total = 0;

	System.out.println("I will add up the numbers you give me.");
	System.out.print("Number: ");
	num = scan.nextInt();

	total += num; 
	System.out.println("The total so far is " + total);

	while(num != 0){
	num = scan.nextInt();
	total += num; 
	System.out.println("The total so far is " + total);
	}

	System.out.println();
	System.out.println("The total is " + total + ".");
 }
}

