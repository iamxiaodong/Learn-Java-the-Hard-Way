import java.util.Scanner;

public class PokeSwap
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		String enemy = "STARMIE";

		int choice;

		System.out.println("Misty sent out " + enemy + "!");

		System.out.println("\n" + enemy + "\t\t Lv21");
		System.out.println("   HP [================]\n");

		System.out.println("What will " + pokeParty[0] + " do?");
		System.out.println("\t1. Fight");
		System.out.println("\t2. Swap Pokemon");
		System.out.println("\t3. Run");
		System.out.print("> ");
		choice = keyboard.nextInt();

		if ( choice == 1 )
		{
			System.out.println( pokeParty[0] + " used THUNDERSHOCK!  It's super effective." );

			System.out.println("\nSTARMIE\t\t Lv21");
			System.out.println("   HP [===========     ]\n");

			System.out.println( enemy + " used WATER PULSE!" );
			System.out.println( pokeParty[0] + " fainted." );
		}

		if ( choice == 2 )
		{
			System.out.println( "\n" + pokeParty[0] + " swaps out with " + pokeParty[3] + "!\n" );

			// add code here to swap Pikachu (slot 0) with Gyarados (slot 3)

			System.out.println( pokeParty[0] + " used BITE!  It's super effective." );

			System.out.println("\nSTARMIE\t\t Lv21");
			System.out.println("   HP [                ]\n");

			System.out.println( enemy + " fainted.\n" );
			System.out.println( pokeParty[0] + " gained 155 EXP. Points!" );
			System.out.println( pokeParty[3] + " gained 155 EXP. Points!" );
			System.out.println( "Received TM03 - WATER PULSE." );
			System.out.println( "Received CASCADEBADGE." );
			System.out.println( "Received $2100" );
		}

		if ( choice == 3 )
		{
			System.out.println( pokeParty[0] + " couldn't run. Skip a turn, coward." );

			System.out.println("\nSTARMIE\t\t Lv21");
			System.out.println("   HP [================]\n");

			System.out.println( enemy + " used WATER PULSE!" );
			System.out.println( pokeParty[0] + " fainted." );
		}

	}



}

