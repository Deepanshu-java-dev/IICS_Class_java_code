import java.awt.*;
class Awt3 extends Frame
{
	Awt3()
	{
		Font f=new Font("Serif",Font.BOLD,40);
		Label l=new Label("Library Membership Form");
		l.setFont(f);
		l.setBounds(300,30,600,30);
			add(l);
		Label l1=new Label("Name :");n
		TextField t1=new TextField();
		l1.setBounds(20,80,100,20);
		t1.setBounds(150,80,100,20);
			add(l1);
			add(t1);
		Label l2=new Label("Student ID:");
		TextField t2=new TextField();
		l2.setBounds(20,100,100,20);
		t2.setBounds(150,100,100,20);
			add(l2);
			add(t2);	
		Label l3=new Label("Department :");
		l3.setBounds(20,120,100,20);
		Checkbox c=new Checkbox("Bca");
		c.setBounds(150,120,100,20);
			add(l3);
			add(c);
		Label l4=new Label("Department :");
		l4.setBounds(20,120,100,20);
		Checkbox c1=new Checkbox("BSc");
		c1.setBounds(150,140,100,20);
			add(l4);
			add(c1);
		Label l5=new Label("Department :");
		l5.setBounds(20,120,100,20);
		Checkbox c2=new Checkbox("Bca");
		c2.setBounds(150,160,100,20);
			add(l5);
			add(c2);
		Label l6=new Label("MemberShips :");
		l6.setBounds(20,180,100,20);
			add(l6);
		Button b=new Button("Submit");
		b.setBounds(30,220,100,20);
			add(b);
		Button b1=new Button("Clear");
		b1.setBounds(150,220,100,20);
			add(b1);

		setSize(500,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		Awt3 ob=new Awt3();
	}
}