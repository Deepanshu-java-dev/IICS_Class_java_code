import java.awt.*;
class Awt2 extends Frame 
{
	Awt2()
	{
		Font f=new Font("Serif",Font.BOLD,20);
		Label l=new Label("Enter your Details");
		l.setFont(f);
			l.setBounds(50,30,100,30);
			add(l);
		Label l1=new Label("Name :");
		TextField t=new TextField();
		l1.setBounds(20,60,100,30);
		t.setBounds(150,60,100,20);
			add(l1);
			add(t);
		Label l2=new Label("Father Name :");
		l2.setBounds(20,80,100,30);
			add(l2);
		TextField t1=new TextField();
		t1.setBounds(150,80,100,20);
			add(t1);

		Label l3=new Label("DOB :");
		TextField t2=new TextField();
		l3.setBounds(20,100,100,30);
			add(l3);
		t2.setBounds(150,100,100,20);
			add(t2);

		Label l4=new Label("E-Mail ID:");
		TextField t3=new TextField();
		l4.setBounds(20,120,100,30);
			add(l4);
		t3.setBounds(150,120,100,20);
			add(t3);
		Label l5=new Label("Hobbies:");
		l5.setBounds(20,160,100,30);
			add(l5);
		Checkbox c=new Checkbox("Singing");
		c.setBounds(150,160,100,20);
			add(c);
		Checkbox c1=new Checkbox("Dancing");
		c1.setBounds(150,180,100,20);
			add(c1);
		Checkbox c2=new Checkbox("Reading");
		c2.setBounds(150,200,100,20);
			add(c2);
		
		Button b=new Button("Cancel");
		b.setBounds(20,250,100,30);
			add(b);
		Button b1=new Button("Submit");
		b1.setBounds(210,250,100,30);
			add(b1);		
		setSize(500,400);
		setLayout(null);
		setVisible(true);	
	}
	public static void main(String[] args)
	{
		Awt2 ob=new Awt2();
	}
}