import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int guess;
		int tries = 0;
		
		Random r = new Random();
		
		int choice = 1 + r.nextInt(100);
		
		System.out.println( "I'm thinking of a number between 1-100.  You have 7 guesses." );
		System.out.print( "First guess: " );
		guess = keyboard.nextInt();
		tries++;

		while ( guess != choice && tries < 8 )
		{
		    if ( guess < choice )
		    {
		        System.out.println("Sorry, you are too low.");
		    }
			else
			{
			    System.out.println("Sorry, that guess is too high.");
			}
			System.out.print("Guess # " + tries + ": " );
			guess = keyboard.nextInt();
			tries++;
		}
		if ( guess == choice )
			System.out.println("You guessed it!  What are the odds?!?");
		else
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
	}
}
