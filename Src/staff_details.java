package finalproject;

public class staff_details {
	private int r_number,p_number;
	private String name,rid,Department,purpose;
	public staff_details()
	{
		
	}
	public staff_details(String name,String rid,String Department,int r_number,int p_number,String purpose)
	{
		super();
		this.name=name;
		this.rid=rid;
		this.Department=Department;
		this.r_number=r_number;
		this.p_number=p_number;
		this.purpose=purpose;
	}
	public String getname()
	{
		return this.name;
	}
	public String getrid()
	{
		return this.rid;
	}
	public String getDepartment()
	{
		return this.Department;
	}
	public int getr_number()
	{
		return this.r_number;
	}
	public int getp_number()
	{
		return this.p_number;
	}
	public String getpurpose()
	{
		return this.purpose;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setrid(String rid)
	{
		this.rid=rid;
	}
	public void setDepartment(String Department)
	{
		this.Department=Department;
	}
	public void setr_number(int r_number)
	{
		this.r_number=r_number;
	}
	public void setp_number(int p_number)
	{
		this.p_number=p_number;
	}
	public void setpurpose(String purpose)
	{
		this.purpose=purpose;
	}
}

