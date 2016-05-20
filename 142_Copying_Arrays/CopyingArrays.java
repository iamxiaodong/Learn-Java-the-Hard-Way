public class CopyingArrays
{
	public static void main( String[] args )
	{
		// create an array of 10 ints
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i;
		
		// fill array 1 with random numbers
		for ( i = 0; i < arr1.length; i++ )
		{
			arr1[i] = 1 + (int)(Math.random() * 100);
		}
		
		// copy array 2 with values from array 1
		for ( i = 0; i < arr2.length; i++ )
		{
			arr2[i] = arr1[i];
		}
		
		// change the last value of array 1 to -7
		arr1[(arr1.length - 1)] = -7;
		
		// print array 1
		System.out.print( "Array 1: " );
		for ( i = 0; i < arr1.length; i++ )
		{
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
		
		// print array 2
		System.out.print( "Array 2: " );
		for ( i = 0; i < arr2.length; i++ )
		{
			System.out.print( arr2[i] + " " );
		}
		System.out.println();
	}
}
