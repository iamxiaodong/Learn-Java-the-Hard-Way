import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int loop = 10;
		
		System.out.print( "What is your name: " );
		name = keyboard.next();
		System.out.println();
		
		if ( name.equals("Mitchell") )
		    loop = 5;
		    
		for ( int n = 1; n <= loop; n++ )
		{
		    System.out.println( name );		
		}
    }
}
