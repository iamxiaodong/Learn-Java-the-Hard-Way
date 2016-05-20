import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main( String[] args )
	{		
	    Scanner keyboard = new Scanner(System.in);
	    
		Random r = new Random();
		
		int guess = 1 + r.nextInt(100);
		int your_guess;
		
		System.out.println( "I'm thinking of a number between 1-100.  Try to guess it." );
		System.out.print( "> " );
		your_guess = keyboard.nextInt();
		System.out.println( " " );
		
		if ( guess == your_guess )
		{
		    System.out.println( "You guessed it!  What are the odds?!?" );
		}
		else if ( guess < your_guess )
		{
		    System.out.println( "Sorry, you are too high.  I was thinking of " + guess + ".");
		}
		else
		{
		    System.out.println( "Sorry, you are too low.  I was thinking of " + guess + ".");
		}
	}
}
