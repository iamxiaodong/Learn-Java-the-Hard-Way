import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Count from: " );
        int start = keyboard.nextInt();
        
        System.out.print( "Count to  : " );
        int finish = keyboard.nextInt();
        
        System.out.print( "Count by  : " );
        int step = keyboard.nextInt();

        for ( int n = start ; n <= finish ; n = n+step )
        {
            System.out.print( n + " " );
        }

    }
}

