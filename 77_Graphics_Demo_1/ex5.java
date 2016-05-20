import java.awt.*;
import javax.swing.JFrame;

public class ex5 extends Canvas
{
	public void paint( Graphics g )
	{
	//What happens when two objects overlap? Which one is drawn on top?
	// When objects overlap the code takes precedence. The objects which are defined first are overlapped by the objects which are defined later.
		/*g.setColor(Color.green);
		g.fillRect(50,20,100,200);  // draw a rectangle
		
		g.setColor(Color.red);
		g.fillOval(100,200,50,50); // draw a filled-in oval
		*/
		
		g.setColor(Color.red);
		g.fillOval(200,400,100,100); // draw a filled-in oval
		
		g.setColor(Color.green);
		g.fillRect(100,40,200,400);  // draw a rectangle
		
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("ex5");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex5 canvas = new ex5();
		win.add( canvas );
		win.setVisible(true);
	}
}
