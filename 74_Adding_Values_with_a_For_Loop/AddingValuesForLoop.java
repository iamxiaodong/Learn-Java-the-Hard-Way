import java.util.Scanner;

public class AddingValuesForLoop
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        int total = 0;

        System.out.print( "Number: " );
        int number = keyboard.nextInt();
        
        for ( int n = 1 ; n <= number ; n = n+1 )
        {
            System.out.print( n + " " );
            total += n;
        }
        System.out.println( "\r\nThe sum is " + total);
    }
}

