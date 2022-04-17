package finalproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertConditions {
	public static int insert(requiredConditions s)
	{
		int k=0;
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project", "postgres", "mummydaddy");
			PreparedStatement ps=con.prepareStatement("INSERT INTO Request_details values(?,?,?,?,?)");
			ps.setString(1,s.getrid());
			ps.setString(2,s.getprint_type());
			ps.setInt(3,s.getnoc());
			ps.setString(4,s.getpage_type());
			ps.setString(5,s.getsizes());
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

