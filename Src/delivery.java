package finalproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class delivery extends JFrame{
	public delivery()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField brr=new JTextField();
		JTextField crr=new JTextField();
		JFrame x=new JFrame();
		x.setSize(1000,700);
		JLabel label=new JLabel("Add Staff");
		JLabel name=new JLabel("Name of delivery person: ");
		name.setBounds(0,2,200,100);
		JLabel rid=new JLabel("ID of the requested staff :");
		rid.setBounds(0,102,200,100);
		JButton add=new JButton("Add Staff");
		add.addActionListener(new ActionListener()
				{
				@Override
					public void actionPerformed(ActionEvent e)
					{
						String name=brr.getText();
						String rid=crr.getText();
						delivery_person ss=new delivery_person(name,rid);
						int k=delivery_insert.insert(ss);
						if(k>0)
						{
							System.out.println("Insertion done successfully");
							brr.setText("");
							crr.setText("");
						}
						else
						{
							System.out.println("Please give a valid input.");
						}
					}
				});
		brr.setBounds(400,2,500,70);
		crr.setBounds(400,102,500,70);
		x.add(add);
		add.setVisible(true);
		add.setBounds(500,620,100,30);
		x.add(rid);
		x.add(name);
		x.add(brr);
		x.add(crr);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
}
