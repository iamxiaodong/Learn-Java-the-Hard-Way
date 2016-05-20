import java.util.Scanner;
import java.io.File;

public class LittlePuzzle
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String userFile, jumbledtxt;
		
		System.out.print( "Open which file: " );
		userFile = keyboard.next();
		
		File txtFile = new File(userFile);
		Scanner readFile = new Scanner(txtFile);
		
		jumbledtxt = readFile.nextLine();
		readFile.close();
		
		for ( int i = 0; i < jumbledtxt.length(); i++ )
		{
			if ( (i + 1) % 3 == 0 )
				System.out.print( jumbledtxt.charAt(i) );
		}
		System.out.println();
	}
}
