import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Fill_Rectangle.java" width="900" height="500"></applet>
*/

class Fill extends Applet implements ActionListener
{
	int r=0,gr=0,b=0;
	Color c1;
	Scrollbar red,green,blue;
	Button btn1;
	
	public void init()	
	{
		setLayout(null);
		c1= new Color(r,gr,b);
/*
		g.setColor(c1);
		g.fillRect(30,40,90,120);

		g.drawString("Hi All",100,100);
*/
		Label l1 = new Label("red");
		red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		btn1 = new Button("Go");
		
		red.setLocation(30,60);
		red.setSize(100,200);
		green.setLocation(30,90);
		blue.setLocation(30,120);
		btn1.setLocation(40,150);

		add(l1);
		add(red);
		add(green);
		add(blue);
		add(btn1);	
	}
	public void actionPerformed(ActionEvent ref)
	{
		
		r=red.getValue();
		gr=green.getValue();
		b=blue.getValue();
	}
}
	