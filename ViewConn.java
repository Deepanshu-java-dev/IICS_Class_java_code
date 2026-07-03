import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class ViewConn extends JFrame  implements ActionListener
{
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b1,b2;
	Connection c=null;
	PreparedStatement s=null;
	ViewConn()
	{
			setSize(500,500);
			setVisible(true);
			setLayout(null);
			setResizable(false);

		JLabel l1=new JLabel("Id");
		l1.setBounds(20,50,100,20);
		tf1=new JTextField();
		tf1.setBounds(90,50,100,20);
		JLabel l2=new JLabel("Name");
		l2.setBounds(20,70,100,30);
		tf2=new JTextField();
		tf2.setBounds(90,70,100,20);
		b1=new JButton("Submit");
		b1.setBounds(20,160,100,20);
		b2=new JButton("Clear");
		b2.setBounds(140,160,100,20);
		add(l1); add(tf1); add(l2); add(tf2); add(b1); add(b2);
		b1.addActionListener(this);

	}
	public void Connect()
	{
		
		try{
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employedb","root","");
			System.out.println("Database connected successfully");			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Connect();
			try
			{
				String a=tf1.getText();
				System.out.println(a);
				s=c.prepareStatement("Select Name from info where id=?");
				s.setString(1,a);
				ResultSet rs=s.executeQuery();
				
				if(rs.next())
				{														//System.out.println(rs.getString("Id"));
						System.out.println(rs.getString("Name"));
					
				}
			}
			catch(SQLException e1)
			{
				System.out.println(e1);
			}

		}
	}
	public static void main(String[] args)
	{
			new ViewConn();
	}
}