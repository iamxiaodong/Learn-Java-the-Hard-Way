public class FindingTheLargestValueInAnArray
{
	public static void main( String[] args )
	{
		int[] numbers = new int[10];
		int max_num = 0;
		
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 100);
			System.out.print( numbers[i] + " " );
		}
		
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( max_num < numbers[i] )
				max_num = numbers[i];
		}
		System.out.println( "\n\nThe largest value is " + max_num );	
	}
}
