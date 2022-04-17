package finalproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class printer extends JFrame{
	public printer()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTextField brr=new JTextField();
		JTextField crr=new JTextField();
		crr.setText("Date will be today's one");
		crr.setEditable(false);
		JTextField drr=new JTextField();
		drr.setText("Time will be the current time");
		drr.setEditable(false);
		JTextField err=new JTextField();
		JFrame x=new JFrame();
		x.setSize(1000,700);
		JLabel label=new JLabel("Add details");
		JLabel name=new JLabel("RID: ");
		name.setBounds(0,2,200,100);
		JLabel rid=new JLabel("DATE :");
		rid.setBounds(0,102,200,100);
		JLabel Department=new JLabel("TIME : ");
		Department.setBounds(0,202,200,100);
		JLabel r_number=new JLabel("Printer ID : ");
		r_number.setBounds(0,302,200,100);
		JButton add=new JButton("Add details");
		add.addActionListener(new ActionListener()
				{
				@Override
					public void actionPerformed(ActionEvent e)
					{
						String rid=brr.getText();
						int pid=Integer.parseInt(err.getText());
						printer_details ss=new printer_details(rid,pid);
						int k=printer_insert.insert(ss);
						if(k>0)
						{
							System.out.println("Insertion done successfully");
							brr.setText("");
							crr.setText("Date will be today's one");
							drr.setText("Time will be the current time");
							err.setText("");
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
		x.add(add);
		add.setVisible(true);
		add.setBounds(500,620,100,30);
		x.add(label);
		x.add(r_number);
		x.add(Department);
		x.add(rid);
		x.add(name);
		x.add(brr);
		x.add(crr);
		x.add(drr);
		x.add(err);
		x.setLocationRelativeTo(null);
		x.setLayout(null);
		x.setVisible(true);
	}
}
