package finalproject;
public class cost_details {
	private String rid,page_type,sizes;
	private int cost,pid;
	public cost_details()
	{
		
	}
	public cost_details(String rid,int cost,int pid,String page_type,String sizes)
	{
		this.rid=rid;
		this.cost=cost;
		this.pid=pid;
		this.page_type=page_type;
		this.sizes=sizes;
	}
	public String getrid()
	{
		return this.rid;
	}
	public int getcost()
	{
		return this.cost;
	}
	public int getpid()
	{
		return this.pid;
	}
	public String getpage_type()
	{
		return this.page_type;
	}
	public String getsizes()
	{
		return this.sizes;
	}
	public void setrid(String rid)
	{
		this.rid=rid;
	}
	public void setcost(int cost)
	{
		this.cost=cost;
	}
	public void setpid(int pid)
	{
		this.pid=pid;
	}
	public void setpage_type(String page_type)
	{
		this.page_type=page_type;
	}
	public void setsizes(String sizes)
	{
		this.sizes=sizes;
	}
}