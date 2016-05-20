import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double side1, side2, side3, check_cons;	
		
		System.out.println( "Enter three integers:" );
		System.out.print( "Side 1: " );
		side1 = keyboard.nextInt();
		System.out.print( "Side 2: " );
		side2 = keyboard.nextInt();
		
		while ( side1 > side2 )
		{  
		    System.out.println( side2 + " is smaller than " + side1 + ". Try again.");
		    System.out.print( "Side 2: " );
		    side2 = keyboard.nextInt();
		}
		System.out.print( "Side 3: " );
		side3 = keyboard.nextInt();
		while ( side2 > side3 )
		{  
		    System.out.println( side3 + " is smaller than " + side2 + ". Try again.");
		    System.out.print( "Side 3: " );
		    side3 = keyboard.nextInt();
		}
		System.out.println( " " );
		System.out.print( "Your three sides are " + side1 + " " + side2 + " " + side3 + "." );
		check_cons = Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2));
		if ( side3 == check_cons )
		{
		    System.out.println( " " );
		    System.out.println( "These sides *do* make a right triangle.  Yippy-skippy!" );
		}
		else
		{
		    System.out.println( " " );
		    System.out.println( "NO!  These sides do not make a right triangle!");
		}
	}
}
