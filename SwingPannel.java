import java.awt.*;
import javax.swing.*;
class SwingPannel extends JFrame
{
	SwingPannel()
	{
		JFrame f= new JFrame("Panel");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,50,500,450);
		p1.setBackground(Color.gray);
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		b1.setBounds(40,60,100,30);
		b2.setBounds(40,100,100,30);
		p1.add(b1);
		
		f.add(p1);
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,50,500,450);
		p2.setBackground(Color.white);
		p2.add(b2);	
		f.add(p2);
		JTabbedPane tp=new JTabbedPane();
		tp.add(p1,"First");
		tp.add(p2,"Second");
		tp.setBounds(0,0,500,450);
		f.add(tp);		
	}
	public static void main(String[] args)
	{
		new SwingPannel();
	}
}