import java.util.Random;
import java.util.ArrayList;

public class BasicArraylists3
{
	public static void main( String[] args )
	{
	    printArray(1000);
	}
	
	static void printArray(int size)
	{
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    for (int i = 0; i < size; i++ )
            list.add(randomnumbers());
            System.out.print(list);
	}
	
	static int randomnumbers()
    {
             int num;
             Random r = new Random();
             num = r.nextInt(100) + 1 ;
             return num;
    }
}
