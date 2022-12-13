import java.awt.*;
import java.awt.event.*;

class CopyPaste2 extends Frame implements TextListener
{
	TextField tf1,tf2;

	public CopyPaste2()
	{
		setLayout(null);
		tf1 = new TextField();
		tf2 = new TextField();
	
		tf1.setBounds(100,100,150,30);
		tf2.setBounds(100,200,150,30);
		tf2.setEditable(false);
		
		add(tf1); add(tf2);
		tf1.addTextListener(this);
	}

	public void textValueChanged(TextEvent te)
	{
		tf2.setText(tf1.getText());
	}

	public static void main(String ar[])
	{
		CopyPaste2 cp = new CopyPaste2();
		cp.setVisible(true);
		cp.setTitle("Copy Paste");
		cp.setSize(800,600);
	}
}