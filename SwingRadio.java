import java.awt.event.*;
import javax.swing.*;
class SwingRadio extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JButton b;
	JFrame f;
	SwingRadio()
	{
		rb1 =new JRadioButton("Male");
		rb2 =new JRadioButton("Female");
		rb1.setBounds(100,50,100,30);
		rb2.setBounds(100,100,100,30);
		// this use only chooice only button
		ButtonGroup bg= new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b =new JButton("Click");
		b.setBounds(100,150,80,30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(rb1.isSelected())
			{
				JOptionPane.showMessageDialog(this,"you are male");
			}
			if(rb2.isSelected())
			{
				JOptionPane.showMessageDialog(this,"you are female");
			}
		}

	public static void main(String[] args)
	{
		SwingRadio ob=new SwingRadio();
	}
}