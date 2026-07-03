import javax.swing.*;
import java.awt.event.*;
class SwingDemo2 extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	SwingDemo2()
	{
		b1=new JButton("Click",new ImageIcon("image.jpg"));
		b1.setBounds(30,30,100,50);
		add(b1);
		b2=new JButton("Exit");
		b2.setBounds(130,30,100,50);
		add(b2);
		b3=new JButton("New user");
		b3.setBounds(30,100,100,50);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==b1)
		{
			JOptionPane.showMessageDialog(this,"This is Information Dialog","Information Dialog",JOptionPane.WARNING_MESSAGE);
		}
		if(ob==b2)
		{
			int r=JOptionPane.showConfirmDialog(this,"Do you want to exit ? ","Confirm Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
		switch(r)
		{
		case JOptionPane.YES_OPTION: JOptionPane.showMessageDialog(this," Ok... Bye","Information Dialog",JOptionPane.INFORMATION_MESSAGE);break;
		case JOptionPane.NO_OPTION: JOptionPane.showMessageDialog(this," You can continue","Information Dialog",JOptionPane.INFORMATION_MESSAGE);break;			case JOptionPane.CANCEL_OPTION: JOptionPane.showMessageDialog(this,"Not Exit","Information Dialog",JOptionPane.INFORMATION_MESSAGE);break;
		case JOptionPane.CLOSED_OPTION: JOptionPane.showMessageDialog(this,"Closing Dialog","Information Dialog",JOptionPane.INFORMATION_MESSAGE);break;

		}
		}
		if(ob==b3)
		{
			String s=JOptionPane.showInputDialog(this,"input ","Information Dialog");
		JOptionPane.showMessageDialog(this,"Welcome "+s,"Information Dialog",JOptionPane.INFORMATION_MESSAGE);

		}
	}
	public static void main(String[] args)
	{
		SwingDemo2 ob=new SwingDemo2();
	}
}