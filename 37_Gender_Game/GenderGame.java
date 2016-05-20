import java.util.Scanner;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String gender, married, f_name, l_name;

		System.out.print( "What is your gender (M or F): " );
		gender = keyboard.next();
		
		    if ( gender.equals("M") )
		    {
		        System.out.print( "First name: " );
		        f_name = keyboard.next();

		        System.out.print( "Last name: " );
		        l_name = keyboard.next();
		
		        System.out.print( "Age: " );
		        age = keyboard.nextInt();
		        
		        System.out.println( " " );
		        
		        if (age >= 20 )
		        {
		            System.out.println( "Then I shall call you Mr. " + l_name + ".");
		        }
		        else
		        {
		            System.out.println( "Then I shall call you " + f_name + " " + l_name + ".");
		        }
		    }
		    
		    else if ( gender.equals("F") )
		    {
		        System.out.print( "First name: " );
		        f_name = keyboard.next();

		        System.out.print( "Last name: " );
		        l_name = keyboard.next();
		
		        System.out.print( "Age: " );
		        age = keyboard.nextInt();
		        
		        System.out.println( " " );
		        
		        System.out.print( "Are you married, " + f_name + " (y or n)? ");
		        married = keyboard.next();
		        
		        System.out.println( " " );
		        
		        if (age >= 20 && married.equals("y"))
		        {
		            System.out.println( "Then I shall call you  Mrs. " + l_name + ".");
		        }
		        else
		        {
		            System.out.println( "Then I shall call you Ms. " + l_name + ".");
		        }
		    
		    }
    }
}
