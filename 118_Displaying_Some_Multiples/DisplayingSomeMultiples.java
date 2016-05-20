import java.util.Scanner;

public class DisplayingSomeMultiples
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int number;

		System.out.print( "Choose a number: " );
		number = keyboard.nextInt();
		
		for ( int i = 1; i < 13 ; i ++ )
		{
		    System.out.println( number + "x" + i + " = " + number * i);
		}
	}
}
