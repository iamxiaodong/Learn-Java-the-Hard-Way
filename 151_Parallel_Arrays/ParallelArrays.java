import java.util.Scanner;

public class ParallelArrays
{
	public static void main( String[] args )
	{
		String[] student_name = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] student_grade = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] student_id = { 123456, 813225, 230498, 309835, 230498 };
		int user_id, id_at = -1;
		Scanner keyboard = new Scanner(System.in);
		
		 System.out.println( "Values: " );
		 for ( int i = 0; i < student_id.length; i++ )
		 {
		 	System.out.print( "\t" + student_name[i] + " " + student_grade[i] + " " + student_id[i] + "\n" );
		 }
		 
		 System.out.print( "\nID number to find: " );
		 user_id = keyboard.nextInt();
		 
		 for ( int i = 0; i < student_id.length; i++ )
		 {	
		 	if ( user_id == student_id[i] )
		 		id_at = i;
		 }
		 
		 System.out.println();
		 if ( id_at >= 0 )
		 {
		 	System.out.println( "Found in slot " + id_at );
		 	System.out.println( "\tName: " + student_name[id_at] );
		 	System.out.println( "\tAverage: " + student_grade[id_at] );
		 	System.out.println( "\tID: " + student_id[id_at] );
		 }
		 else
		 	System.out.println( "Student not found." );
	}
}
