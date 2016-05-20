import java.util.ArrayList;
import java.util.Random;

public class CopyingArraylists
    {
        public static void main(String[] args)
        {
            makeArraylist(10,100);
        }

  static void makeArraylist(int arrayLength, int randomScope)
    {
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> list2 = new ArrayList<Integer>();

      for (int i = 0; i < arrayLength; i++)
        list.add(Rando.classicRando(100));

      for (int i = 0; i < arrayLength; i++)
        list2.add(list.get(i));

        list.set ((arrayLength-1),-7);


        System.out.println("Array 1: " + list );
        System.out.println("Array 2: " + list2 );
    }
}
