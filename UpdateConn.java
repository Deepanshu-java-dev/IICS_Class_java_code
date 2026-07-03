import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class UpdateConn extends JFrame  implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	Connection c=null;
	PreparedStatement s=null;
	UpdateConn()
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
		l3= new JLabel("Address");
		l3.setBounds(20,100,100,20);
		tf3=new JTextField();
		tf3.setBounds(90,100,100,20);
		b1=new JButton("Search");
		b1.setBounds(190,50,100,20);
		b2=new JButton("Update");
		b2.setBounds(140,160,100,20);
		add(l1); add(tf1); add(l2); add(tf2); add(b1); add(b2);
		add(l3); add(tf3);
		b1.addActionListener(this);
		b2.addActionListener(this);

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
		try
		{
			if(e.getSource()==b1)
			{
				Connect();
				String a=tf1.getText();
				String b=tf2.getText();
				String d=tf3.getText();
				System.out.println(a);
				s=c.prepareStatement("Select Name , Address from info where id=?");
				s.setString(1,a);
				ResultSet rs=s.executeQuery();
				if(rs.next())
				{														tf2.setText(rs.getString("Name"));
					tf3.setText(rs.getString("Address"));

					
				}
			}
			if(e.getSource()==b2)
			{
				//Connect();
				String a=tf1.getText();
				String b=tf2.getText();
				String d=tf3.getText();

				System.out.println(a);
				s=c.prepareStatement("Update info set Name=?,Address=? where id=?");
				s.setString(1,b);
				s.setString(2,d);
				s.setString(3,a);

				s.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Update Successful","Data Update",JOptionPane.INFORMATION_MESSAGE);

				System.out.println("Update successfully");
				
					
			
			}
		}
		catch(SQLException e1)
		{
			System.out.println(e1);
		}

	}
	public static void main(String[] args)
	{
			new UpdateConn();
	}
}