import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );

		// draw ten more boxes -- different colors, different places
		drawBox( window, Color.BLACK, 100, 200 );
		drawBox( window, Color.BLUE, 300, 400 );
		drawBox( window, Color.CYAN, 400, 500 );
		drawBox( window, Color.DARK_GRAY, 200, 300 );
		drawBox( window, Color.GRAY, 90, 100 );
		drawBox( window, Color.GREEN, 70, 80 );
		drawBox( window, Color.LIGHT_GRAY, 50, 60 );
		drawBox( window, Color.MAGENTA, 30, 40 );
		drawBox( window, Color.ORANGE, 10, 20 );
		drawBox( window, Color.PINK, 0, 0 );
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
