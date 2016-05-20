import java.util.Scanner;

public class CompareToChallenge
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

        // Integer that compareTo() is -ve
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);
        
        System.out.print("Comparing \"bat\" with \"man\" produces ");
        int j = "bat".compareTo("man");
        System.out.println(j);
        
        System.out.print("Comparing \"Devil\" with \"Satan\" produces ");
        int k = "Devil".compareTo("Satan");
        System.out.println(k);
        
        // Integer that compareTo() is 0        
        System.out.print("Comparing \"antman\" with \"antman\" produces ");
        System.out.println( "antman".compareTo("antman") );
        
        // Integer that compareTo() is +ve        
        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        System.out.println( "applebee's".compareTo("apple") );
        
        System.out.print("Comparing \"superman\" with \"man\" produces ");
        System.out.println( "superman".compareTo("man") );
        
        System.out.print("Comparing \"bumblebee's\" with \"bee\" produces ");
        System.out.println( "bumblebee's".compareTo("bee") );  
	}
}
