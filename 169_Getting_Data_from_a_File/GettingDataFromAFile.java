import java.io.File;
import java.util.Scanner;

class Dog
{
	String breed;
	int age;
	double weight;
}

public class GettingDataFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		Dog[] dog_db = new Dog[2];
		String usrFile;
		Scanner kb = new Scanner(System.in);
		int i = 0;
		
		System.out.print( "Which file to open: " );
		usrFile = kb.next();
		
		File dogFile = new File(usrFile);
		Scanner readFile = new Scanner(dogFile);
		
		System.out.println( "Reading data from " + usrFile + "\n" );
		
		while ( readFile.hasNext() )
		{
			dog_db[i] = new Dog();
			String line = readFile.nextLine();
			String[] dog_details = line.split(",");
			
			dog_db[i].breed = dog_details[0];
			dog_db[i].age = Integer.parseInt(dog_details[1]);
			dog_db[i].weight = Double.parseDouble(dog_details[2]);
			i++;
		}
		readFile.close();
		
		System.out.println( "First dog: " + dog_db[0].breed + ", " + dog_db[0].age + ", " + dog_db[0].weight );
		System.out.println( "Second dog: " + dog_db[1].breed + ", " + dog_db[1].age + ", " + dog_db[1].weight );
	}
}
