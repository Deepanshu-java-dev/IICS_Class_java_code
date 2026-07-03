import java.awt.*;
import java.awt.event.*;
class CalculaterProject extends Frame implements ActionListener
{
	TextField tf;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button badd,bsub,bmul,bdiv,beq,bclear;
	Double num1,num2,result;
	char operator;
	CalculaterProject()
	{
		setLayout(new BorderLayout());
		tf= new TextField();
		tf.setFont(new Font("Arial",Font.BOLD,24));
		tf.setBounds(20,40,260,30);
		b1=new Button("1");
		b1.setBounds(30,170,40,30);
		add(b1);
		b2=new Button("2");
		b2.setBounds(80,170,40,30);
		add(b2);
		b3=new Button("3");
		b3.setBounds(130,170,40,30);
		add(b3);
		b4=new Button("4");
		b4.setBounds(30,130,40,30);
		add(b4);
		b5=new Button("5");
		b5.setBounds(80,130,40,30);
		add(b5);
		b6=new Button("6");
		b6.setBounds(130,130,40,30);
		add(b6);
		b7=new Button("7");
		b7.setBounds(30,90,40,30);
		add(b7);
		b8=new Button("8");
		b8.setBounds(80,90,40,30);
		add(b8);
		b9=new Button("9");
		b9.setBounds(130,90,40,30);
		add(b9);
		b0=new Button("0");
		b0.setBounds(30,210,40,30);
		add(b0);
		badd =new Button("+");
		badd.setBounds(180,90,40,30);
		add(badd);
		bsub =new Button("-");
		bsub.setBounds(180,130,40,30);
		add(bsub);
		bmul =new Button("*");
		bmul.setBounds(180,170,40,30);
		add(bmul);
		bdiv =new Button("/");
		bdiv.setBounds(180,210,40,30);
		add(bdiv);
		beq =new Button("=");
		beq.setBounds(130,210,40,30);
		add(beq);
		bclear =new Button("C");
		bclear.setBounds(80,210,40,30);
		add(bclear);
		add(tf);
		b0.addActionListener(this);
		b1.addActionListener(this);		
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bclear.addActionListener(this);
		setTitle("Calculator");
		setSize(300,300);
		setResizable(false);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String ob=ae.getActionCommand();
		if(ob.charAt(0)>='0' && ob.charAt(0)<='9')
		{
			tf.setText(tf.getText() + ob);
		}
		else if(ob.equals("+")||ob.equals("-")||ob.equals("*")||ob.equals("/"))
		{
			num1=Double.parseDouble(tf.getText());
			operator=ob.charAt(0);
			tf.setText("");
		}
		else if(ob.equals("="))
		{
			
			num2=Double.parseDouble(tf.getText());
			switch(operator)
			{
				case '+':result=num1+num2; break;
				case '-':result=num1-num2; break;
				case '*':result=num1*num2; break;
				case '/':result=num1/num2; break;
			}
			tf.setText(result+"");
		}
		else if(ob.equals("C"))
		{
			tf.setText("");
			num1=num2=result=0.0;
			operator='\0';
		}
	}
	public static void main(String args[])
	{
		CalculaterProject cp=new CalculaterProject();

	}
}