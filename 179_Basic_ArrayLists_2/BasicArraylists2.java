import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists2
  {
        public static void main(String[] args)
        {

          ArrayList<Integer> list = new ArrayList<Integer>();
          
          for (int i = 0; i < 10; i++ )
            list.add(randomnumbers());
            System.out.println("Array List: " + list);
            
        }

        static int randomnumbers()
        {
             int num;
             Random r = new Random();
             num = r.nextInt(100) + 1 ;
             return num;
        }
}
