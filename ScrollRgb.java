import java.awt.*;
import java.awt.event.*;

class ScrollRgb extends Frame implements ActionListener
{
	Button btn1,btn2;
	Scrollbar sc1,sc2,sc3;
	
	public ScrollRgb()
	{
		setLayout(null);
		btn1 = new Button();
		btn2 = new Button("Check");
		sc1 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		sc2 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		sc3 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		
		btn1.setBounds(200,100,70,30);
		btn2.setBounds(200,500,70,30);
		sc1.setBounds(100,200,256,30);
		sc2.setBounds(100,300,256,30);
		sc3.setBounds(100,400,256,30);

		sc1.setBackground(Color.BLACK);
		sc2.setBackground(Color.BLACK);
		sc3.setBackground(Color.BLACK);	

		add(btn1); add(btn2); add(sc1); add(sc2); add(sc3);
 	
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int r = sc1.getValue();
		int g = sc2.getValue();
		int b = sc3.getValue();
	
		Color c1 = new Color(r,g,b);
		btn1.setBackground(c1);
	}

	public static void main(String ar[])
	{
		ScrollRgb sr = new ScrollRgb();
		sr.setVisible(true);
		sr.setTitle("Color Change");
		sr.setSize(800,600);
	}
}




