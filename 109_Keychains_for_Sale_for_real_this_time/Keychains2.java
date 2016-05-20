import java.util.Scanner;

public class Keychains2
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		int total_kc = 0;
		int price = 10;
		
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
				total_kc = add_keychains(total_kc);
			else if ( choice == 2 )
				total_kc = remove_keychains(total_kc);
			else if ( choice == 3 )
				view_order(total_kc, price);
			else if ( choice == 4 )
				checkout(total_kc, price);
			else
				System.out.println( "\nERROR! Please try again." );
		} while ( choice != 4 );
	}
	
	// Prompts user and then adds that number to keychain total
	public static int add_keychains(int kc)
	{
		Scanner kb = new Scanner( System.in );
		int add_kc;
		System.out.print( "You have " + kc + " keychains. How many to add? " );
		add_kc = kb.nextInt();
		kc += add_kc;
		System.out.println( "You now have " + kc + " keychains." );
		return kc;
		
	}
	
	public static int remove_keychains( int kc )
	{
		Scanner kb = new Scanner(System.in);
		int remove_kc; 
		
		System.out.print( "You have " + kc + " keychains. How many to remove? " );
		remove_kc = kb.nextInt();
		kc -= remove_kc;
		System.out.println( "You now have " + kc + " keychains." );
		return kc;
		
	}
	
	public static void view_order( int kc, int price )
	{
		System.out.println( "You have " + kc + " keychains." );
		System.out.println( "Keychains cost $" + price + " each." );
		System.out.println( "Total cost is $" + (kc * price) + "." );
	}
	
	public static void checkout( int kc, int price )
	{
		Scanner kb = new Scanner(System.in);
		String name;
		
		System.out.print( "What is your name? " );
		name = kb.nextLine();
		System.out.println( "You have " + kc + " keychains." );
		System.out.println( "Keychains cost $" + price + " each." );
		System.out.println( "Total cost is $" + (kc * price) + "." );
		System.out.println( "Thanks for your order, " + name + "!" );
	}

}
