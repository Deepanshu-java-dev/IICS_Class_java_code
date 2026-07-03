import java.awt.*;	 
import javax.swing.*;
class SwingDemo extends JFrame
{
	JButton b1,b2,b3,b4,b5;
	SwingDemo()
	{
		setLayout(new BorderLayout());

		add(new Button("North"),BorderLayout.NORTH);
		add(new Label("The footer meassage"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.WEST);
		add(new Button("Left"),BorderLayout.EAST);
		String msg="The reasonable man adapts"+ " "+"himself to the word";
		add(new TextArea(msg),BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
	}

public static void main(String []args)
{
	SwingDemo d=new SwingDemo();
}
}