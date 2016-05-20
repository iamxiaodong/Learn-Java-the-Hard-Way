import java.util.Scanner;

public class Keychains1
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		
		System.out.println( "Ye Olde Keychain Shoppe" );
		
		do
		{
			System.out.println( "\n1. Add Keychains to Order" );
			System.out.println( "2. Remove Keychains from Order" );
			System.out.println( "3. View Current Order" );
			System.out.println( "4. Checkout" );
			System.out.print( "\nPlease enter your choice: " );
			
			choice = kb.nextInt();
			System.out.println();
			
			if ( choice == 1 )
				add_keychains();
			else if ( choice == 2 )
				remove_keychains();
			else if ( choice == 3 )
				view_order();
			else if ( choice == 4 )
				checkout();
			else
				System.out.println( "\nERROR! Please try again." );
		} while ( choice != 4 );
	}
	
	public static void add_keychains()
	{
		System.out.println( "ADD KEYCHAINS" );
	}
	
	public static void remove_keychains()
	{
		System.out.println( "REMOVE KEYCHAINS" );
	}
	
	public static void view_order()
	{
		System.out.println( "VIEW ORDER" );
	}
	
	public static void checkout()
	{
		System.out.println( "CHECKOUT" );
	}

}
