import java.util.Scanner;

public class CountingMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Count to: " );
        int number = keyboard.nextInt();

        for ( int n = 1 ; n <= number ; n = n+1 )
        {
            System.out.print( n + " ");
        }

    }
}
