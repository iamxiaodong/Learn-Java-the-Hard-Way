import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/

public class Boxy1 extends Canvas
{
	public void paint( Graphics window )
	{
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		// draw three more boxes -- different colors, different places
		
		// 1
		window.setColor(Color.DARK_GRAY);
		window.fillRect(300,400,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(310,410,80,80);
		
		// 2
		window.setColor(Color.YELLOW);
		window.fillRect(100,200,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(110,210,80,80);
		
		// 3
		window.setColor(Color.MAGENTA);
		window.fillRect(50,60,100,100);
		window.setColor(Color.WHITE);
		window.fillRect(51,61,80,80);
	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy1();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
