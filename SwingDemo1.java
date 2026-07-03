import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo1 extends JFrame implements ActionListener {
	JLabel l1,l2;
	JButton b1, b2;
    	JTextField tf1;
	JPasswordField tf2;

    public SwingDemo1() {
        setLayout(new GridLayout(3, 3, 5, 5));
        
        l1 = new JLabel("User ID:");
        add(l1);
        tf1= new JTextField();
        add(tf1);
        
        l2 = new JLabel("Password:");
        add(l2);
        tf2 = new JPasswordField();
        add(tf2);
        
        b1= new JButton("Login");
        add(b1);
        b2 = new JButton("Clear");
        add(b2);
        
        b1.addActionListener(this);
       	b2.addActionListener(this);
        
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String userid = tf1.getText();
            String password = new String(tf2.getPassword());
            if ("admin".equals(userid) && "admin".equals(password)) {
                JOptionPane.showMessageDialog(this,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
		new SwingDemo3();
            } else {
                System.out.println("Invalid credentials");
            }
        } else if (ae.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
        }
    }

    public static void main(String[] args) {
        new SwingDemo1();
    }
}