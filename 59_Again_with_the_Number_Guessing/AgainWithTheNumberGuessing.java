import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		
		int guess, choice;
		int tries = 0;		
		
		System.out.println( "I have chosen a number between 1 and 10.  Try to guess it." );
		choice = 1 + r.nextInt(10);

		do 
		{
		    System.out.print( "Your guess: " );
		    guess = keyboard.nextInt();
		    tries++;
		    if ( guess != choice )
		        System.out.println( "That is incorrect. Guess again." );
		}
		while ( guess != choice );
		{
		   System.out.println( "That's right! You're a good guesser.");
		   System.out.println( "It only took you " + tries + " tries.");
		}
	}
}
