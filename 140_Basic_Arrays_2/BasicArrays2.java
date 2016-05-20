public class BasicArrays2
{
	public static void main( String[] args )
	{
		int[] basic_arr = new int[10];
		
		for ( int i = 0; i < basic_arr.length; i++ )
		{
			basic_arr[i] = 1 + (int)(Math.random() * 100);
			System.out.println( "Slot " + i + " contains " + basic_arr[i] );
		}
	}
}
