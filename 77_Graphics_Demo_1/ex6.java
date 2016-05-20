import java.awt.*;
import javax.swing.JFrame;

public class ex6 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,200);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
		
		g.setColor(Color.black);
		// What are the two numbers in the call to drawString()?
		// The drawString() method, shown below, takes as parameters an instance of the String class containing the text to be drawn, and two integer values specifying the coordinates where the text should start.
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
		
		// Add a red, filled-in square somewhere in the lower-right of the canvas.
		g.setColor(Color.red);
		g.fillRect(500,500,50,50);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("ex6");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex6 canvas = new ex6();
		win.add( canvas );
		win.setVisible(true);
	}
}
