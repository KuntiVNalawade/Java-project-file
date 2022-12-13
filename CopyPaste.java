import java.awt.*;
import java.awt.event.*;

class CopyPaste extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Button btn1;

	public CopyPaste()
	{
		setLayout(null);
		tf1 = new TextField();
		tf2 = new TextField();
		btn1 = new Button("Copy");

		tf1.setBounds(100,100,100,30);
		tf2.setBounds(100,200,100,30);
		btn1.setBounds(110,150,80,30);
	
		add(tf1); add(tf2); add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ref)
	{
		String s = tf1.getText();
		tf2.setText(s);
	}

	public static void main(String ar[])
	{
		CopyPaste cp = new CopyPaste();
		cp.setVisible(true);
		cp.setTitle("Copy Paste");
		cp.setSize(400,500);
	}
}