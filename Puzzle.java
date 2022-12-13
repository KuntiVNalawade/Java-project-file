import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Puzzle extends Frame implements ActionListener
{
	Button l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	public Puzzle()
	{
		setLayout(new GridLayout(3,3));
		Random rand = new Random();
		int[] ar = new int[8];
		int a,i=7,temp;

		while(i>=0)
		{
			ar[i]=(i+1);
			i--;
		}
		i=5;
		
		while(i<8)
		{
			a=rand.nextInt(7)+1;
			temp=ar[i];
			ar[i]=ar[a];
			ar[a]=temp;
			a++;
			i++;
		}

		l1 = new Button(""+(ar[0]));
		l2 = new Button(""+(ar[1]));
		l3 = new Button(""+(ar[2]));
		l4 = new Button(""+(ar[3]));
		l5 = new Button(""+(ar[4]));
		l6 = new Button(""+(ar[5]));
		l7 = new Button(""+(ar[6]));
		l8 = new Button(""+(ar[7]));
		l9 = new Button(null);

		add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); add(l7); add(l8); add(l9);

		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
		l4.addActionListener(this);
		l5.addActionListener(this);
		l6.addActionListener(this);
		l7.addActionListener(this);
		l8.addActionListener(this);
		l9.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{	
		Object ob = ae.getSource();

		if(ob.equals(l1) && l1.getLabel()!=null)
		{
			if(l2.getLabel()==null)
			{	
				String s = l1.getLabel();
				l2.setLabel(s);
				l1.setLabel(null);
			}
			else if(l4.getLabel()==null)
			{	
				String s = l1.getLabel();
				l4.setLabel(s);
				l1.setLabel(null);
			}
		}

		else if(ob.equals(l2) && l2.getLabel()!=null)
		{
			if(l1.getLabel()==null)
			{	
				String s = l2.getLabel();
				l1.setLabel(s);
				l2.setLabel(null);
			}
			else if(l3.getLabel()==null)
			{	
				String s = l2.getLabel();
				l3.setLabel(s);
				l2.setLabel(null);
			}
			else if(l5.getLabel()==null)
			{	
				String s = l2.getLabel();
				l5.setLabel(s);
				l2.setLabel(null);
			}
		}

		else if(ob.equals(l3) && l3.getLabel()!=null)
		{
			if(l2.getLabel()==null)
			{	
				String s = l3.getLabel();
				l2.setLabel(s);
				l3.setLabel(null);
			}
			else if(l6.getLabel()==null)
			{	
				String s = l3.getLabel();
				l6.setLabel(s);
				l3.setLabel(null);
			}
		}

		else if(ob.equals(l4) && l4.getLabel()!=null)
		{
			if(l1.getLabel()==null)
			{	
				String s = l4.getLabel();
				l1.setLabel(s);
				l4.setLabel(null);
			}
			else if(l5.getLabel()==null)
			{	
				String s = l4.getLabel();
				l5.setLabel(s);
				l4.setLabel(null);
			}
			else if(l7.getLabel()==null)
			{	
				String s = l4.getLabel();
				l7.setLabel(s);
				l4.setLabel(null);
			}
		}

		else if(ob.equals(l5) && l5.getLabel()!=null)
		{
			if(l2.getLabel()==null)
			{	
				String s = l5.getLabel();
				l2.setLabel(s);
				l5.setLabel(null);
			}
			else if(l4.getLabel()==null)
			{	
				String s = l5.getLabel();
				l4.setLabel(s);
				l5.setLabel(null);
			}
			else if(l6.getLabel()==null)
			{	
				String s = l5.getLabel();
				l6.setLabel(s);
				l5.setLabel(null);
			}
			else if(l8.getLabel()==null)
			{	
				String s = l5.getLabel();
				l8.setLabel(s);
				l5.setLabel(null);
			}
		}

		else if(ob.equals(l6) && l6.getLabel()!=null)
		{
			if(l3.getLabel()==null)
			{	
				String s = l6.getLabel();
				l3.setLabel(s);
				l6.setLabel(null);
			}
			else if(l5.getLabel()==null)
			{	
				String s = l6.getLabel();
				l5.setLabel(s);
				l6.setLabel(null);
			}
			else if(l9.getLabel()==null)
			{	
				String s = l6.getLabel();
				l9.setLabel(s);
				l6.setLabel(null);
			}
		}

		else if(ob.equals(l7) && l7.getLabel()!=null)
		{
			if(l4.getLabel()==null)
			{	
				String s = l7.getLabel();
				l4.setLabel(s);
				l7.setLabel(null);
			}
			else if(l8.getLabel()==null)
			{	
				String s = l7.getLabel();
				l8.setLabel(s);
				l7.setLabel(null);
			}
		}
	
		else if(ob.equals(l8) && l8.getLabel()!=null)
		{
			if(l9.getLabel()==null)
			{	
				String s = l8.getLabel();
				l9.setLabel(s);
				l8.setLabel(null);
			}
			else if(l5.getLabel()==null)
			{	
				String s = l8.getLabel();
				l5.setLabel(s);
				l8.setLabel(null);
			}
			else if(l7.getLabel()==null)
			{	
				String s = l8.getLabel();
				l7.setLabel(s);
				l8.setLabel(null);
			}
		}

		else if(ob.equals(l9) && l9.getLabel()!=null)
		{
			System.out.println("Test");
			if(l6.getLabel()==null)
			{	
				String s = l9.getLabel();
				l6.setLabel(s);
				l9.setLabel(null);
			}
			else if(l8.getLabel()==null)
			{	
				String s = l9.getLabel();
				l8.setLabel(s);
				l9.setLabel(null);
			}
			else
			{
				System.out.println(l1.getLabel());
				System.out.println(l2.getLabel());
				System.out.println(l3.getLabel());
				System.out.println(l4.getLabel());
				System.out.println(l5.getLabel());
				System.out.println(l6.getLabel());
				System.out.println(l7.getLabel());
				System.out.println(l8.getLabel());
				System.out.println(l9.getLabel());
			}
			if(l1.getLabel()=="1" && l2.getLabel()=="2" && l3.getLabel()=="3" && l4.getLabel()=="4" && l5.getLabel()=="5" && l6.getLabel()=="6" && l7.getLabel()=="7" && l8.getLabel()=="8")
			{
				l9.setLabel("You Win!!!");
			}
		}
		
			
	}

	public static void main(String arr[])
	{
		Puzzle p = new Puzzle();
		p.setVisible(true);
		p.setTitle("Puzzle Game");
		p.setSize(600,600);

		Font f1 = new Font("TimesRoman",Font.BOLD | Font.ITALIC,20);
		p.setFont(f1);
	}
}