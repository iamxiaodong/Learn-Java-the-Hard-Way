import java.util.Scanner;
import java.io.File;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{
		String f_name, l_name;
		File in = new File("name.txt");
		Scanner input = new Scanner(in);
		
		f_name = input.next();
		l_name = input.next();
		
		System.out.println( "Using my psychic powers (aided by reading data from the file), I have" );
		System.out.println( "determined that your name is " + f_name + " " + l_name );
		System.out.println( "Amazing, huh?" );
	}
}
