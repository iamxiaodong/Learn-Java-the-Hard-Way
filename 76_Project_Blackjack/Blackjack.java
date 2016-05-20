import java.util.Random;
import java.util.Scanner;

public class Blackjack{
	public static void main(String[] args){
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int temp1, temp2, temp3, temp4, value1, value2, total_p, total_d;;
		String hit, card1, card2, card4;
		//pick cards
		temp1 = r.nextInt(52);
		do {								//barely prevent picking the same card
			temp2 = r.nextInt(52);
		} while (temp1 == temp2);
		//52 to card value
		card1 ="";
		card2 = "";
		
		if (temp1% 4 == 0)
			card1 = "club ";
		else if (temp1% 4 == 1)
			card1 = "diamond ";
		else if (temp1% 4 == 2)
			card1 = "heart ";
		else if (temp1% 4 == 3)
			card1 = "spade ";
		if (temp2% 4 == 0)
			card2 = "club ";
		else if (temp2% 4 == 1)
			card2 = "diamond ";
		else if (temp2% 4 == 2)
			card2 = "heart ";
		else if (temp2% 4 == 3)
			card2 = "spade ";
		//value1 = (temp1-1-(temp1%4))/4;
		value1 = (temp1+5-(temp1%4))/4;
		value2 = (temp2+5-(temp2%4))/4;
		if (value1 > 1 && value1< 11)
			card1 = card1 + value1;
		if (value1 == 1)
			card1 = card1 + "Ace";			//wanted to change value to 11 if another card is 10+, but no function so I don't want to make the code too long.
		if (value1 == 11){
			card1 = card1 + "Jack";
			value1 =10;
		}
		if (value1 == 12){
			card1 = card1 + "Queen";
			value1 =10;	
		}
		if (value1 == 13){
			card1 = card1 + "King";	
			value1 =10;	
		}
		
		// card2
		if (value2 > 1 && value2< 11)
			card2 = card2 + value2;
		if (value2 == 1)
			card2 = card2 + "Ace";
		if (value2 == 11){
			card2 = card2 + "Jack";
			value2 =10;
		}
		if (value2 == 12){
			card1 = card1 + "Queen";
			value2 =10;	
		}
		if (value2 == 13){
			card2 = card1 + "King";	
			value2 =10;	
		}
		
		System.out.println(value1+","+value2);
		System.out.println("You get a " + card1 + " and a " + card2 + ".");
		total_p = value1 + value2;
		System.out.println("Your total is " + total_p);
		System.out.println("");
		
		//reuse value1,card1 for dealer's first card
		temp1 = r.nextInt(52);
		if (temp1% 4 == 0)
			card1 = "club ";
		else if (temp1% 4 == 1)
			card1 = "diamond ";
		else if (temp1% 4 == 2)
			card1 = "heart ";
		else if (temp1% 4 == 3)
			card1 = "spade ";
		value1 = (temp1+5-(temp1%4))/4;
		//dealer card1
		if (value1 > 1 && value1< 11)
			card1 = card1 + value1;
		if (value1 == 1)
			card1 = card1 + "Ace";
		if (value1 == 11){
			card1 = card1 + "Jack";
			value1 =10;
		}
		if (value1 == 12){
			card1 = card1 + "Queen";
			value1 =10;	
		}
		if (value1 == 13){
			card1 = card1 + "King";	
			value1 =10;	
		}
		//
		System.out.println("The dealer has a " + card1 + " showing, and a hidden card.");
		total_d = value1;
		System.out.println("His total is hidden, too.");
		System.out.println("");
		System.out.print("Would you like to \"hit\" or \"stay\"? ");
		hit = keyboard.next();
		while (hit.equals("hit") && total_p < 21){
			temp1 = r.nextInt(52);
			
			if (temp1% 4 == 0)
				card1 = "club ";
			else if (temp1% 4 == 1)
				card1 = "diamond ";
			else if (temp1% 4 == 2)
				card1 = "heart ";
			else if (temp1% 4 == 3)
				card1 = "spade ";
			value1 = (temp1+5-(temp1%4))/4;
			if (value1 > 1 && value1< 11)
				card1 = card1 + value1;
			if (value1 == 1)
				card1 = card1 + "Ace";
			if (value1 == 11){
				card1 = card1 + "Jack";
				value1 =10;
			}
			if (value1 == 12){
				card1 = card1 + "Queen";
				value1 =10;	
			}
			if (value1 == 13){
				card1 = card1 + "King";	
				value1 =10;	
			}
			total_p += value1;
			System.out.println("You drew a " + card1 + ".");
			System.out.println("Your total is " + total_p + ".");
			System.out.println("");
			if (total_p < 21){
				System.out.print("Would you like to \"hit\" or \"stay\"? ");
			hit = keyboard.next();
			System.out.println("");
			}	
		}
		if (total_p <= 21){
			temp1 = r.nextInt(52);
			if (temp1% 4 == 0)
				card1 = "club ";
			else if (temp1% 4 == 1)
				card1 = "diamond ";
			else if (temp1% 4 == 2)
				card1 = "heart ";
			else if (temp1% 4 == 3)
				card1 = "spade ";
			value1 = (temp1+5-(temp1%4))/4;
			if (value1 > 1 && value1< 11)
				card1 = card1 + value1;
			if (value1 == 1)
				card1 = card1 + "Ace ";
			if (value1 == 11){
				card1 = card1 + "Jack ";
				value1 =10;
			}
			if (value1 == 12){
				card1 = card1 + "Queen";
				value1 =10;	
			}
			if (value1 == 13){
				card1 = card1 + "King ";	
				value1 =10;	
			}			
			total_d += value1;
			System.out.println("Okay, dealer's turn.");
			System.out.println("His hidden card was a "+ card1 +".");
			System.out.println("His total was "+total_d+".");
			System.out.println("");
			while (total_d <= 16){
				System.out.println("");
				System.out.println("Dealer chooses to hit.");
				
				temp1 = r.nextInt(52);
				if (temp1% 4 == 0)
					card1 = "club ";
				else if (temp1% 4 == 1)
					card1 = "diamond ";
				else if (temp1% 4 == 2)
					card1 = "heart ";
				else if (temp1% 4 == 3)
					card1 = "spade ";
				value1 = (temp1+5-(temp1%4))/4;
				if (value1 == 1)
					card1 = card1 + "Ace";
				if (value1 > 1 && value1< 11)
					card1 = card1 + value1;
				if (value1 == 11){
					card1 = card1 + "Jack";
					value1 =10;
				}
				if (value1 == 12){
					card1 = card1 + "Queen";
					value1 =10;	
				}
				if (value1 == 13){
					card1 = card1 + "King";	
					value1 =10;	
				}
				total_d += value1;
				System.out.println("He draws a " + card1 + ".");
				System.out.println("His total is " + total_d + ".");
				System.out.println("");
			}
			if (total_d > 21){
				System.out.println("DEALER BUSTED! YOU WIN");
			}
			else if (total_d > total_p){
				System.out.println("YOU LOSE!");
			}
			else if (total_p > total_d){
				System.out.println("YOU WIN!");
			}
			else if (total_p == total_d){
				System.out.println("TIE BUT DEALER WINS!");
			}
		
		}
		else System.out.println("BUSTED!");
	}
}
