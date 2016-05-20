import java.io.FileWriter;
import java.io.PrintWriter;

public class LetterRevisited
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		
		fileout = new PrintWriter( new FileWriter("letter.txt") );
		
		fileout.println( "+---------------------------------------------------------+" );
		fileout.println( "|                                                      ###|" );
		fileout.println( "|                                                      ###|" );
		fileout.println( "|                                                      ###|" );
		fileout.println( "|                                                         |" );
		fileout.println( "|                                                         |" );
		fileout.println( "|                              John Harris                |" );
		fileout.println( "|                              2432 Parker James Ave      |" );
		fileout.println( "|                              Henderson, NV 89074        |" );
		fileout.println( "|                                                         |" );
		fileout.println( "+---------------------------------------------------------+" );
		fileout.close();
	}
}
