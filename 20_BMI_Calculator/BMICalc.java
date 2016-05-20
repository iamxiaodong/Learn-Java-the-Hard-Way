import java.util.Scanner;

public class BMICalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double BMI, height, weight;

		System.out.print( "Your height in m: " );
		height = keyboard.nextDouble();

		System.out.print( "Your weight in kg: " );
		weight = keyboard.nextDouble();
		
		System.out.println( " " );
		
		BMI = weight / (height * height) ;

		System.out.print( "Your BMI is " + BMI);
	}
}
