import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main( String[] args )
	{		
	    Scanner keyboard = new Scanner(System.in);
	    
		Random r = new Random();
		
		int guess = 1 + r.nextInt(3);
		int your_guess;
		
		System.out.println( "You slide up to Fast Eddie's card table and plop down your cash." );
		System.out.println( "He glances at you out of the corner of his eye and starts shuffling." );
		System.out.println( "He lays down three cards." );
		
		System.out.println( " " );
		
		System.out.println( "Which one is the ace? " );
		
		System.out.println( " " );
		
		System.out.println( "\t ##  ##  ##" );
		System.out.println( "\t ##  ##  ##" );
		System.out.println( "\t 1   2   3" );
		
		System.out.println( " " );
				
		System.out.print( "> " );
		your_guess = keyboard.nextInt();
		System.out.println( " " );
		
		if ( guess == your_guess )
		{
		    System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." );
		    System.out.println( " " );
		}
		else
		{
		    System.out.println( "Ha! Fast Eddie wins again! The ace was card number " + guess + ".");
		    System.out.println( " " );
		}
		
		switch(guess)
        {
         case 1 :
            System.out.println( "\t AA  ##  ##" );
		    System.out.println( "\t AA  ##  ##" );
		    System.out.println( "\t 1   2   3" ); 
            break;
         case 2 :
            System.out.println( "\t ##  AA  ##" );
		    System.out.println( "\t ##  AA  ##" );
		    System.out.println( "\t 1   2   3" ); 
            break;
         case 3 :
            System.out.println( "\t ##  ##  AA" );
		    System.out.println( "\t ##  ##  AA" );
		    System.out.println( "\t 1   2   3" ); 
            break;
        }
	}
}
