public class BasicArrays3
{
	public static void main( String[] args )
	{
		int[] basic_arr = new int[1000];
		
		for ( int i = 0; i < basic_arr.length; i++ )
		{
			basic_arr[i] = 10 + (int)(Math.random() * 90);
			System.out.print( basic_arr[i] + "  " );
		}
	}
}
