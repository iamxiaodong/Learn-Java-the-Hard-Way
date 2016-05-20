import java.util.Random;

public class BabyBlackjack
{
	public static void main( String[] args )
	{
		Random r = new Random();
		
		int card1 = 1 + r.nextInt(10);
		int card2 = 1 + r.nextInt(10);
		int card3 = 1 + r.nextInt(10);
		int card4 = 1 + r.nextInt(10);
		
		int player_total = card1 + card2;
		int dealer_total = card3 + card4;
		
		System.out.println( "Baby Blackjack!\n" );
		
		System.out.println( "You drew " + card1 + " and " + card2 + "." );
		System.out.println( "Your total is " + player_total + ".\n" );
		
		System.out.println( "The dealer has " + card3 + " and " + card4 + "." );
		System.out.println( "Dealer's total is " + dealer_total + "." );
		
		if ( player_total > dealer_total )
			System.out.println( "YOU WIN!" );
		else if ( player_total == dealer_total )
			System.out.println( "YOU DREW!" );
		else
			System.out.println( "YOU LOSE!" );
	}
}
