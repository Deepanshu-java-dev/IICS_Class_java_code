import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

class Demo
{
    JFrame frame;

    JPanel sidebar, topPanel, card1, card2, card3, card4;
    JPanel orderPanel, salesPanel, productPanel, userPanel, quickPanel;

    JLabel title;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

    JTable table1,table2,table3;

    DefaultTableModel model1,model2,model3;

    Demo()
    {
        frame = new JFrame("Smart Shop - Admin Dashboard");
        frame.setSize(1400,900);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(245,247,250));

        // ================= SIDEBAR =================

        sidebar = new JPanel();
        sidebar.setLayout(null);
        sidebar.setBounds(0,0,250,900);
        sidebar.setBackground(Color.WHITE);
        frame.add(sidebar);

        JLabel logo = new JLabel("SMART SHOP");
        logo.setBounds(40,40,200,40);
        logo.setFont(new Font("Arial",Font.BOLD,30));
        logo.setForeground(new Color(0,102,255));
        sidebar.add(logo);

        JLabel role = new JLabel("Administrator");
        role.setBounds(60,90,150,20);
        role.setForeground(Color.GRAY);
        sidebar.add(role);

        b1 = new JButton("Dashboard");
        b2 = new JButton("Products");
        b3 = new JButton("Orders");
        b4 = new JButton("Users");
        b5 = new JButton("Categories");
        b6 = new JButton("Coupons");
        b7 = new JButton("Reports");
        b8 = new JButton("Settings");
        b9 = new JButton("Logout");

        JButton arr[] = {b1,b2,b3,b4,b5,b6,b7,b8,b9};

        int y = 180;

        for(int i=0;i<arr.length;i++)
        {
            arr[i].setBounds(20,y,200,45);
            arr[i].setFocusPainted(false);
            arr[i].setBackground(Color.WHITE);
            arr[i].setFont(new Font("Arial",Font.BOLD,16));
            arr[i].setBorder(new LineBorder(new Color(220,220,220)));
            sidebar.add(arr[i]);

            y += 60;
        }

        // ================= TITLE =================

        title = new JLabel("Dashboard");
        title.setBounds(300,30,300,40);
        title.setFont(new Font("Arial",Font.BOLD,40));
        frame.add(title);

        JLabel sub = new JLabel("Overview of your store and activities");
        sub.setBounds(300,75,400,30);
        sub.setFont(new Font("Arial",Font.PLAIN,18));
        sub.setForeground(Color.GRAY);
        frame.add(sub);

        // ================= CARDS =================

        card1 = createCard("Total Orders","245");
        card1.setBounds(300,130,250,120);
        frame.add(card1);

        card2 = createCard("Total Users","1284");
        card2.setBounds(580,130,250,120);
        frame.add(card2);

        card3 = createCard("Total Products","356");
        card3.setBounds(860,130,250,120);
        frame.add(card3);

        card4 = createCard("Revenue","₹ 2,45,680");
        card4.setBounds(1140,130,220,120);
        frame.add(card4);

        // ================= RECENT ORDERS =================

        orderPanel = new JPanel();
        orderPanel.setLayout(null);
        orderPanel.setBounds(300,290,560,300);
        orderPanel.setBackground(Color.WHITE);
        orderPanel.setBorder(new LineBorder(new Color(220,220,220)));
        frame.add(orderPanel);

        JLabel orderTitle = new JLabel("Recent Orders");
        orderTitle.setBounds(20,10,250,30);
        orderTitle.setFont(new Font("Arial",Font.BOLD,28));
        orderPanel.add(orderTitle);

        String col1[] = {"Order ID","Customer","Amount","Status"};

        model1 = new DefaultTableModel(col1,0);

        table1 = new JTable(model1);

        JScrollPane sp1 = new JScrollPane(table1);
        sp1.setBounds(20,60,510,200);

        orderPanel.add(sp1);

        model1.addRow(new Object[]{"#1025","Ashu Kumar","₹1299","Delivered"});
        model1.addRow(new Object[]{"#1024","Priya Sharma","₹3499","Shipped"});
        model1.addRow(new Object[]{"#1023","Rohan","₹3798","Delivered"});
        model1.addRow(new Object[]{"#1022","Neha","₹799","Cancelled"});

        // ================= SALES PANEL =================

        salesPanel = new JPanel();
        salesPanel.setLayout(null);
        salesPanel.setBounds(890,290,470,300);
        salesPanel.setBackground(Color.WHITE);
        salesPanel.setBorder(new LineBorder(new Color(220,220,220)));
        frame.add(salesPanel);

        JLabel sales = new JLabel("Sales Overview");
        sales.setBounds(20,10,300,30);
        sales.setFont(new Font("Arial",Font.BOLD,28));
        salesPanel.add(sales);

        JTextArea graph = new JTextArea();
        graph.setBounds(20,60,420,200);
        graph.setFont(new Font("Monospaced",Font.BOLD,18));
        graph.setText(
                "\n\n" +
                "       SALES GRAPH\n\n" +
                "  ₹20K ──────●\n\n" +
                "  ₹40K ─────────●\n\n" +
                "  ₹60K ─────────────●\n\n" +
                "  ₹80K ─────────────────●\n"
        );

        graph.setEditable(false);

        salesPanel.add(graph);

        // ================= PRODUCT PANEL =================

        productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBounds(300,620,500,220);
        productPanel.setBackground(Color.WHITE);
        productPanel.setBorder(new LineBorder(new Color(220,220,220)));
        frame.add(productPanel);

        JLabel ptitle = new JLabel("Top Selling Products");
        ptitle.setBounds(20,10,300,30);
        ptitle.setFont(new Font("Arial",Font.BOLD,26));
        productPanel.add(ptitle);

        String col2[] = {"Product","Sold","Revenue"};

        model2 = new DefaultTableModel(col2,0);

        table2 = new JTable(model2);

        JScrollPane sp2 = new JScrollPane(table2);
        sp2.setBounds(20,60,450,130);

        productPanel.add(sp2);

        model2.addRow(new Object[]{"Boat Rockerz","120","₹1,55,000"});
        model2.addRow(new Object[]{"Nike Air Max","98","₹3,42,000"});
        model2.addRow(new Object[]{"Fastrack Watch","75","₹1,42,000"});

        // ================= USER PANEL =================

        userPanel = new JPanel();
        userPanel.setLayout(null);
        userPanel.setBounds(830,620,530,220);
        userPanel.setBackground(Color.WHITE);
        userPanel.setBorder(new LineBorder(new Color(220,220,220)));
        frame.add(userPanel);

        JLabel utitle = new JLabel("Recent Users");
        utitle.setBounds(20,10,250,30);
        utitle.setFont(new Font("Arial",Font.BOLD,26));
        userPanel.add(utitle);

        String col3[] = {"Name","Email"};

        model3 = new DefaultTableModel(col3,0);

        table3 = new JTable(model3);

        JScrollPane sp3 = new JScrollPane(table3);
        sp3.setBounds(20,60,480,130);

        userPanel.add(sp3);

        model3.addRow(new Object[]{"Ashu Kumar","ashu@gmail.com"});
        model3.addRow(new Object[]{"Priya Sharma","priya@gmail.com"});
        model3.addRow(new Object[]{"Rohan","rohan@gmail.com"});

        frame.setVisible(true);
    }

    JPanel createCard(String title,String value)
    {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.WHITE);
        p.setBorder(new LineBorder(new Color(220,220,220)));

        JLabel l1 = new JLabel(title);
        l1.setBounds(20,20,200,30);
        l1.setFont(new Font("Arial",Font.BOLD,22));

        JLabel l2 = new JLabel(value);
        l2.setBounds(20,60,200,40);
        l2.setFont(new Font("Arial",Font.BOLD,32));

        p.add(l1);
        p.add(l2);

        return p;
    }

    public static void main(String[] args)
    {
        new Demo();
    }
}