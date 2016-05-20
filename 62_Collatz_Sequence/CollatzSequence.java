import java.util.Scanner;

public class CollatzSequence
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int num, steps = 0, max = 0;
		
		System.out.print( "Starting number: " );
		num = keyboard.nextInt();
		do
		{
			System.out.print( num + "\t" );
			steps++;
			
			if ( (num % 2) == 0 )
				num /= 2;
			else
				num = (3 * num) + 1;
			
			if ( num > max )
				max = num;
			
		} while ( num > 1 );
		
		System.out.println(num);
		System.out.print( "\nTerminated after " + steps + " steps." );
		System.out.println( " The largest value was " + max + "." );
	}
}
