public class BasicArrays1
{
	public static void main( String[] args )
	{
		int[] basic_arr = new int[10];
		
		for ( int i = 0; i < basic_arr.length; i++ )
		{
			basic_arr[i] = -113;
			System.out.println( "Slot " + i + " contains " + basic_arr[i] );
		}
	}
}
