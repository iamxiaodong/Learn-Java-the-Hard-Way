import java.util.Scanner;

public class ex2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it ten times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 0;
		// Change the code so that the loop repeats ten times instead of five.
		while ( n < 10 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}

	}
}
