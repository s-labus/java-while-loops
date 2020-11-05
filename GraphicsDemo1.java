// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class GraphicsDemo1
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int hm;
	int a = 3;
	int b = 3;
	int c = 3;
	String p;

	System.out.println("A: "+ a + "\tB: " + b + "\tC: " + c);

	do{System.out.print("Choose a pile: ");
	p = scan.next();
	System.out.print("How many to remove from pile " + p + ": ");
	hm = scan.nextInt();
		
	if(p.equals("a")){a=a- hm;}else if(p.equals("b")){b= b- hm;}else if(p.equals("c")){c= c - hm;}
	System.out.println();

	System.out.println("A: "+ a + "\tB: " + b + "\tC: " + c);} while(a!=0 || b !=0 || c!=0);
	System.out.println();
	System.out.println("All piles are empty. Good job!");
	}

}

