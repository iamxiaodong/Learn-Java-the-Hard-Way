import java.io.File;
import java.util.Scanner;

public class SortingRecordsOnTwoFields {

	public static void main( String[] args ) throws Exception {
		Scanner kb = new Scanner(System.in);
		String txtFile;
		
		System.out.print( "Open which file: " );
		txtFile = kb.next();
		
		File usrFile = new File(txtFile);
		Scanner readFile = new Scanner(usrFile);
		
		Record[] student_grades = new Record[30];
		int rec_count = 0;
		Record temp_record;
		
		while (readFile.hasNext() || rec_count < 30 ) {
			student_grades[rec_count] = new Record();
			student_grades[rec_count].stu_id = readFile.nextInt();
			student_grades[rec_count].grade_num = readFile.nextInt();
			student_grades[rec_count].grade = readFile.nextDouble();
			student_grades[rec_count].letter_grade = readFile.next();
			rec_count++;
		}
		System.out.println( "Data loaded." );
		
		for (int i = 0; i < student_grades.length; i++ ) {
			for (int j = i + 1; j < student_grades.length; j++ ) {
				if (student_grades[i].stu_id > student_grades[j].stu_id) {
						temp_record = student_grades[i];
						student_grades[i] = student_grades[j];
						student_grades[j] = temp_record;
				}
			}
		}
		
		for (int i = 0; i < student_grades.length; i++ ) {
			for (int j = i + 1; j < student_grades.length; j++ ) {
				if ( student_grades[i].stu_id == student_grades[j].stu_id &&
					student_grades[i].grade_num > student_grades[j].grade_num ) {
						temp_record = student_grades[i];
						student_grades[i] = student_grades[j];
						student_grades[j] = temp_record;
				}
			}
		}

		
		System.out.println( "Data sorted." );
		
		System.out.println( "Here are the sorted grades: " );
		for (int i = 0; i < student_grades.length; i++ ) {
			System.out.println( "\t" + student_grades[i].stu_id + " " +
								student_grades[i].grade_num + " " +
								student_grades[i].grade + " " +
								student_grades[i].letter_grade );
		}
	
	
	}
}

class Record {
	int stu_id;
	int grade_num;
	double grade;
	String letter_grade;
}
