package demo;

public class Student {
	private int id;
	private String name;
	private String dept;
	
	public Student(){ }
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
}
