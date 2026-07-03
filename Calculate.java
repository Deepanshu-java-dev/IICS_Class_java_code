import java.awt.*;
import java.awt.event.*;
class Calculate extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	Calculate()
	{
		//Fornt f=new Fornt(10);
		l1 =new Label("Sum of 2 Number ");
		l1.setBounds(80,30,120,30);
		add(l1);
		l2 =new Label("Enter fist no");
		l2.setBounds(30,60,100,30);
		add(l2);
		t1 =new TextField();
		t1.setBounds(140,60,100,20);
		add(t1);
		l3 =new Label("Enter second no");
		l3.setBounds(30,80,100,30);
		add(l3);
		t2 =new TextField();
		t2.setBounds(140,80,100,20);
		add(t2);
		l4 =new Label("Result");
		l4.setBounds(30,100,100,30);
		add(l4);
		t3 =new TextField();
		t3.setBounds(140,100,100,20);
		add(t3);
		b1 =new Button("Add");
		b1.setBounds(30,140,50,20);
		add(b1);
		b2 =new Button("Sub");
		b2.setBounds(90,140,50,20);
		add(b2);
		b3 =new Button("Mul");
		b3.setBounds(160,140,50,20);
		add(b3);
		b4 =new Button("Divide");
		b4.setBounds(240,140,50,20);
		add(b4);
		b5 =new Button("Clear");
		b5.setBounds(120,170,50,20);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		setLocation(500,200);
		setResizable(false);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob= ae.getSource();
			if(ob==b1)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int add=a+b;
				t3.setText(add +" ");
			}
			if(ob==b2)
				{
				int c=Integer.parseInt(t1.getText());
				int d=Integer.parseInt(t2.getText());
				int sub=c-d;
				t3.setText(sub+" ");
				}
				if(ob==b3)
				{
				int e=Integer.parseInt(t1.getText());
				int f=Integer.parseInt(t2.getText());
				int mul=e*f;
				t3.setText(mul+" ");
				}
				if(ob==b4)
				{
				int g=Integer.parseInt(t1.getText());
				int h=Integer.parseInt(t2.getText());
				int div=g/h;
				t3.setText(div+" ");
				}
				if(ob==b5)
				{
					t1.setText(" ");
					t2.setText(" ");
					t3.setText(" ");
				
				}




	}
	public static void main(String[] args)
	{
		Calculate ca =new Calculate();		
	}
}
