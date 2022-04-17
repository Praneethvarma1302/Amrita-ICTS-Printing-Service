package finalproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
public class requestedStaff extends JFrame{
	public requestedStaff()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField brr=new JTextField();
		JTextField crr=new JTextField();
		JTextField drr=new JTextField();
		JTextField err=new JTextField();
		JTextField frr=new JTextField();
		JTextField grr=new JTextField();
		JFrame x=new JFrame();
		x.setSize(1000,700);
		JLabel label=new JLabel("Add Staff");
		JLabel name=new JLabel("Name of requested staff: ");
		name.setBounds(0,2,200,100);
		JLabel rid=new JLabel("ID of the requested staff :");
		rid.setBounds(0,102,200,100);
		JLabel Department=new JLabel("Department of the Staff : ");
		Department.setBounds(0,202,200,100);
		JLabel r_number=new JLabel("Room Number : ");
		r_number.setBounds(0,302,200,100);
		JLabel p_number=new JLabel("Mobile number : ");
		p_number.setBounds(0,402,200,100);
		JLabel purpose=new JLabel("Purpose of the print : ");
		purpose.setBounds(0,502,200,100);
		JButton add=new JButton("Add Staff");
		add.addActionListener(new ActionListener()
				{
				@Override
					public void actionPerformed(ActionEvent e)
					{
						String name=brr.getText();
						String rid=crr.getText();
						String Department=drr.getText();
						int r_number=Integer.parseInt(err.getText());
						int p_number=Integer.parseInt(frr.getText());
						String purpose=grr.getText();
						staff_details ss=new staff_details(name,rid,Department,r_number,p_number,purpose);
						int k=insertion.insert(ss);
						if(k>0)
						{
							System.out.println("Insertion done successfully");
							brr.setText("");
							crr.setText("");
							drr.setText("");
							err.setText("");
							frr.setText("");
							grr.setText("");
						}
						else
						{
							System.out.println("Please give a valid input.");
						}
					}
				});
		brr.setBounds(400,2,500,70);
		brr.setFont(getFont());
		crr.setBounds(400,102,500,70);
		drr.setBounds(400,202,500,70);
		err.setBounds(400,302,500,70);
		frr.setBounds(400,402,500,70);
		grr.setBounds(400,502,500,70);
		x.add(add);
		add.setVisible(true);
		add.setBounds(500,620,100,30);
		x.add(purpose);
		x.add(p_number);
		x.add(r_number);
		x.add(Department);
		x.add(rid);
		x.add(name);
		x.add(brr);
		x.add(crr);
		x.add(drr);
		x.add(err);
		x.add(frr);
		x.add(grr);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
	public static void main(String[] args)
	{
		new requestedStaff();
	}
}

