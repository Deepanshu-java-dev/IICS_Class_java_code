import java.awt.*;
import java.awt.event.*;
public class EventAwt extends Frame implements KeyListener
{
	Label l;
	EventAwt()
	{
		l=new Label("Hello");
		l.setBounds(20,40,120,30);
			add(l);
		addKeyListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void keyPressed(KeyEvent k)
	{
		l.setText("Key is Pressed");
	}
	public void keyReleased(KeyEvent k)
	{
		l.setText("Key is Released");
	}
	public void keyTyped(KeyEvent k)
	{
		char a=k.getKeyChar();
		l.setText(Character.toString(a));
	}
	public static void main(String[] args)
	{
		EventAwt ob=new EventAwt();
	}
}