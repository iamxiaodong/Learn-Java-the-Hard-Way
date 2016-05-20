import java.util.Scanner;
import java.io.File;

public class VowelCapitalization
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String userFile;
		
		System.out.print( "Open which file: " );
		userFile = keyboard.next();
		
		File txtFile = new File(userFile);
		Scanner readFile = new Scanner(txtFile);
		
		while ( readFile.hasNext() )
		{
			String line = readFile.nextLine();
			
			for ( int i = 0; i < line.length(); i++ )
			{
				char c = line.charAt(i);
				
				if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
				{
					System.out.print( Character.toUpperCase(c) );
				}
				else
					System.out.print( c );
			}	
			System.out.println();
		}
	}
}
