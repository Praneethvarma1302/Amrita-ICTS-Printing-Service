package finalproject;
public class delivery_person {
	String dname,rid;
	public delivery_person()
	{
		
	}
	public delivery_person(String dname,String rid)
	{
		this.dname=dname;
		this.rid=rid;
	}
	public void setname(String dname)
	{
		this.dname=dname;
	}
	public void setrid(String rid)
	{
		this.rid=rid;
	}
	public String getname()
	{
		return this.dname;
	}
	public String getrid()
	{
		return this.rid;
	}
}