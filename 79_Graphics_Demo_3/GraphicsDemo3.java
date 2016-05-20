import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
	public void paint( Graphics g )
	{
	// When drawing a line, what do the four numbers represent?
	// A line is a graphics primitive that connects two points. In Java, to draw a line between two points (x1, y1) and (x2, y2) onto graphics context represented by a Graphicsobject, use the following method: drawLine(int x1, int y1, int x2, int y2)
		// lines
		g.setColor(Color.green);
		g.drawLine(10,100,400,100);
		g.setColor(Color.blue);
		g.drawLine(50,150,100,180);
		g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);

		g.setColor(Color.black);

		// fonts
		// When setting a custom font, what happens if you provide a font that doesn't exist?
		// http://stackoverflow.com/questions/7461132/java-font-problem
		g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
		g.drawString("Yes, they are.", 400, 200);

		g.setColor(Color.white);
		g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Calibri-BOLDITALIC-60")); // a different way to specify the same font
		g.drawString("Leander Lions", 290, 360);
		
		g.setColor(Color.black);
		g.setFont(new Font(null)); // restore default font

		int x=400, y=490;
		g.drawRect(x,y,150,20);
		g.drawString("Where is the starting point?", x,y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add( canvas );
		win.setVisible(true);
	}
}
