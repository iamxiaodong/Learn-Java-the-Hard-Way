public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{		
		for(int n = 2; n <= 100; n++)
        {
           if ( isPrime (n) )
           {
                System.out.println( n );
           }
        }
    }
    
    public static boolean isPrime( int n )
    {
        boolean prime = true;
        
        for ( int i = 2; i < n ; i++)
        {
            prime = true;
            
            if ( n % i == 0 )
            {
                prime = false;
                break;
            }
        }
        return prime;
    }    
}
