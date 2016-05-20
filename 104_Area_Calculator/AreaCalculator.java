import java.util.Scanner;

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner k = new Scanner(System.in);
		
		int choice;
		
		System.out.println( "Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc." );
		System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
		
		do
		{
			System.out.println( "1) Triangle" );
			System.out.println( "2) Rectangle" );
			System.out.println( "3) Square" );
			System.out.println( "4) Circle" );
			System.out.println( "5) Quit" );
			System.out.print( "Which shape: " );
			choice = k.nextInt();
			if ( choice == 1 )
			{
				System.out.print( "\nBase: " );
				int base = k.nextInt();
				System.out.print( "Height: " );
				int height = k.nextInt();
				System.out.println( "The area is " + area_triangle(base, height) + "." );
			}
				else if ( choice == 2 )
			{
				System.out.print( "\nLength: " );
				int length = k.nextInt();
				System.out.print( "Width: " );
				int width = k.nextInt();
				System.out.println( "The area is " + area_rectangle(length, width) + "." );
			}
				else if ( choice == 3 )
			{
				System.out.print( "\nSide: " );
				int side = k.nextInt();
				System.out.println( "The area is " + area_square(side) + "." );
			}
			else if ( choice == 4 )
			{
				System.out.print( "\nRadius: " );
				int rad = k.nextInt();
				System.out.println( "The area is " + area_circle(rad) + "." );
			}
			else if ( choice == 5 ){}
			
			else
			{
				System.out.println( "\nError." );
			}
			
			System.out.println( "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
					
		} while ( choice != 5 );
		
		System.out.println( "GoodBye" );
	}
 
	public static double area_circle( int radius ) // returns the area of a circle
	{
		double area;
		area = Math.pow((Math.PI * radius), 2);
		return area;
		
	}
	
	public static int area_rectangle( int length, int width ) // returns the area of a rectangle
	{
		int area;
		area = length * width;
		return area;
	}
	
	public static int area_square( int side ) // returns the area of a square
	{
		int area;
		area = side * side;
		return area;
	}
	
	public static double area_triangle( int base, int height ) // returns the area of a triangle
	{
		double area;
		area = (base * height) / 2;
		return area;
	}
}
