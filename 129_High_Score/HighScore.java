import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HighScore
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter fileout;
		
		fileout = new PrintWriter( new FileWriter("score.txt") );

		int score;
		String name;

		System.out.print( "Please enter your score: " );
		score = keyboard.nextInt();

		System.out.print( "Please enter your name: " );
		name = keyboard.next();
		
		fileout.println( "Your name is: " + name );
		fileout.println( "Your score is: " + score );
		fileout.close();
	}
}
