import java.awt.*;
import java.awt.event.*;
public class EventAwt1 extends Frame implements MouseListener
{
	Label l;
	EventAwt1()
	{
		l=new Label("Hello");
		l.setBounds(20,40,120,30);
			add(l);
		addMouseListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent m)
	{
		l.setText("Key is Clicked");
		setBackground(Color.blue);

	}
	public void mouseEntered(MouseEvent m)
	{
		l.setText("Key is Entered");
		setBackground(Color.white);

	}
	public void mouseExited(MouseEvent m)
	{
		l.setText("Key is Exited");
		setBackground(Color.black);

	}
	public void mousePressed(MouseEvent m)
	{
		l.setText("Key is Pressed");

	}
	public void mouseReleased(MouseEvent m)
	{
		l.setText("Key is Released");

	}


	public static void main(String[] args)
	{
	EventAwt1 ob=new EventAwt1();
	}
}