import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double BMI, height, weight;
		String category = "";

		System.out.print( "Your height in m: " );
		height = keyboard.nextDouble();

		System.out.print( "Your weight in kg: " );
		weight = keyboard.nextDouble();
		
		System.out.println( " " );
		
		BMI = weight / (height * height) ;

		System.out.print( "Your BMI is " + BMI);
		System.out.println( " " );
		
		if (BMI < 18.5)
		{
		    category = "underweight";
		}
		if (BMI > 18.5 && BMI < 24.9)
		{
		    category = "normal weight";
		}
		if (BMI > 25.0 && BMI < 29.9)
		{
		    category = "overweight";
		}
		if (BMI >= 30.0)
		{
		    category = "obese";
		}
		
		System.out.print( "BMI Category: " + category);
	}
}

