import java.util.*;

public class BabyNim {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        
        String choice;
        int removal;       
        
        while(pileA > 0 || pileB > 0 || pileC > 0) 
        {
            System.out.print("A: " + pileA+ "     B: " + pileB + "     C: " + pileC);
            
            System.out.print("\nChoose a pile: ");
            choice = keyboard.next();
            
            System.out.print("How many to remove from pile " + choice + ": ");            
            removal = keyboard.nextInt();
            
            System.out.println(" ");

            if (choice.equals("A")) 
            {
                pileA = pileA - removal;
            } 
            else if (choice.equals("B")) 
            {
                pileB = pileB - removal;
            } 
            else if (choice.equals("C")) 
            {
                pileC = pileC - removal;
            }
            if(pileA<=0 && pileB <= 0 && pileC <= 0) 
            {
                System.out.print("All piles are empty. Good job!");
            }
        }
    }
}
