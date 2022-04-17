package finalproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.*;
import java.text.*;

public class solution{
	public Connection con = null;
	public Statement st = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	{
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			st = con.createStatement();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	JFrame f ;
	JLabel Main;
	JButton pr,vr,cs,ss,ex,print,dp,costs,rd;
	public void mainpage() {
		f = new JFrame("Project");
		Main = new JLabel("Welcome to ICTS Printing management system");
		Main.setFont(new Font("",Font.BOLD,30));
		pr = new JButton("Place request");
		pr.setFont(new Font("",Font.BOLD,22));
		pr.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						requestedStaff k=new requestedStaff();
					}
				});
		vr = new JButton("View request");
		vr.setFont(new Font("",Font.BOLD,22));
		vr.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						search uy=new search();
						
					}
				});
		cs = new JButton("Clerical Staff");
		cs.setFont(new Font("",Font.BOLD,22));
		cs.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							clericalStaff k=new clericalStaff();
						}
						catch(Exception eu)
						{
							System.out.println(eu);
						}
					}
				});
		ss = new JButton("Required Conditions");
		ss.setFont(new Font("",Font.BOLD,22));
		ss.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							required k=new required();
						}
						catch(Exception eu)
						{
							System.out.println(eu);
						}
					}
				});
		rd = new JButton("view Request_details");
		rd.setFont(new Font("",Font.BOLD,22));
		rd.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							searchrequest k=new searchrequest();
						}
						catch(Exception eu)
						{
							System.out.println(eu);
						}
					}
				});

		print=new JButton("Printer");
		print.setFont(new Font("",Font.BOLD,22));
		print.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							
							printer k=new printer();
						}
						catch(Exception eu)
						{
							System.out.println(eu);
						}
					}
				});
		dp=new JButton("Delivery Person");
		dp.setFont(new Font("",Font.BOLD,22));
		dp.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							delivery k=new delivery();
						}
						catch(Exception eu)
						{
							System.out.println(eu);
						}
					}
				});
		ex = new JButton("Exit");
		ex.setFont(new Font("",Font.BOLD,22));
		ex.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							f.dispose();
							con.close();
							st.close();
						}
						catch(SQLException uc)
						{
							System.out.println(uc);
						}
					}
				});
		costs=new JButton("Cost");
		costs.setFont(new Font("",Font.BOLD,22));
		costs.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							cost_details d=new cost_details();
							cost.insert(d);
							view_cost ufyk=new view_cost();
						}
						catch(Exception uc)
						{
							System.out.println(uc);
						}
					}
				});
		f.getContentPane().setBackground(Color.CYAN);
		Main.setBounds(200,20,700,50);
		pr.setBounds(210,150,290,50);
		vr.setBounds(520,150,290,50);
		cs.setBounds(210,240,290,50);
		ss.setBounds(520,240,290,50);
		ex.setBounds(210,340,290,50);
		print.setBounds(520,340,290,50);
		costs.setBounds(520,440,290,50);
		dp.setBounds(210,440,290,50);
		rd.setBounds(210,540,290,50);
		
		f.add(costs);
		f.add(dp);
		f.add(Main);
		f.add(pr);
		f.add(vr);
		f.add(cs);
		f.add(ss);
		f.add(print);
		f.add(ex);
		f.add(rd);
		f.setSize(1000,800);
		f.setLayout(null);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
	solution()
	{
		mainpage();
	}
	
	public static void main(String[] args) {
		solution c = new solution();
	}
}