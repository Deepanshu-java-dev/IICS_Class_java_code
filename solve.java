import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class solve extends JFrame implements ActionListener
{
    JTextArea chatArea;
    JTextField messageField;
    JButton sendButton;

    public solve()
    {
        setTitle("Customer Support ChatBot");
        setSize(400,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Heading
        JLabel heading = new JLabel("Customer Support");
        heading.setBounds(120,10,200,30);
        heading.setFont(new Font("Arial",Font.BOLD,20));
        add(heading);

        // Chat Area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial",Font.PLAIN,15));

        JScrollPane sp = new JScrollPane(chatArea);
        sp.setBounds(20,50,340,320);
        add(sp);

        // Message Field
        messageField = new JTextField();
        messageField.setBounds(20,390,250,40);
        messageField.setFont(new Font("Arial",Font.PLAIN,16));
        add(messageField);

        // Send Button
        sendButton = new JButton("Send");
        sendButton.setBounds(280,390,80,40);
        sendButton.setBackground(new Color(0,120,215));
        sendButton.setForeground(Color.WHITE);
        sendButton.setFocusPainted(false);
        sendButton.addActionListener(this);
        add(sendButton);

        // Welcome Message
        chatArea.append("Bot : Hello Customer!\n");
        chatArea.append("Bot : How can I help you?\n\n");

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String msg = messageField.getText().toLowerCase();

        // User Message
        chatArea.append("You : " + msg + "\n");

        // Bot Reply
        if(msg.contains("hello") || msg.contains("hi"))
        {
            chatArea.append("Bot : Hello! Welcome to our store.\n");
        }
        else if(msg.contains("delivery"))
        {
            chatArea.append("Bot : Delivery takes 3-5 working days.\n");
        }
        else if(msg.contains("payment"))
        {
            chatArea.append("Bot : We support UPI, Debit Card and Credit Card.\n");
        }
        else if(msg.contains("refund"))
        {
            chatArea.append("Bot : Refund available within 7 days.\n");
        }
        else if(msg.contains("order"))
        {
            chatArea.append("Bot : Please enter your Order ID.\n");
        }
        else if(msg.contains("thank"))
        {
            chatArea.append("Bot : You're welcome!\n");
        }
        else
        {
            chatArea.append("Bot : Sorry, I didn't understand.\n");
        }

        chatArea.append("\n");

        // Clear Text Field
        messageField.setText("");
    }

    public static void main(String[] args)
    {
        new solve();
    }
}