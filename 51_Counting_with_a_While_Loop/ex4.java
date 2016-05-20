import java.util.Scanner;

public class ex4
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it ten times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		
		System.out.print( "How many times? ");
		int times = keyboard.nextInt();		

		int n = 1;
		while ( n < times+1 )
		{
			System.out.println( (n*10) + ". " + message );
			n++;
		}

	}
}
