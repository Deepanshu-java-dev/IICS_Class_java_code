import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainPage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	CardLayout cd;
	Container c;
	MainPage()
	{
		l1=new JLabel("SINGH CONSTRUCTOR");
		l1.setFont(new Font("Arial",Font.BOLD,35));
		l1.setBounds(100,5,400,40);
		add(l1);
		ImageIcon icon1=new ImageIcon("logo.jpg");
		l3=new JLabel(icon1);
		l3.setBounds(0,0,60,60);
		add(l3);
		JSeparator sp=new JSeparator(JSeparator.HORIZONTAL);
		sp.setBounds(0,60,1000,10);
		add(sp);
		l4=new JLabel("<html>Deepanshu<br>Logout<html>");
		l4.setBounds(900,5,200,50);
		add(l4);
		l5=new JLabel("About");
		l5.setBounds(450,65,100,20);
		l5.setFont(new Font("Arial",Font.BOLD,25));
		add(l5);
		l6=new JLabel("<html>Singh Constructor is a trusted construction company committed to delivering high-quality building solutions with integrity, precision, and reliability. With experience across residential, commercial, and infrastructure projects, we focus on strong workmanship, timely delivery, and customer satisfaction.<html>");	
		l6.setBounds(20,65,1000,100);
		add(l6);
		c=getContentPane();
		cd=new CardLayout(40,30);
		c.setLayout(cd);
		ImageIcon icon2=new ImageIcon("imagespotify.jpg");
		l7=new JLabel(icon2);
		l7.setBounds(200,80,100,50);
		c.add("a",l7);
		ImageIcon icon3=new ImageIcon("image.jpg");
		l8=new JLabel(icon3);
		l8.setBounds(200,80,100,50);
		c.add("b",l8);
		l7.addActionListener(this);	
		icon3.addActionListener(this);
		setSize(1000,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		cd.next(c);
	}
	public static void main(String[] args)
	{
		new MainPage();
	}
} 