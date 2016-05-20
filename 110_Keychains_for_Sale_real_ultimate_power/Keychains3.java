import java.util.Scanner;

public class Keychains3
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		int total_kc = 0;
		double price = 10.0;
		double tax = 0.0825;
		int base_ship = 5;
		
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
				view_order(total_kc, price, tax, base_ship, additional_shipping(total_kc) );
			else if ( choice == 4 )
				checkout(total_kc, price, tax, base_ship, additional_shipping(total_kc) );
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
		int new_total_kc = 0;
		
		do
		{
			System.out.print( "You have " + kc + " keychains. How many to remove? " );
			remove_kc = kb.nextInt();
			new_total_kc = kc - remove_kc;
			
			if ( new_total_kc < 0 )
				System.out.println( "You cannot have less than 0 key chains. Please try again." );
			
		} while( new_total_kc < 0 );
		kc = new_total_kc;
		System.out.println( "You now have " + kc + " keychains." );
		return kc;
		
	}
	
	public static int additional_shipping( int kc )
	{
		if ( kc > 1 )
		{
			return (kc - 1);
		}
		else
		{
			return 0;
		}
	}
	
	public static void view_order( int kc, double price, double tax, int base_shipping, int per_kc_shipping )
	{
		double total, tot_tax;
		
		total = kc * price;
		tot_tax = total * tax;
		System.out.println( "You have " + kc + " keychains." );
		System.out.println( "Keychains cost $" + price + " each." );
		System.out.println( "Your subtotal is $" + total + "." );
		System.out.println( "We charge $5.00 base shipping and $1.00 for each additional keychain." );
		System.out.println( "Shipping cost $" + (base_shipping + per_kc_shipping) + "." );
		System.out.println( "Tax cost $" + tot_tax + "." );
		System.out.println( "Total cost is $" + (total + tot_tax + base_shipping + per_kc_shipping) + "." );
	}
	
	public static void checkout( int kc, double price, double tax, int base_shipping, int per_kc_shipping )
	{
		Scanner kb = new Scanner(System.in);
		String name;
// 		double total, tot_tax;
// 		
// 		total = kc * price;
// 		tot_tax = total * tax;
		
		System.out.print( "What is your name? " );
		name = kb.nextLine();
		view_order( kc, price, tax, base_shipping, per_kc_shipping);
// 		System.out.println( "You have " + kc + " keychains." );
// 		System.out.println( "Keychains cost $" + price + " each." );
// 		System.out.println( "Your subtotal is $" + total + "." );		
// 		System.out.println( "We charge $5.00 base shipping and $1.00 for each additional keychain." );
// 		System.out.println( "Shipping cost $" + (base_shipping + per_kc_shipping) + "." );
// 		System.out.println( "Tax cost $" + tot_tax + "." );
// 		System.out.println( "Total cost is $" + (total + tot_tax + base_shipping + per_kc_shipping) + "." );
		System.out.println( "Thank you for your order, " + name );
	}
	
}
