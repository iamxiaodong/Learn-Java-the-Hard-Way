public class BasicNestedLoops
{
	public static void main( String[] args )
	{
		for ( int n=0; n <= 5; n++ )
		{
			for ( int i= 0; i <= 5; i++ )
			{
				System.out.print( "(" + n + "," + i + ") " );
			}
			System.out.println();
		}
	}
}
