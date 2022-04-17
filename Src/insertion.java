package finalproject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class insertion {
	public static int insert(staff_details s)
	{
		int k=0;
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			PreparedStatement ps=con.prepareStatement("INSERT INTO staff_details values(?,?,?,?,?,?)");
			ps.setString(1,s.getname());
			ps.setString(2,s.getrid());
			ps.setString(3,s.getDepartment());
			ps.setInt(4,s.getr_number());
			ps.setInt(5,s.getp_number());
			ps.setString(6,s.getpurpose());
			ps.executeUpdate();
			k+=1;
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return k;
	}
	public static List<staff_details>view()
	{
		List<staff_details> l=new ArrayList<staff_details>();
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			PreparedStatement ps=con.prepareStatement("Select * from staff_details");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				staff_details s=new staff_details();
				s.setname(rs.getString("rname"));
				s.setrid(rs.getString("rid"));
				s.setDepartment(rs.getString("Department"));
				s.setr_number(rs.getInt("room_number"));
				s.setp_number(rs.getInt("phone_number"));
				s.setpurpose(rs.getString("purpose"));
				l.add(s);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l;
	}
	
}

