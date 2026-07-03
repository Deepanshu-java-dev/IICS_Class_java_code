import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CharCount extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextArea ta;
	JButton b1,b2,b3;
	CharCount()
	{
		super("Char Word Count Tool");
		l1=new JLabel("Characters");
		l1.setBounds(50,50,100,20);
		l2=new JLabel("Words");
		l2.setBounds(50,80,100,20);
		b1=new JButton("click");
		b1.setBounds(50,320,80,30);
		b1.addActionListener(this);
		ta=new JTextArea();
		ta.setBounds(50,110,300,200);
		b2=new JButton("Text Area Color");
		b2.setBounds(140,320,110,30);
		b2.addActionListener(this);
		b3=new JButton("Text Color");
		b3.setBounds(260,320,110,30);
		b3.addActionListener(this);
		add(l1);
		add(l2);
		add(ta);
		add(b1);
		add(b2);
		add(b3);
		setSize(400,400);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				String text =ta.getText();
				l1.setText("Characters:" + text.length());
				String words[]=text.split("\\s");
				l2.setText("Words:"+ words.length);
			}
			else if(e.getSource()==b2)
			{
				Color c=JColorChooser.showDialog(this,"Choose color",Color.black);
			ta.setBackground(c);
			}
			else if(e.getSource()==b3)
			{
				Color c1=JColorChooser.showDialog(this,"Choose Color",Color.red);
			ta.setForeground(c1);
			}
		}
	public static void main(String[] args)
	{
		new CharCount();
	}
}