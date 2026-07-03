import java.awt.*;
class Awt extends Frame
{
	Awt()
	{
		Label l1=new Label("Java Window ");
		Label l2=new Label("Name :");
		Label l3=new Label("Password :");
		Label l4=new Label("Email:");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextField tf4=new TextField();
		
		l1.setBounds(100,50,100,50);
			add(l1);
		l2.setBounds(70,100,100,20);
		tf2.setBounds(200,100,100,20);
			add(l2);
			add(tf2);	
		l3.setBounds(70,120,100,20);
		tf3.setBounds(220,120,100,20);
			add(l3);
			add(tf3);
		l4.setBounds(70,140,100,20);
		tf3.setBounds(240,140,100,20);
			add(l4);
			add(tf4);
		botton b=new botton("Login");
		add(b);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Awt a=new Awt();
	}
}