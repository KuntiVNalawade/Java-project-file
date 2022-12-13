import java.awt.*;
import java.awt.event.*;

class DialogEx extends Frame implements ActionListener,WindowListener
{
	Button btn1,btn2;
	Dialog bx1;

	public DialogEx()
	{
		setLayout(null);
		Label l1 = new Label("This is Frame");
		Label l2 = new Label("This is Dialogbox");
		btn1 = new Button("Show DialogBox");
		btn2 = new Button("Ok");
		bx1 = new Dialog(this);
	
		bx1.add(l2);
		bx1.add(btn2);
		bx1.setLayout(null);
		bx1.setSize(300,300);

		l1.setBounds(150,100,300,70);
		l1.setFont(new Font("TimesRoman",Font.BOLD,20));
		l2.setBounds(100,100,100,30);
		btn1.setBounds(100,200,200,50);
		btn1.setFont(new Font("TimesRoman",Font.BOLD,20));
		btn2.setBounds(100,150,100,30);

		add(l1); add(btn1);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		this.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();

		if(ob.equals(btn1))
		{
			bx1.show();
		}
		else if(ob.equals(btn2))
		{
			bx1.dispose();
		}
	}

	public void windowActivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}

	public void windowClosing(WindowEvent we)
	{
		this.dispose();
	}

	public static void main(String ar[])
	{
		DialogEx dx = new DialogEx();
		dx.setVisible(true);
		dx.setSize(500,500);
		dx.setTitle("Dialogbox Example");
	}
}
	