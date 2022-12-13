import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class Users
{
	String id,pass;

	void setId()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id :- ");
		id = sc.nextLine();
	}

	void setPass()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password :- ");
		pass = sc.nextLine();
		System.out.println();
	}

	String getId()
	{
		return id;
	}

	String getPass()
	{
		return pass;
	}
		
}

class LoginFormEx extends Frame implements ActionListener
{
	public Users u[];
	TextField tf1,tf2;
	Label l1;
	Button btn1,btn2;

	public LoginFormEx()
	{

		

		setLayout(null);
		u = new Users[2];
		tf1  = new TextField();
		tf2  = new TextField();
		l1 = new Label();
		btn1 = new Button("Login");
		btn2 = new Button("Reset");
	
		System.out.println("Accepting Id and Passwords");
		for(int j=0; j<2; j++)
		{
			u[j] = new Users();
			u[j].setId();
			u[j].setPass();
		}

		tf2.setEchoChar('*');
		tf1.setBounds(100,100,100,30);
		tf2.setBounds(100,200,100,30);
		l1.setBounds(100,300,100,30);
		btn1.setBounds(100,400,100,30);
		btn2.setBounds(100,500,100,30);
		

		add(tf1); add(tf2); add(l1); add(btn1); add(btn2);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		
		Object ob = ae.getSource();
		int flag=1;
		
		if(ob.equals(btn1))
		{
			String i = tf1.getText();
			String p = tf2.getText();

			for(int k=0; k<2; k++)
			{
				String id1 = u[k].getId();
				String pass1 = u[k].getPass();
				if(id1.equals(i) && pass1.equals(p))
				{
					flag=2;
					l1.setText("Login Successfull");
					break;
				}
			}
			if(flag==1)
			{
				l1.setText("Login Failed");
			}
			
		}
		else if(ob.equals(btn2))	
		{
			tf1.setText(null);
			tf2.setText(null);
			l1.setText(null);
		}
	}
	


	public static void main(String ar[])
	{
	
		LoginFormEx lx1 = new LoginFormEx();
		lx1.setVisible(true);
		lx1.setSize(800,800);
	}
}
				
				



















