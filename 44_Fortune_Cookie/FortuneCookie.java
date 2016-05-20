import java.util.Random;

public class FortuneCookie
{
	public static void main( String[] args )
	{		
		Random r = new Random();
		
		int choice = 1 + r.nextInt(6);
		
		if ( choice == 1 )
		{
		    System.out.println( "You will find happiness with a new love." );
		}
		else if ( choice == 2 )
		{
		    System.out.println( "I think you should move on.");
		}
		else if ( choice == 3 )
		{
		    System.out.println( "Sorry, that this happened to you.");
		}
		else if ( choice == 4 )
		{
		    System.out.println( "I think you should move on.");
		}
		else if ( choice == 5 )
		{
		    System.out.println( "Everything happens for the good.");
		}
		else
		{
		    System.out.println( "It is ok.");
		}
	}
}
