import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SignInPage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4;
	JButton b1;
	SignInPage()
	{
		ImageIcon icon= new ImageIcon("ImageIcone1.jpg");
		l1= new JLabel(icon);
		l1.setBounds(0,0,1000,500);
		add(l1);
		l2 =new JLabel();
		l2.setBounds(300,50,300,350);
		Color customColor=new Color(240,240,240);
		l2.setBackground(customColor);
		l2.setOpaque(true);
		l1.add(l2);
		l3= new JLabel("Register");
		l3.setBounds(100,50,200,30);
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l2.add(l3);
		l4=new JLabel("Name");
		l4.setBounds(20,100,100,20);
		l2.add(l4);
		tf1=new JTextField();
		tf1.setBounds(20,120,250,20);
		l2.add(tf1);
		l5=new JLabel("Email");
		l5.setBounds(20,140,100,20);
		l2.add(l5);
		tf2=new JTextField();
		tf2.setBounds(20,160,250,20);
		l2.add(tf2);
		l6=new JLabel("Password");
		l6.setBounds(20,180,100,20);
		l2.add(l6);
		tf3=new JTextField();
		tf3.setBounds(20,200,250,20);
		l2.add(tf3);
		l7=new JLabel("Confirm Password");
		l7.setBounds(20,220,150,20);
		l2.add(l7);
		tf4=new JTextField();
		tf4.setBounds(20,240,250,20);
		l2.add(tf4);

		b1=new JButton("Sign Up");
		b1.setBounds(70,280,150,30);
		b1.setBackground(Color.BLUE);
		l2.add(b1);
		b1.addActionListener(this);
		setSize(1000,500);
        	setLayout(null);
        	setVisible(true);
	}
	public void Connection()
	{
		Connection c=null;
		Statement s=null;
		try{
			//Class.forName("com.mysql.cg.jdbc.Driver");
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		if(c!=null)
		{
			System.out.println("Database connected successfully");
			s=c.createStatement();
			s.executeUpdate("create table if not exists Student(Empl_Name varchar(25),Empl_Id int(5),Password int(10))");
			s.executeUpdate("Insert into Student values(101,'Neha')");
					
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
			String name=tf1.getText();
			String Email=tf2.getText();
			String password=tf3.getText();
			String confirmpassword=tf4.getText();
			if(name.isEmpty()&&Email.isEmpty()&&password.isEmpty())
			{
			JOptionPane.showMessageDialog(this,"Please Fill ","Error",JOptionPane.ERROR_MESSAGE);
			}

			else if(name.isEmpty())
			{
			JOptionPane.showMessageDialog(this,"Please enter name ","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(Email.isEmpty())
			{
			JOptionPane.showMessageDialog(this,"Please Enter Your Emali ","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(password.isEmpty())
			{
			JOptionPane.showMessageDialog(this,"Please Enter Password ","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(!password.equals(confirmpassword))
			{
				JOptionPane.showMessageDialog(this,"Please same password ","Error",JOptionPane.ERROR_MESSAGE);
			}
			else
			{
			JOptionPane.showMessageDialog(this,"Sign In Successful","Sign In",JOptionPane.INFORMATION_MESSAGE);
				new Loginpage();
			}
		}
	}
	public static void main(String[] args)
	{
		new SignInPage();
		SignInPage sp=new SignInPage();
		sp.Connection();
		
	}
}