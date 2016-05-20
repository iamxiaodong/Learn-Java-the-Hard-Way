import java.util.Scanner;

public class NumberPuzzles2
{
	public static void main( String[] args )
	{
		int choice;
				
		while(true)
		{
			choice = menuOptions();
			
			if ( choice == 1 )
				numPuzzle1();
			else if ( choice == 2 )
				numPuzzle2();
			else if ( choice == 3 )
				break;
			else
				System.out.println( "Invalid option. Please try again." );
		}
				
	}
	
	// This will generate a list of two digit numbers that are <= 56
	// and the sum of whose digits > 10;
	public static void numPuzzle1()
	{
		for (int tens = 1; tens <= 5; tens++ )
		{
			for (int ones = 0; ones < 10; ones++ )
			{
				if ( (tens + ones) > 10 && ( (tens * 10) + ones) <= 56 ) 
					System.out.println( tens + "" + ones);
			}
		}
	}
	
	// Find a 2 digit number that the number minus the reverse is == to sum of digits
	public static void numPuzzle2()
	{	
		for ( int tens = 1; tens < 10; tens++)
		{
			for ( int ones = 0; ones < 10; ones++ )
			{
				if ( ((tens * 10) + ones) - ((ones * 10) + (tens)) == ((tens) + ones) )
					System.out.println( (tens * 10) + ones );
			}
		}
	}
	
	public static int menuOptions()
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		
		System.out.println( "1) Find two digit numbers <= 56 with sums of digits > 10" );
		System.out.println( "2) Find two digit number minus number reversed which equals sum of digits" );
		System.out.println( "3) Quit" );
		System.out.print( "\n> " );
		choice = kb.nextInt();
		
		return choice;
	}
}
