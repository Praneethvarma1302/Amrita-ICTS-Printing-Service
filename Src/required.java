package finalproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
public class required extends JFrame{
	public required()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField brr=new JTextField();
		String s[]= {"Color","Black n White"};
		JComboBox crr=new JComboBox(s);
		JTextField drr=new JTextField();
		String st[]= {"single","double"};
		JComboBox err=new JComboBox(st);
		String sk[]= {"A4","A3","A2","A1"};
		JComboBox frr=new JComboBox(sk);
		JFrame x=new JFrame();
		x.setSize(1000,700);
		JLabel label=new JLabel("Add Conditions");
		JLabel rid=new JLabel("RID: ");
		rid.setBounds(0,2,200,100);
		JLabel print_type=new JLabel("Print Type :");
		print_type.setBounds(0,102,200,100);
		JLabel noc=new JLabel("Number of copies");
		noc.setBounds(0,202,200,100);
		JLabel page_type=new JLabel("Page Type :");
		page_type.setBounds(0,302,200,100);
		JLabel sizes=new JLabel("Size of page");
		sizes.setBounds(0,402,200,100);
		JButton add=new JButton("Add Conditions");
		add.addActionListener(new ActionListener()
				{
				@Override
					public void actionPerformed(ActionEvent e)
					{
						String rid=brr.getText();
						String print_type=crr.getSelectedItem().toString();
						int noc=Integer.parseInt(drr.getText());
						String page_type=err.getSelectedItem().toString();
						String sizes=frr.getSelectedItem().toString();
						requiredConditions ss=new requiredConditions(rid,print_type,noc,page_type,sizes);
						int k=insertConditions.insert(ss);
						if(k>0)
						{
							System.out.println("Insertion done successfully");
							brr.setText("");
							drr.setText("");
						}
						else
						{
							System.out.println("Please give a valid input.");
						}
					}
				});
		brr.setBounds(400,2,500,70);
		crr.setBounds(400,102,500,70);
		drr.setBounds(400,202,500,70);
		err.setBounds(400,302,500,70);
		frr.setBounds(400,402,500,70);
		x.add(add);
		add.setVisible(true);
		add.setBounds(500,620,100,30);
		x.add(rid);
		x.add(print_type);
		x.add(noc);
		x.add(page_type);
		x.add(sizes);
		x.add(brr);
		x.add(crr);
		x.add(drr);
		x.add(err);
		x.add(frr);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
}

