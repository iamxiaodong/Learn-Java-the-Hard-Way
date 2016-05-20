import java.util.Scanner;

public class ADumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double num1, num2, num3, result;

		System.out.print( "What is your first number? " );
		num1 = keyboard.nextDouble();
		
		System.out.print( "What is your second number? " );
		num2 = keyboard.nextDouble();
		
		System.out.print( "What is your third number? " );
		num3 = keyboard.nextDouble();
		
		System.out.println( " " );
		
		result = ( num1 + num2 + num3 ) / 2;

		System.out.println("( " + num1 + " + " + num2 + " + " + num3 + " ) / 2 is... " + result );
	}
}
