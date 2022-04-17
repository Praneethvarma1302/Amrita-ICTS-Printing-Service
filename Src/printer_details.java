package finalproject;

public class printer_details {
	String rid;
	int pid;
	public	printer_details()
	{
		
	}
	public printer_details(String rid,int pid)
	{
		this.rid=rid;
		this.pid=pid;
	}
	public void setrid(String rid)
	{
		this.rid=rid;
	}
	public void setpid(int pid)
	{
		this.pid=pid;
	}
	public String getrid()
	{
		return this.rid;
	}
	public int getpid()
	{
		return this.pid;
	}
}

