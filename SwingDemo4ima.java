import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingDemo4ima extends JFrame
{
	JLabel l1,l2,l3;
	SwingDemo4ima()
	{
		
		ImageIcon icon= new ImageIcon("company3.jpg");
		l1= new JLabel(icon);
		l1.setBounds(0,0,500,500);
		add(l1);
		l2= new JLabel();
		l2.setBounds(250,150,200,200);
		l1.add(l2);
		l3= new JLabel("User Id ");
		l3.setBounds(250,150,100,50);
		l2.add(l3);
				
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void  main(String[] args)
	{
		SwingDemo4ima ob=new SwingDemo4ima();
	}
}