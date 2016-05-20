import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradesInAnArrayAndAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String fileName, studentName;
		int[] grades = new int[5];		
		
		System.out.print( "Name (first last): " );
		studentName = keyboard.nextLine();
		System.out.print( "Filename: " );
		fileName = keyboard.next();
		System.out.println();
		
		System.out.println( "Here are your randomly-selected grades (hope you pass):" );
		for ( int i = 0; i < grades.length; i++ )
		{
			grades[i] = 1 + (int)(Math.random() * 100);
			System.out.println( "Grade " + (i + 1) + ": " + grades[i] );
		}
		System.out.println();
		
		PrintWriter writeFile = new PrintWriter( new FileWriter( fileName ) );
		writeFile.println( studentName );
		for ( int i = 0; i < grades.length; i++ )
		{
			writeFile.print( grades[i] + " " );	
		}
		writeFile.println();
		writeFile.close();
		System.out.println( "Data saved in \"" + fileName + "\"." );
	}
}
