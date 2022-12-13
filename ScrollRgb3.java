import java.awt.*;
import java.awt.event.*;

class ScrollRgb3 extends Frame implements AdjustmentListener, KeyListener
{
	Button btn1,btn2;
	Scrollbar sc1,sc2,sc3;
	TextField tf1,tf2,tf3;
	
	public ScrollRgb3()
	{
		setLayout(null);
		btn1 = new Button();
		btn2 = new Button("Check");
		sc1 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		sc2 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		sc3 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,256);
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		
		btn1.setBounds(200,100,70,30);
		sc1.setBounds(100,200,256,30);
		sc2.setBounds(100,300,256,30);
		sc3.setBounds(100,400,256,30);
		tf1.setBounds(400,200,70,30);
		tf2.setBounds(400,300,70,30);
		tf3.setBounds(400,400,70,30);

		sc1.setBackground(Color.BLACK);
		sc2.setBackground(Color.BLACK);
		sc3.setBackground(Color.BLACK);	

		add(btn1); add(sc1); add(sc2); add(sc3); add(tf1); add(tf2); add(tf3);
 	
		sc1.addAdjustmentListener(this);
		sc2.addAdjustmentListener(this);
		sc3.addAdjustmentListener(this);
		
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		tf3.addKeyListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r = sc1.getValue();
		int g = sc2.getValue();
		int b = sc3.getValue();

		tf1.setText(""+r);
		tf2.setText(""+g);
		tf3.setText(""+b);
	
		Color c1 = new Color(r,g,b);
		btn1.setBackground(c1);
	}

	public void keyPressed(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke)
	{
		Object ob = ke.getSource();
		
		if(ob.equals(tf1))
		{
			try
			{
				int val = Integer.parseInt(tf1.getText());
				sc1.setValue(val);
			}catch(Exception e){}
	
			int r = sc1.getValue();
			int g = sc2.getValue();
			int b = sc3.getValue();
	
			Color c1 = new Color(r,g,b);
			btn1.setBackground(c1);
		}
		else if(ob.equals(tf2))
		{
			try
			{
				int val = Integer.parseInt(tf2.getText());
				sc2.setValue(val);
			}catch(Exception e){}

			int r = sc1.getValue();
			int g = sc2.getValue();
			int b = sc3.getValue();
	
			Color c1 = new Color(r,g,b);
			btn1.setBackground(c1);
		}
		else if(ob.equals(tf3))
		{
			try
			{
				int val = Integer.parseInt(tf3.getText());
				sc3.setValue(val);
			}catch(Exception e){}
	
			int r = sc1.getValue();
			int g = sc2.getValue();
			int b = sc3.getValue();
	
			Color c1 = new Color(r,g,b);
			btn1.setBackground(c1);
		}
	}

	public static void main(String ar[])
	{
		ScrollRgb3 sr = new ScrollRgb3();
		sr.setVisible(true);
		sr.setTitle("Color Change");
		sr.setSize(800,600);
	}
}




