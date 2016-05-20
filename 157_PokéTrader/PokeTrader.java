import java.util.Scanner;

public class PokeTrader
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		String swap_poke;

		int x;

		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("0. " + pokeParty[0]);
			for ( int i=1; i<pokeParty.length; i++ )
				System.out.println("\t" + i + ". " + pokeParty[i]);

			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = keyboard.nextInt();

			// add code here to swap the Pokemon in slot 0 with the Pokemon in slot x
			swap_poke = pokeParty[0];
			pokeParty[0] = pokeParty[x];
			pokeParty[x] = swap_poke;

		} while ( x > 0 );

	}



}
