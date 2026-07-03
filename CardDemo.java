import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardDemo extends JFrame implements ActionListener
{
	CardLayout cd;
	JButton b1,b2,b3;
	Container c;
	CardDemo()
	{
		c=getContentPane();
		cd=new CardLayout(40,30);
		c.setLayout(cd);
		b1=new JButton("Apple");
		b2=new JButton("Boy");
		b3=new JButton("cat");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		cd.next(c);
	}
	

	public static void main(String[] args)
	{
		CardDemo c=new CardDemo();
	}
}