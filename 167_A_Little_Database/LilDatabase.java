import java.util.Scanner;

class Student
{
String name;
int grade;
double avg;
}

public class LilDatabase
{
	public static void main( String[] args )
	{
		Student[] student_db = new Student[3];
		Scanner kb = new Scanner(System.in);
		
		student_db[0] = new Student();
		System.out.print( "Enter student 1's name: " );
		student_db[0].name = kb.next();
		System.out.print( "Enter student 1's grade: " );
		student_db[0].grade = kb.nextInt();
		System.out.print( "Enter student 1's avg: " );
		student_db[0].avg = kb.nextDouble();
		System.out.println();
		
		student_db[1] = new Student();
		System.out.print( "Enter student 2's name: " );
		student_db[1].name = kb.next();
		System.out.print( "Enter student 2's grade: " );
		student_db[1].grade = kb.nextInt();
		System.out.print( "Enter student 2's avg: " );
		student_db[1].avg = kb.nextDouble();
		System.out.println();

		student_db[2] = new Student();		
		System.out.print( "Enter student 3's name: " );
		student_db[2].name = kb.next();
		System.out.print( "Enter student 3's grade: " );
		student_db[2].grade = kb.nextInt();
		System.out.print( "Enter student 3's avg: " );
		student_db[2].avg = kb.nextDouble();
		System.out.println();
		
		System.out.println( "The names are: " + student_db[0].name + " " + student_db[1].name + " " + student_db[2].name );
		System.out.println( "The grades are: " + student_db[0].grade + " " + student_db[1].grade + " " + student_db[2].grade );
		System.out.println( "The averages are: " + student_db[0].avg + " " + student_db[1].avg + " " + student_db[2].avg );
		
	}
}
