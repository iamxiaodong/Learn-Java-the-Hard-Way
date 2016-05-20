import java.util.Scanner;

public class HowManyTimes
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[10];
		int user_num;
		int found = 0;
		
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 50);
			System.out.print( numbers[i] + " " );
		}
		System.out.println();

		System.out.print( "Value to find: " );
		user_num = keyboard.nextInt();
		System.out.println();
		
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( numbers[i] == user_num )
				found++;
		}
		
		System.out.println( user_num + " was found " + found + " times." );
	}
}
