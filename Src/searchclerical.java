package finalproject;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
import java.sql.*;  
public class searchclerical extends JFrame implements ActionListener {  
//Initializing Components  
    JLabel lb, lb1, lb2, lb5;  
    JTextField tf1, tf2, tf5;  
    JButton btn;  
    //Creating Constructor for initializing JFrame components  
    searchclerical() {  
        //Providing Title  
        super("Fetching clerical_staff Information");  
        lb5 = new JLabel("Enter rid:");  
        lb5.setBounds(20, 20, 100, 20);  
        tf5 = new JTextField(20);  
        tf5.setBounds(130, 20, 200, 20);  
        btn = new JButton("Submit");  
        btn.setBounds(50, 50, 100, 20);  
        btn.addActionListener(this);  
        lb = new JLabel("Fetching request Information From Database");  
        lb.setBounds(30, 80, 450, 30);  
        lb.setForeground(Color.red);  
        lb.setFont(new Font("Serif", Font.BOLD, 20));  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(500, 500);  
        lb1 = new JLabel("Name:");  
        lb1.setBounds(20, 120, 100, 20);  
        tf1 = new JTextField(50);  
        tf1.setBounds(130, 120, 200, 20);  
        lb2 = new JLabel("RID:");  
        lb2.setBounds(20, 150, 100, 20);  
        tf2 = new JTextField(100);  
        tf2.setBounds(130, 150, 200, 20);  
        
        setLayout(null);  
        //Add components to the JFrame  
        add(lb5);  
        add(tf5);  
        add(btn);  
        add(lb);  
        add(lb1);  
        add(tf1);  
        add(lb2);  
        add(tf2);  
        
        //Set TextField Editable False  
        tf1.setEditable(false);  
        tf2.setEditable(false);  
        
    }  
    public void actionPerformed(ActionEvent e) {  
        //Create DataBase Coonection and Fetching Records  
        try {  
            String str = tf5.getText();  
            Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
            PreparedStatement st = con.prepareStatement("select * from Clerical_Staff where rid=?");  
            st.setString(1, str);  
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
            if (rs.next()) {  
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                 
                
                //Sets Records in TextFields.  
                tf1.setText(s);  
                tf2.setText(s1);  
                
                
            } else {  
                JOptionPane.showMessageDialog(null, "id not Found");  
            }  
            //Create Exception Handler  
        } catch (Exception ex) {  
            System.out.println(ex);  
        }  
    }  
    //Running Constructor  
    public static void main(String args[]) {  
        new search() ;
    }  
}  
