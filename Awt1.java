import java.awt.*;
class Awt1 extends Frame
{
	Awt1()
	{
		Label l1=new Label("My Label");
		TextField tf1=new TextField();
			
		l1.setBounds(30,60,100,20);
		tf1.setBounds(160,60,100,20);
		add(l1);
		add(tf1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Awt1 a=new Awt1();
	}
	
}