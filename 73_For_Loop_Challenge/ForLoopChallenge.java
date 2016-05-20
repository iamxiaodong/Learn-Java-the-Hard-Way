import java.util.*;

public class ForLoopChallenge
{
    public static void main( String[] args )
    {        
        int start = 15;
        int finish = 30;
        int step = 3;

        for ( int n = start ; n <= finish ; n = n+step )
        {
            System.out.print( n + " " );
        }

    }
}

