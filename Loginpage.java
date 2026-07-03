import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Loginpage extends JFrame  implements ActionListener
{
        JLabel l1,l2,l3,l4,l5,l6,l7,l8;
        JTextField tf1,tf2;
        JButton b1,b2,b3;
	Connection c=null;
	PreparedStatement s=null;
	ResultSet rs;
    Loginpage()
    {
	ImageIcon icon= new ImageIcon("ImageIcone1.jpg");
		l1= new JLabel(icon);
		l1.setBounds(0,0,1000,500);
		add(l1);
		l2 =new JLabel();
		l2.setBounds(450,50,300,350);
		Color customColor=new Color(240,240,240);
		l2.setBackground(customColor);
		l2.setOpaque(true);
		l1.add(l2);
		// Green label
		l6 =new JLabel();
		l6.setBounds(200,50,300,350);
		Color customColor1=new Color(76,175,80);
		l6.setBackground(customColor1);
		l6.setOpaque(true);
		l1.add(l6);
		l7 =new JLabel("Welcome Back");
		l7.setBounds(40,100,200,20);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("Arial",Font.BOLD,25));
		l6.add(l7);
		l8 =new JLabel("<html>To keep connected with us please<br> login with your personal info<html>");
		l8.setBounds(40,130,500,40);
		l8.setForeground(Color.WHITE);
		l6.add(l8);
		b2=new JButton("Sign In");
		b2.setBounds(60,200,100,20);
		Color customColor4=new Color(76,175,80);
		b2.setBackground(customColor4);
		b2.setForeground(Color.WHITE);
		l6.add(b2);
		
			// Second frame 

		l3=new JLabel("Sign In ");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		Color customColor2=new Color(76,175,80);
		l3.setForeground(customColor2);
		l3.setBounds(80,70,150,40);
		l2.add(l3);
		l4=new JLabel("User Id ");
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l4.setBounds(80,120,150,40);
		l2.add(l4);
		tf1=new JTextField();
		tf1.setBounds(80,150,150,20);
		l2.add(tf1);
		l5=new JLabel("Password ");
		l5.setFont(new Font("Arial",Font.BOLD,15));
		l5.setBounds(80,165,150,40);
		l2.add(l5);
		tf2=new JTextField();
		tf2.setBounds(80,200,150,20);
		l2.add(tf2);
		b1 =new JButton("Login");
		Color customColor3=new Color(76,175,80);
		b1.setBackground(customColor2);
		b1.setBounds(80,235,150,20);
		l2.add(b1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(1000,500);
        	setLayout(null);
        	setVisible(true);
    	}
	public void Connect()
	{
		
		try{
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","");
		String userid= tf1.getText();
		String password=tf2.getText();
		if(c!=null)
		{	
			s=c.prepareStatement("Select Email , passwd from myuser");
			rs=s.executeQuery();
			while(rs.next())
			{
				
				if((userid.equals(rs.getString("Email"))) && (password.equals(rs.getString("passwd"))))
				{
					//System.out.println("login success");
					JOptionPane.showMessageDialog(this,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
					System.out.println("Login Successfully"); 
					dispose();
			 	}
			}
		}
			s.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==b1)
		{
			Connect();
		}
		if(ob==b2)
		{
			new SignInPage();
		}
	}
	public static void main(String[] args)
	{
		new Loginpage();
	}
}