import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int guess;
		
		Random r = new Random();
		
		int choice = 1 + r.nextInt(10);
		
		System.out.println( "I'm thinking of a number from 1 to 10." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		
		System.out.println( " " );
		
		if ( guess == choice )
		{
		    System.out.println( "That's right!  My secret number was " + guess + "!" );
		}
		else
		{
		    System.out.println( "Sorry, but I was really thinking of " + choice + ".");
		}
	}
}
