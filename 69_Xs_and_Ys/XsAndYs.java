import java.util.*;

public class XsAndYs
{
    public static void main( String[] args )
    {
        double x;
        
        System.out.println( "x      y" );
        System.out.println( "-----------------" );

        for ( x = -10.0 ; x <= 10.0 ; x = x+0.5 )
        {
            System.out.println( x + "     " + x*x );
        }

    }
}

