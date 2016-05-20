import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		double sqroot;	
		
		System.out.println( "SQUARE ROOT!" );
		System.out.print( "Enter a number: " );
		number = keyboard.nextInt();
		
		while ( number <= 0)
		{  
		    System.out.println( "You can't take the square root of a negative number, silly.");
		    System.out.print( "Try again: " );
		    number = keyboard.nextInt();
		}
		sqroot = Math.sqrt(number);
		System.out.println( "The square root of " + number + " is " + sqroot);
	}
}
