import java.awt.*;
import java.awt.event.*;
class Discount extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4,t5;
	Button b;
	public Discount()
	{
		l1=new Label("Discount Calculator");
		l1.setBounds(80,30,120,30);
		add(l1);
		l2=new Label("Product ID ");
		l2.setBounds(30,60,100,30);
		add(l2);
		l3=new Label("Price ");
		l3.setBounds(30,80,100,30);
		add(l3);
		l4 =new Label("Quantity ");
		l4.setBounds(30,105,100,20);
		add(l4);
		t1=new TextField();
		t1.setBounds(150,60,100,20);
		add(t1);
		t2=new TextField();
		t2.setBounds(150,80,100,20);
		add(t2);
		t3=new TextField();
		t3.setBounds(150,110,100,20);
		add(t3);
		b= new Button("Click");
		b.setBounds(150,140,100,20);
		add(b);
		Label l5=new Label("Discount");
		l5.setBounds(30,160,100,30);
		add(l5);
		Label l6=new Label("Net Amount");
		l6.setBounds(30,180,100,30);
		add(l6);
		t4=new TextField();
		t4.setBounds(150,160,100,20);
		add(t4);
		t5=new TextField();
		t5.setBounds(150,180,100,20);
		add(t5);
		b.addActionListener(this);

		setLocation(500,200);
		setResizable(false);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object o=ae.getSource();
		
		if(o==b)
		{
			int a=Integer.parseInt(t2.getText());
			int c=Integer.parseInt(t3.getText());
			int amt=a*c;
			int d=0;
			if(c>=50)
			{
				d=(amt*10)/100;
			}
			else
			{
				d=0;
			}
			t4.setText(d+" ");
			int na=amt-d;
			t5.setText(na+" ");
		}
	}		
	public static void main(String []args)
	{
		Discount d=new Discount();
	}
}