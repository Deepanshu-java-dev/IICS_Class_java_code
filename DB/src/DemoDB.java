import java.sql.*;
class DemoDB
{
	public static void main(String[] args)
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
			s.executeUpdate("create table if not exists Student(Std_Id int(5),Name varchar(10))");
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
}