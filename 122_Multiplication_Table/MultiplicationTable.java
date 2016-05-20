public class MultiplicationTable
{
	public static void main( String[] args )
	{
		System.out.println( "x | 1\t2\t3\t4\t5\t6\t7\t8\t9\n==+==================================================================" );
		for ( int n=1; n <= 12; n++ )
		{
			System.out.print(n + " | ");
			for ( int i= 1; i <= 9; i++ )
			{
				System.out.print( (n * i) + "\t" );
			}
			System.out.println();
		}
	}
}
