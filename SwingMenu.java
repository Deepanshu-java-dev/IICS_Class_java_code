import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingMenu extends JFrame implements KeyListener
{
	JLabel l1;
	SwingMenu()
	{
		JMenuBar mb=new JMenuBar();
		JMenu m1=new JMenu("File");
		m1.setMnemonic(KeyEvent.VK_F);
		mb.add(m1);
		JMenuItem mi=new JMenuItem("New Tab");
		mi.setMnemonic(KeyEvent.VK_N);
		mi.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e)
			{
			if(e.getKeyCode()==KeyEvent.VK_N)
				{
				new CharCount();
				}
			}
			});
			
		JMenuItem mi1=new JMenuItem("New Window");
		JMenuItem mi2=new JMenuItem("Open");
		JMenuItem mi3=new JMenuItem("Recent");
		JMenuItem mi4=new JMenuItem("Save");
		JMenuItem mi5=new JMenuItem("Save as");
		JMenuItem mi6=new JMenuItem("Save all");
		JMenuItem mi7=new JMenuItem("Page setup");
		JMenuItem mi8=new JMenuItem("Print");
		JMenuItem mi9=new JMenuItem("Close tab");
		JMenuItem mi10=new JMenuItem("Close window");
		JMenuItem mi11=new JMenuItem("Exit");
		m1.add(mi);		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi7);
		m1.add(mi8);
		m1.add(mi9);
		m1.add(mi10);
		m1.add(mi11);
		//JMenuBar mb=new JMenuBar();
		JMenu m2=new JMenu("Edit");
		mb.add(m2);
		JMenuItem me=new JMenuItem("Undo");
		JMenuItem me1=new JMenuItem("Cut");
		JMenuItem me2=new JMenuItem("Copy");
		JMenuItem me3=new JMenuItem("Paste");
		JMenuItem me4=new JMenuItem("Delete");
		JMenuItem me5=new JMenuItem("Clear formating");
		JMenuItem me6=new JMenuItem("Define with Bing");
		JMenuItem me7=new JMenuItem("Find");
		JMenuItem me8=new JMenuItem("Find next");
		JMenuItem me9=new JMenuItem("Replace");
		JMenuItem me10=new JMenuItem("Go to");
		JMenuItem me11=new JMenuItem("Select all");
		JMenuItem me12=new JMenuItem("Time/Date");
		JMenuItem me13=new JMenuItem("Font");
		m2.add(me);		
		m2.add(me1);
		m2.add(me2);
		m2.add(me3);
		m2.add(me4);
		m2.add(me5);
		m2.add(me6);
		m2.add(me7);
		m2.add(me8);
		m2.add(me9);
		m2.add(me10);
		m2.add(me11);
		m2.add(me12);
		m2.add(me13);
		JMenu m3=new JMenu("View");
		mb.add(m3);
		JMenuItem mn=new JMenuItem("Zoom");
		JMenuItem mn1=new JMenuItem("Statu bar");
		JMenuItem mn2=new JMenuItem("Word wrap");
		JMenuItem mn3=new JMenuItem("Markdown");
		m3.add(mn);		
		m3.add(mn1);
		m3.add(mn2);
		m3.add(mn3);

	
		setJMenuBar(mb);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void  main(String[] args)
	{
		new SwingMenu();
	}
}