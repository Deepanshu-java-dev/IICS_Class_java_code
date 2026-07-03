import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingDemo3 extends JFrame
{
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5,b6;
	SwingDemo3()
	{
		l1=new JLabel("WLECOME TO PORTAL");
		l1.setBounds(150,30,200,20);
		add(l1);
		b1=new JButton("Home");
		b1.setBounds(150,70,100,20);
		b2=new JButton("About");
		b2.setBounds(270,70,100,20);
		b3=new JButton("Contact");
		b3.setBounds(370,70,100,20);
		add(b1);
		add(b2);
		add(b3);	
		ImageIcon icon=new ImageIcon("imagespotify.jpg");
		l2=new JLabel(icon);
		l2.setBounds(10,100,500,200);
		add(l2);
		l3=new JLabel("HEADER");
		l3.setBounds(200,320,250,20);
		add(l3);
		b4=new JButton("Update");
		b4.setBounds(30,360,100,20);
		add(b4);
		b5=new JButton("lOCATION");
		b5.setBounds(150,360,100,20);
		add(b5);
		b6=new JButton("MORE");
		b6.setBounds(280,360,100,20);
		add(b6);
		setSize(500,500);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
	
}