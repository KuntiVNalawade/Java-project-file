import java.awt.*;
import java.awt.event.*;

class Temp
{
	public static int count = 0;
	public static int count1 = 0;
	public static int count2 = 0;
}

class MsPaintEx extends Frame implements ActionListener, MouseMotionListener, MouseListener, ItemListener
{
	Button b[];
	int x1,x2,y1,y2;
	int a = -1;
	Graphics g;
	Label l1,l2,l3;
	Choice ch1,ch2;

	public MsPaintEx()
	{	
		setLayout(null);
		b = new Button[19];

		for(int i=0; i<19; i++)
		{
			b[i] = new Button(" ");
		}	

		b[9].setLabel("Clear");

		l1 = new Label("--- Pen Colors ---");
		l1.setBounds(700,20,150,50);

		l2 = new Label("--- Background Colors ---");
		l2.setBounds(150,20,250,50);

		l3 = new Label("--- Pen Pattern | Pen Size ---");
		l3.setBounds(1120,20,250,50);

		b[0].setBackground(Color.RED);
		b[1].setBackground(Color.BLUE);
		b[2].setBackground(Color.GREEN);
		b[3].setBackground(Color.YELLOW);
		b[4].setBackground(Color.ORANGE);	
		b[5].setBackground(Color.PINK);	
		b[6].setBackground(Color.CYAN);
		b[7].setBackground(Color.WHITE);
		b[8].setBackground(Color.BLACK);

		b[9].setBounds(1000,70,100,50);

		b[10].setBackground(Color.RED);
		b[11].setBackground(Color.BLUE);
		b[12].setBackground(Color.GREEN);
		b[13].setBackground(Color.YELLOW);
		b[14].setBackground(Color.ORANGE);	
		b[15].setBackground(Color.PINK);	
		b[16].setBackground(Color.CYAN);
		b[17].setBackground(Color.WHITE);
		b[18].setBackground(Color.BLACK);

		int in=1;
		for(int i=10; i<19; i++)
		{
			b[i].setBounds((in*50),70,50,50);
			in++;
		}

		in=11;
		for(int i=0; i<9; i++)
		{
			b[i].setBounds((in*50),70,50,50);
			in++;
		}
	
		this.setFont(new Font("TimesRoman",Font.BOLD,20));


		for(int i=0; i<19; i++)
		{
			add(b[i]);
		}
		add(l1); add(l2); add(l3);

		for(int i=0; i<19; i++)
		{
			b[i].addActionListener(this);
		}

		//Additional Features...
		ch1 = new Choice();
		ch1.add("Normal");
		ch1.add("Pattern1");
		ch1.setBounds(1150,80,100,50);
		add(ch1);
        ch1.addItemListener(this);

		ch2 = new Choice();
		ch2.add("Default");
		ch2.add("6px");
		ch2.add("8px");
		ch2.add("10px");
		ch2.setBounds(1250,80,100,50);
		add(ch2);
        ch2.addItemListener(this);


		this.addMouseMotionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();
		if(ob.equals(b[0]))
		{
			a = 0;
		}
		else if(ob.equals(b[1]))
		{
			a = 1;
		}
		else if(ob.equals(b[2]))
		{
			a = 2;
		}
		else if(ob.equals(b[3]))
		{
			a = 3;
		}
		else if(ob.equals(b[4]))
		{
			a = 4;
		}
		else if(ob.equals(b[5]))
		{
			a = 5;
		}
		else if(ob.equals(b[6]))
		{
			a = 6;
		}
		else if(ob.equals(b[7]))
		{
			a = 7;
		}
		else if(ob.equals(b[8]))
		{
			a = 8;
		}
		else if(ob.equals(b[10]))
		{
			this.setBackground(Color.RED);
			l1.setBackground(Color.RED);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.RED);
			l2.setForeground(Color.WHITE);
		}
		else if(ob.equals(b[11]))
		{
			this.setBackground(Color.BLUE);
			l1.setBackground(Color.BLUE);
			l1.setForeground(Color.BLACK);
			l2.setBackground(Color.BLUE);
			l2.setForeground(Color.BLACK);
		}
		else if(ob.equals(b[12]))
		{
			this.setBackground(Color.GREEN);
			l1.setBackground(Color.GREEN);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.GREEN);
			l2.setForeground(Color.WHITE);
		}
		else if(ob.equals(b[13]))
		{
			this.setBackground(Color.YELLOW);
			l1.setBackground(Color.YELLOW);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.YELLOW);
			l2.setForeground(Color.BLACK);
		}
		else if(ob.equals(b[14]))
		{
			this.setBackground(Color.ORANGE);
			l1.setBackground(Color.ORANGE);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.ORANGE);
			l2.setForeground(Color.WHITE);
		}
		else if(ob.equals(b[15]))
		{
			this.setBackground(Color.PINK);
			l1.setBackground(Color.PINK);
			l1.setForeground(Color.BLACK);
			l2.setBackground(Color.PINK);
			l2.setForeground(Color.BLACK);
		}
		else if(ob.equals(b[16]))
		{
			this.setBackground(Color.CYAN);
			l1.setBackground(Color.CYAN);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.CYAN);
			l2.setForeground(Color.WHITE);
		}
		else if(ob.equals(b[17]))
		{
			this.setBackground(Color.WHITE);
			l1.setBackground(Color.WHITE);
			l1.setForeground(Color.BLACK);
			l2.setBackground(Color.WHITE);
			l2.setForeground(Color.BLACK);
		}
		else if(ob.equals(b[18]))
		{
			this.setBackground(Color.BLACK);
			l1.setBackground(Color.BLACK);
			l1.setForeground(Color.WHITE);
			l2.setBackground(Color.BLACK);
			l2.setForeground(Color.WHITE);
		}
		else if(ob.equals(b[9]))
		{
			repaint();
		}
	}
        
        public void itemStateChanged(ItemEvent e)
        {
            Object ob = e.getSource();

			if(ob.equals(ch1))
			{
				int sel = ch1.getSelectedIndex();
				if(sel==0)
				{
					Temp.count1 = 0;

				}
				else if(sel == 1)
				{
				    Temp.count1 = 1;
				}
			}
			if(ob.equals(ch2))
			{
				int sel = ch2.getSelectedIndex();
				System.out.println("sel2 = "+sel);
				if(sel==0)
				{
					Temp.count2 = 0;
				}
				else if(sel == 1)
				{
				    Temp.count2 = 1;
				}
				else if(sel == 2)
				{
				    Temp.count2 = 2;
				}
				else if(sel == 3)
				{
				    Temp.count2 = 3;
				}
				System.out.println("count2 = "+Temp.count2);
			}
		}

	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}  
	public void mouseReleased(MouseEvent me)
	{}
	public void mousePressed(MouseEvent me)
	{}

	public void mouseMoved(MouseEvent me)
	{

		x1 = me.getX();
		y1 = me.getY();
		x2 = me.getX();
		y2 = me.getY();
		
	}

	public void mouseDragged(MouseEvent me)
	{
		g = getGraphics();	

		Object ob = me.getSource();

		if(Temp.count%2==0)
		{
			x1 = me.getX();
			y1 = me.getY();
		}
		else
		{
			x2 = me.getX();
			y2 = me.getY();
		}
	
		if(a==0)
		{
			g.setColor(Color.RED);
		}
		else if(a==1)
		{
			g.setColor(Color.BLUE);
		}
		else if(a==2)
		{
			g.setColor(Color.GREEN);
		}
		else if(a==3)
		{
			g.setColor(Color.YELLOW);
		}
		else if(a==4)
		{
			g.setColor(Color.ORANGE);
		}
		else if(a==5)
		{
			g.setColor(Color.PINK);
		}
		else if(a==6)
		{
			g.setColor(Color.CYAN);
		}
		else if(a==7)
		{
			g.setColor(Color.WHITE);
		}
		else if(a==8)
		{
			g.setColor(Color.BLACK);
		}

		if(Temp.count1 == 1)
		{
			g.drawLine(x1,y1,x2,y2);
			g.drawLine((x1), (y1), (x2+1/2), (y2+1/2));
			g.drawLine(x1, y1, x2-1/2, y2-1/2);
			g.drawLine((x1+1), (y1), (x2+1), (y2+1));
			g.drawLine((x1), (y1), (x2-1), (y2-1));
			g.drawLine((x1), (y1), (x2+2), (y2+2));
			g.drawLine((x1), (y1), (x2-2), (y2-2));
		}
		else if(Temp.count2 == 1)
		{
			g.fillOval(x1,y1,20,20);
		}
		else if(Temp.count2 == 2)
		{
			g.fillOval(x1,y1,25,25);
		}
		else if(Temp.count2 == 3)
		{
			g.fillOval(x1,y1,30,30);
		}
		else if(Temp.count2 == 0 || Temp.count1 == 0)
		{
			g.drawLine(x1,y1,x2,y2);
		}

		Temp.count++;	
	}



	public static void main(String ar[])
	{
		MsPaintEx mp = new MsPaintEx();
		mp.setVisible(true);
		mp.setSize(2000,1000);
	}
}