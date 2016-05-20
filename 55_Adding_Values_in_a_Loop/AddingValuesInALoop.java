import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int total = 0;
		int number;
				
		System.out.println( "I will add up the numbers you give me." );
		System.out.print( "Number: " );
		number = keyboard.nextInt();
		System.out.println( "The total so far is " + total );
		total += number;

		while ( number != 0 )
		{
		    System.out.print( "Number: " );
		    number = keyboard.nextInt();
		    System.out.println( "The total so far is " + total );
		    total += number;
		}
		System.out.println(" ");
		System.out.println("The total is " + total);
	}
}
