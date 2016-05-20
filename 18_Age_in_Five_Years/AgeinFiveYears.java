import java.util.Scanner;

public class AgeinFiveYears
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String name;

		System.out.print( "Hello.  What is your name? " );
		name = keyboard.next();
		
		System.out.println( " " );

		System.out.print( "Hi, " + name+ "!" + " How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( " " );

		System.out.println( "Did you know that in five years you will be " + (age+5) + " years old? " );
		System.out.print( "And five years ago you were " + (age-5) + "!" + " Imagine that! " );
	}
}
