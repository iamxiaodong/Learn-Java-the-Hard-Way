import java.util.Scanner;

public class TwentyQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String answer1, answer2, guess;
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it." );
		System.out.println( " " );
		
		System.out.println( "Question 1) Is it animal, vegetable, or mineral? " );
		System.out.print( "> " );
		answer1 = keyboard.next();
		
		System.out.println( " " );
		
		System.out.println( "Question 2) Is it bigger than a breadbox? " );
		System.out.print( "> " );
		answer2 = keyboard.next();
		
		System.out.println( " " );
		
		if ( answer1.equals("animal") && answer2.equals("yes") )
		{
		    guess = "mouse";
		}
		
		else if ( answer1.equals("animal") && answer2.equals("no") )
		{
			guess = "squirrel";
		}
		else if ( answer1.equals("vegetable") && answer2.equals("yes") )
		{
			guess = "watermelon";
		}
		else if ( answer1.equals("vegetable") && answer2.equals("no") )
		{
			guess = "carrot";
		}
		else if ( answer1.equals("mineral") && answer2.equals("yes") )
		{
			guess = "Camaro";
		}
		else
		{
		    guess = "paper clip";
		}
		
		System.out.println( "My guess is that you are thinking of a " + guess + ".");
		System.out.println( "I would ask you if I'm right, but I don't actually care. " );
	}
}
			

