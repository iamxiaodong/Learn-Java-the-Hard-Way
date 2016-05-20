import java.awt.*;
import javax.swing.JFrame;

public class ex2 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		// In the call to the function g.drawRect(), there are four numbers. What do they mean? Try changing them to figure it out.
		g.drawRect(10,20,30,40);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);

	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("ex2");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex2 canvas = new ex2();
		win.add( canvas );
		win.setVisible(true);
	}
}
