package finalproject;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
public class view_staff extends JFrame{
	static view_staff arr;
	public view_staff()
	{
		List<staff_details>brr=insertion.view();
		int k=brr.size();
		String data[][]=new String[k][6];
		int x=0;
		for(staff_details s:brr)
		{
			data[x][0]=s.getname();
			data[x][1]=s.getrid();
			data[x][2]=s.getDepartment();
			data[x][3]=String.valueOf(s.getp_number());
			data[x][4]=String.valueOf(s.getr_number());
			data[x][5]=s.getpurpose();
			x++;
		}
		String column[]= {"Name","RID","Department","Phone Number","Room Number","Purpose"};
		JTable y=new JTable(data,column);
		JScrollPane sp=new JScrollPane(y);
		add(sp);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,800,400);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args)
	{
		view_staff jk=new view_staff();
	}
}

