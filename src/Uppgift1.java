import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Uppgift1 extends Applet
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Override
	public void paint(Graphics g)
	{
		// g.drawLine(0, 0, 0, 100);
		// g.drawLine(0, 50, 0, 100);
		// g.fillRect(110, 25, 75, 150);
		// g.draw3DRect(10, 120, 60, 50, true);
		g.drawString("övning 2, en bil", 10, 15);
		g.setColor(Color.YELLOW);
		g.fillOval(150, 0, 50, 50);
		g.setColor(Color.black);
		g.fillRoundRect(10, 120, 50, 50, 50, 50);
		g.fillRoundRect(80, 120, 50, 50, 50, 50);
		g.setColor(Color.blue);
		g.fillRect(10, 100, 150, 50);
		g.setColor(Color.red);
		g.fillRect(50, 50, 50, 50);
		g.setColor(new Color(0));
		g.drawRect(52, 51, 48, 48);

	}

	@Override
	public void init()
	{
		super.init();
		setBackground(Color.GREEN);
	}

}
