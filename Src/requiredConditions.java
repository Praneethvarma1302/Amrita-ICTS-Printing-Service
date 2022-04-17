package finalproject;

public class requiredConditions {
	private String rid,print_type,page_type,sizes;
	private int noc;
	public requiredConditions()
	{
		
	}
	public requiredConditions(String rid,String print_type,int noc,String page_type,String sizes)
	{
		this.rid=rid;
		this.print_type=print_type;
		this.noc=noc;
		this.page_type=page_type;
		this.sizes=sizes;
	}
	public String getrid()
	{
		return this.rid;
	}
	public String getprint_type()
	{
		return this.print_type;
	}
	public int getnoc()
	{
		return this.noc;
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
	public void setprint_type(String print_type)
	{
		this.print_type=print_type;
	}
	public void setnoc(int noc)
	{
		this.noc=noc;
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

