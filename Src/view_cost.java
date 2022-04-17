package finalproject;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class view_cost extends JFrame{
	static view_cost arr;
	public view_cost()
	{
		List<cost_details>brr=cost.view();
		int k=brr.size();
		String data[][]=new String[k][5];
		int x=0;
		for(cost_details s:brr)
		{
			data[x][0]=s.getrid();
			data[x][1]=String.valueOf(s.getcost());
			data[x][2]=String.valueOf(s.getpid());
			data[x][3]=s.getpage_type();
			data[x][4]=s.getsizes();
			x++;
		}
		String column[]= {"RID","Cost","Printer ID","Page Type","Sizes"};
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
		
		view_cost uyf=new view_cost();
	}
}

