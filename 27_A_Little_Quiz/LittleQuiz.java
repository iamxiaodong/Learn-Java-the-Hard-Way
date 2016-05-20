import java.util.Scanner;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String play; 
		int capital, bool, result, score;
		
		score = 0;
		
		System.out.print( "Are you ready for a quiz? " );
		play = keyboard.next();

        /* If you did create every string using new String(somestring).intern() then you can use the == operator to compare two strings, otherwise equals() or compareTo methods can only be used. equals() method is present in the java.lang.Object class and it is expected to check for the equivalence of the state of objects!. */
		if (play.equals("Y"))
		{
		    System.out.println( "Okay, here it comes! " );
		    
		    System.out.println( " " );
		    
		    System.out.println( "Q1) What is the capital of Alaska? " );
		    System.out.println( " \t 1) Melbourne ");
		    System.out.println( " \t 2) Anchorage ");
		    System.out.println( " \t 3) Juneau ");
		    System.out.println(" ");
		    System.out.print("> ");
		    capital = keyboard.nextInt();
		    if ( capital == 3 )
		    {
		        System.out.println( " " );
		        System.out.println( "That's right! " );
		        score++;
		    }
		    else
		    {
		        System.out.println( " " );
		        System.out.println( "Wrong answer! " );
		    }
		    
		    
		    System.out.println( " " );
		    
		    System.out.println( "Q2) Can you store the value 'cat' in a variable of type int? " );
		    System.out.println( " \t 1) yes ");
		    System.out.println( " \t 2) no ");
		    System.out.println(" ");
		    System.out.print("> ");
		    bool = keyboard.nextInt();
		    if ( bool == 1 )
		    {
		        System.out.println( " " );
		        System.out.println( "Sorry, 'cat' is a string. ints can only store numbers. " );
		    }
		    else
		    {
		        System.out.println( " " );
		        System.out.println( "That's right! " );
		        score++;
		    }
		    
		    System.out.println( " " );
		    
		    System.out.println( "Q3) What is the result of 9+6/3? " );
		    System.out.println( " \t 1) 5 ");
		    System.out.println( " \t 2) 11 ");
		    System.out.println( " \t 3) 15/3 ");
		    System.out.println(" ");
		    System.out.print("> ");
		    result = keyboard.nextInt();
		    if ( result == 2 )
		    {
		        System.out.println( " " );
		        System.out.println( "That's correct! " );
		        score++;
		    }
		    else
		    {
		        System.out.println( " " );
		        System.out.println( "Wrong answer! " );
		    }	
		    
		    System.out.println( " " );
		    System.out.println( "Overall, you got " + score + " out of 3 correct. " );
		    System.out.println( "Thanks for playing! " ); 
		    
		}
		else
		{
		    System.out.println( "Bye ");
		}
	}
}
