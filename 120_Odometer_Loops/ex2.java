public class ex2
{
	public static void main( String[] args ) throws Exception
	{
		for ( int thous=0; thous<8; thous++ )
		{
			for ( int hund=0; hund<8; hund++ )
			{
				for ( int tens=0; tens<8; tens++ )
				{
					for ( int ones=0; ones<8; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(10);
					}
				}
			}
		}

		System.out.println();
	}
}
