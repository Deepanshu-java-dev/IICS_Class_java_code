import javax.swing.*;
//import java.awt.*;
class ComboBox extends JFrame
{
	ComboBox()
	{
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		String country []={"India","U.S.A","Austualia","canda"};
		JComboBox eb=new JComboBox(country);
		eb.setBounds(100,100,130,60);
		add(eb);
	}
	public static void main(String[] args)
	{
		new ComboBox();
	}
}
