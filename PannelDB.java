import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class PannelDB extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	JButton b1,b2,b3,b4,b5;
	Connection c=null;
	PreparedStatement s=null;
	PannelDB()
	{
		JFrame f= new JFrame("Panel");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,50,500,450);
		p1.setBackground(Color.gray);
		f.add(p1);
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,50,500,450);
		p2.setBackground(Color.white);
		JLabel l1=new JLabel("ADD RECORD");
		l1.setBounds(250,20,100,30);
		JLabel l2=new JLabel("Id");
		l2.setBounds(20,50,100,20);
		tf1=new JTextField();
		tf1.setBounds(90,50,100,20);
		JLabel l3=new JLabel("Name");
		l3.setBounds(20,70,100,30);
		tf2=new JTextField();
		tf2.setBounds(90,70,100,20);
		JLabel l4=new JLabel("Address");
		l4.setBounds(20,90,100,30);
		tf3=new JTextField();
		tf3.setBounds(90,90,100,20);
		JLabel l5=new JLabel("Gender");
		l5.setBounds(20,110,100,30);
		tf10=new JTextField();
		tf10.setBounds(90,110,100,20);
		/*JRadioButton rb2=new JRadioButton("Female");
		rb2.setBounds(110,140,100,20);*/
		b1=new JButton("Submit");
		b1.setBounds(20,160,100,20);
		b2=new JButton("Clear");
		b2.setBounds(140,160,100,20);
		p2.add(l1);
		p2.add(l2);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p2.add(tf10);
		//p2.add(rb2);
		p2.add(b1);
		p2.add(b2);
		b1.addActionListener(this);	
		f.add(p2);
		JPanel p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(0,50,500,450);
		p3.setBackground(Color.white);
		JLabel l6=new JLabel("SHOW RECORD");
		l6.setBounds(250,20,100,30);
		JLabel l7=new JLabel("ID");
		l7.setBounds(20,70,100,20);
		tf4=new JTextField();
		tf4.setBounds(90,70,100,20);
		JLabel l8=new JLabel("NAME");
		l8.setBounds(20,90,100,30);
		tf5=new JTextField();
		tf5.setBounds(90,90,100,20);
		b3=new JButton("Show");
		JLabel l15=new JLabel("Search");
		l15.setBounds(20,50,100,20);
		tf11=new JTextField();
		tf11.setBounds(90,50,100,20);
		b3.setBounds(100,120,100,20);
		p3.add(l6); p3.add(l7); p3.add(l8); p3.add(tf4); p3.add(tf5); p3.add(b3); p3.add(l15); p3.add(tf11);
		 b3.addActionListener(this);
		JPanel p4=new JPanel();
		p4.setLayout(null);
		p4.setBounds(0,50,500,450);
		p4.setBackground(Color.white);
		JLabel l9=new JLabel("DELETE RECORD");
		l9.setBounds(250,20,150,30);
		JLabel l10=new JLabel("ID");
		l10.setBounds(20,50,100,20);
		tf6=new JTextField();
		tf6.setBounds(90,50,100,20);
		JLabel l11=new JLabel("NAME");
		l11.setBounds(20,70,100,30);
		tf7=new JTextField();
		tf7.setBounds(90,70,100,20);
		b4=new JButton("Delete");
		b4.setBounds(100,120,100,20);
		p4.add(l9); p4.add(l10); p4.add(l11); p4.add(tf6); p4.add(tf7); p4.add(b4); 
		b4.addActionListener(this);
		JPanel p5=new JPanel();
		p5.setLayout(null);
		p5.setBounds(0,50,500,450);
		p5.setBackground(Color.white);
		JLabel l12=new JLabel("UPDATE RECORD");
		l12.setBounds(250,20,150,30);
		JLabel l13=new JLabel("Id");
		l13.setBounds(20,50,100,20);
		tf8=new JTextField();
		tf8.setBounds(90,50,100,20);
		JLabel l14=new JLabel("Name");
		l14.setBounds(20,70,100,30);
		tf9=new JTextField();
		tf9.setBounds(90,70,100,20);
		b5=new JButton("update");
		b5.setBounds(100,120,100,20);
		p5.add(l12); p5.add(l13); p5.add(l14); p5.add(tf8); p5.add(tf9); p5.add(b5); 
		b5.addActionListener(this);


		JTabbedPane tp=new JTabbedPane();
		tp.add(p1,"Home");
		tp.add(p2,"Add");
		tp.add(p3,"View");
		tp.add(p4,"Delete");
		tp.add(p5,"Upload");
		tp.setBounds(0,0,500,450);
		f.add(tp);		
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
			JOptionPane.showMessageDialog(this,"Recod Add Successful","Sign In",JOptionPane.INFORMATION_MESSAGE);
			Connect();
			try
			{
			s=c.prepareStatement("Insert into info(Id,Name,Address,Gender) values(?,?,?,?)");
			s.setString(1,tf1.getText());
			s.setString(2,tf2.getText());
			s.setString(3,tf3.getText());
			s.setString(4,tf10.getText());
			s.executeUpdate();
			System.out.println("Registered Successfully");
			}
			catch(Exception ep)
			{
				System.out.println(ep);
			}
		}
			// view query

		if(e.getSource()==b3)
		{			
			JOptionPane.showMessageDialog(this,"ViewRecord Successful","Sign In",JOptionPane.INFORMATION_MESSAGE);
			Connect();
			try
			{
				String a=tf4.getText();
				s=c.prepareStatement("Select Name from info where id=?");
				s.setString(1,a);
				ResultSet rs=s.executeQuery();
				if(rs.next())
				{
					//tf4.setText(rs.getString("Id"));
					tf5.setText(rs.getString("Name"));
				}
			}
			catch(SQLException se)
			{
				System.out.println(se);
			}
		}


			// Delete query
		if(e.getSource()==b4)
		{
			Connect();
			try
			{
				int id=Integer.parseInt(tf6.getText());
				String Name=tf7.getText();
				s=c.prepareStatement("delete from info where id=? and Name=?");
				s.setInt(1,id);
				s.setString(2,Name);
				int rowDeleted=s.executeUpdate();
				if(rowDeleted>0)
				{
					JOptionPane.showMessageDialog(this,"Record Deleted successfully","Delete",JOptionPane.INFORMATION_MESSAGE);
				System.out.println("Delet successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Record Not Founds","Delete",JOptionPane.INFORMATION_MESSAGE);

				}
			}
			catch(SQLException ex)
			{
				System.out.println("ex");
			}
		}	

			// update Query	
	
		if(e.getSource()==b5)
		{
			Connect();
			try
			{
				int id=Integer.parseInt(tf8.getText());
				String name= tf9.getText();
				s=c.prepareStatement("Update info set name=? where id=?");
				s.setInt(1,id);
				s.setString(2,name);
				int x=s.executeUpdate();
				if(x>0)
				{
					System.out.println("Record Update 						successfully");
				}
				else
				{
					System.out.println("Record Not Update ");
				}
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
		}
	}

	public static void main(String[] args)
	{
		new PannelDB();
	}
}