import javax.swing.JFrame;
import java.awt.*;

public class GraphPaper extends JFrame
{
	private static Graphics gBuf = null;
	private static GraphPaperCanvas canvas = null;
	private static Image vm = null;
	private int x, y;
	private int w, h;
	
	public GraphPaper( int x, int y )
	{
		if ( canvas == null )
		{
			setTitle("GraphPaper");
			setSize(1100,950);
			setLocation(20,50);

			canvas = new GraphPaperCanvas(null);
			getContentPane().add(canvas);
			setVisible(true);

			vm = canvas.createImage(1100,950);
			gBuf = vm.getGraphics();
			canvas.setVm(vm);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		this.x = x;
		this.y = y;
		w = 300;
		h = 300;
		
		drawBounds();
		gBuf.setColor( Color.BLUE );
	}
	
	public void drawBounds()
	{
		Color cur = gBuf.getColor();
		gBuf.setColor( Color.LIGHT_GRAY );
		for ( int d=0; d<w; d+=w/20 )
			gBuf.drawLine( x+d, y+0, x+d, y+h );
		for ( int d=0; d<h; d+=h/20 )
			gBuf.drawLine( x+0, y+d, x+h, y+d );

		gBuf.setColor( Color.BLACK );
		gBuf.drawRect( x, y, w+1, h+1 );
		gBuf.drawLine( x+w/2, y+0, x+w/2, y+h );
		gBuf.drawLine( x+0, y+h/2, x+w, y+h/2 );
		gBuf.setColor( cur );
		canvas.repaint();
	}	
	public void setColor( Color c )
	{
		gBuf.setColor(c);
	}
	
	public void drawPoint( double px, double py )
	{
		if ( px > 10 || px < -10 || py > 10 || py < -10 )
			return;

		px *= w/20;
		py *= h/20;
		px += w/2 + 1;
		py = h/2 - py + 1;

		gBuf.drawLine( x+(int)px, y+(int)py, x+(int)px, y+(int)py );
		canvas.repaint();
	}
}

class GraphPaperCanvas extends Canvas
{
	private Image vm;
	
	public GraphPaperCanvas( Image vm )
	{
		this.vm = vm;
		setBackground( Color.white );
	}
	
	public void setVm( Image vm )
	{
		this.vm = vm;
	}
	
	public void paint( Graphics g )
	{
		g.drawImage(vm,0,0,this);
	}
	
	public void update(Graphics g) { paint(g); }	// don't clear screen on repaint

}
