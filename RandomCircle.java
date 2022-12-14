import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.util.Random;

//<applet code = "RandomCircle.java" height = "900" width = "900"></applet>

public class RandomCircle extends Applet implements MouseListener
{
	int a,d;

	public void init()
	{
		this.addMouseListener(this);
	}
		
	public void update(Graphics gr)
	{	
		Random rand = new Random();
		int r = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		int i = rand.nextInt(300)+10;
		Color c = new Color(r,g,b);
		gr.setColor(c);
		gr.fillOval(a,d,i,i);
	}


	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me)
	{
		a = me.getX();
		d = me.getY();
		repaint();
	}
	
	
}