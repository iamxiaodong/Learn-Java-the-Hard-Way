import java.util.Scanner;

public class MoreUserInputofData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int grade, student_id;
		double gpa;
		String f_name, l_name, login;
		
		System.out.println( "Please enter the following information so I can sell it for a profit! " );
		
		System.out.println( " " );
		
		System.out.print( "First name: " );
		f_name = keyboard.next();
		
		System.out.print( "Last name: " );
		l_name = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		student_id = keyboard.nextInt();

		System.out.print( "Login: " );
		login = keyboard.next();

		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		
		System.out.println( " " );

		System.out.println( "Your information: " );
		System.out.println( "\t Login: " +  login);
		System.out.println( "\t ID: " +  student_id);
		System.out.println( "\t Name: " +  l_name + "," + f_name);
		System.out.println( "\t GPA: " +  gpa);
		System.out.println( "\t Grade: " +  grade);
	}
}
