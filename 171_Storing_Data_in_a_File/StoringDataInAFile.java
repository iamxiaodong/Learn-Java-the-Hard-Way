import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Car
{
	String make;
	String model;
	int year;
	String license;
}

public class StoringDataInAFile
{
	public static void main( String[] args ) throws Exception
	{
		Car[] auto_dump = new Car[5];
		Scanner kb = new Scanner(System.in);
		
		for ( int i = 0; i < auto_dump.length; i++ )
		{
			auto_dump[i] = new Car();
			System.out.println( "Car " + (i + 1) );
			
			System.out.print( "\tMake: " );
			auto_dump[i].make = kb.next();
			System.out.print( "\tModel: " );
			auto_dump[i].model = kb.next();
			System.out.print( "\tYear: " );
			auto_dump[i].year = kb.nextInt();
			System.out.print( "\tLicense: " );	
			auto_dump[i].license = kb.next();		
		}
		
		System.out.print( "To which file do you want to save this information? " );
		String usrFile = kb.next();
		
		// Creating a new file and writing into that file.
		PrintWriter fileOut = new PrintWriter( new FileWriter(usrFile) );
		
		for ( int i = 0; i < auto_dump.length; i++ )
		{
			fileOut.println( "Car " + (i + 1) );
			fileOut.println( auto_dump[i].make );
			fileOut.println( auto_dump[i].model );
			fileOut.println( auto_dump[i].year );
			fileOut.println( auto_dump[i].license );
		}
		fileOut.close();
		System.out.println( "Data saved." );
	}
		
}
