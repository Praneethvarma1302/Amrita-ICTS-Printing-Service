package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class printer_insert {
	public static int insert(printer_details s)
	{
		int k=0;
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			PreparedStatement ps=con.prepareStatement("INSERT INTO printers values(?,?,?,?)");
			ps.setString(1,s.getrid());
			long x=System.currentTimeMillis();
			java.sql.Date jv=new java.sql.Date(x);
			ps.setDate(2,jv);
			java.util.Date utilDate = new java.util.Date();
			java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());
			ps.setTime(3,sqlTime);
			ps.setInt(4,s.getpid());
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
}

