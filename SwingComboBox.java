import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingComboBox extends JFrame
{
	JFrame f;
	SwingComboBox()
	{
		f= new JFrame("Combo Example");
		String country[]={"India","Aus","USA","England"};
		JComboBox cb= new JComboBox(country);
			cb.setBounds(50,50,90,20);
		f.add(cb);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void  main(String[] args)
	{
		new SwingComboBox();
	}
}