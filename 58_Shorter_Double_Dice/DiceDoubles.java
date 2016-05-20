import java.util.Random;

public class DiceDoubles
{
	public static void main( String[] args )
	{		
		Random r = new Random();
		
		int roll1, roll2, total;
		
		do 
		{		
		System.out.println( "HERE COMES THE DICE!");
		
		System.out.println( " ");
		
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		
		System.out.println( "Roll #1: " + roll1);
		
		System.out.println( "Roll #2: " + roll2);
		
		total = roll1 + roll2;
		
		System.out.println( "The total is " + total + "!");
		
		System.out.println( " ");
		}
		
		while ( roll1 != roll2 );
		{
		    System.exit(0);
		}
	}
}
