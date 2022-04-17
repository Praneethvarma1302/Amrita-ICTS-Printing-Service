package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delivery_insert {
	public static int insert(delivery_person s)
	{
		int k=0;
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			PreparedStatement ps=con.prepareStatement("INSERT INTO supplier values(?,?)");
			ps.setString(1,s.getname());
			ps.setString(2,s.getrid());
			k+=1;
			ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return k;
	}
}
