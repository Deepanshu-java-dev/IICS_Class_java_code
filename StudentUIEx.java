import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
class StudentUIEx extends JFrame
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JButton b1,b2,b3;
	StudentUIEx()
	{
		JFrame frame=new JFrame();
		frame.setSize(700,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);

		//---Label---
			l1=new JLabel("Manage Student");
			l1.setBounds(300,20,200,30);
			l1.setFont(new Font("Arial",Font.BOLD,20));
			frame.add(l1);
			
			l2=new JLabel("Id :");
			l2.setBounds(40,100,100,20);
			l2.setFont(new Font("Arial",Font.BOLD,12));
			frame.add(l2);
	
			l3=new JLabel("Name :");
			l3.setBounds(30,140,100,20);
			l3.setFont(new Font("Arial",Font.BOLD,12));
			frame.add(l3);
	
			l4=new JLabel("Sex :");
			l4.setBounds(40,180,100,20);
			l4.setFont(new Font("Arial",Font.BOLD,12));
			frame.add(l4);
			
			l5=new JLabel("Phone :");
			l5.setBounds(30,220,100,20);
			l5.setFont(new Font("Arial",Font.BOLD,12));
			frame.add(l5);
			
			l6=new JLabel("Address :");
			l6.setBounds(30,260,100,20);
			l6.setFont(new Font("Arial",Font.BOLD,12));
			frame.add(l6);
		
			//----TextField---
			tf1=new JTextField();
			tf1.setBounds(80,100,50,20);
			frame.add(tf1);
		
			tf2=new JTextField();
			tf2.setBounds(80,140,130,20);
			frame.add(tf2);
			
			JRadioButton rb=new JRadioButton("Male");
			rb.setBounds(80,180,80,20);
			frame.add(rb);
			JRadioButton rb1=new JRadioButton("Female");
			rb1.setBounds(180,180,80,20);
			frame.add(rb1);

			tf3=new JTextField();
			tf3.setBounds(80,220,130,20);
			frame.add(tf3);
			
			tf4=new JTextField();
			tf4.setBounds(90,260,170,100);
			frame.add(tf4);

			// ---Table---

		String[] columnNames = {"ID", "Name", "Gender", "Phone","Address"};
        	DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        	JTable table = new JTable(model);

        	JScrollPane sp = new JScrollPane(table);	
        	sp.setBounds(280, 150, 400, 200);
        	frame.add(sp);	
        	frame.setVisible(true);
		

			
			//---Button---
			
			b1=new JButton("Delete");
			b1.setBounds(30,380,100,20);
			frame.add(b1);
				//ye delete ke liye logic
			b1.addActionListener(e -> {
    			int selectedRow = table.getSelectedRow();
   			 if(selectedRow == -1) {
        		JOptionPane.showMessageDialog(frame, "Please select a row!");
   			 } else {
      			  model.removeRow(selectedRow);
  			  }
			});
			
			b2=new JButton("Update");
			b2.setBounds(150,380,100,20);
			frame.add(b2);
				//update logic
			b2.addActionListener(e -> {
    			int selectedRow = table.getSelectedRow();
    			if(selectedRow == -1) {
        		JOptionPane.showMessageDialog(frame, "Select a row to 									update!");
    			} else {
       			model.setValueAt(tf2.getText(), selectedRow, 1);
        		model.setValueAt(tf3.getText(), selectedRow, 3);
        		model.setValueAt(tf4.getText(), selectedRow, 4);
   			}
			});
		
			b3=new JButton("Add");
			b3.setBounds(270,380,100,20);
			frame.add(b3);
				//ye b3 ka Action code hai
			/*b3.addActionListener(e -> {
			String id=tf1.getText();
    			String name = tf2.getText();
			String gender = "";
			if(rb.isSelected()) {
    				gender = "Male";
			} else if(rb1.isSelected()) {
    				gender = "Female";
			}
			String phone = tf3.getText();
			String address = tf4.getText();

    if(name.isEmpty() || phone.isEmpty() || address.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Please fill all fields!");
    } else {
        model.addRow(new Object[]{id, name,gender, phone, address});

        /*nameField.setText("");
        courseField.setText("");
        marksField.setText("");*/
    }
});*/
		
		
	}
	public static void main(String[] args)
	{
		new StudentUIEx();
	}
}