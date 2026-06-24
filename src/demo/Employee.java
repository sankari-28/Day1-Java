package demo;

public class Employee {
	private int id;
	private String name;
	private String dept;
	
	public Employee(int id, String name , String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
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
	public void display()
	{
		System.out.println("ID :" + id);
		System.out.println("NAME :" + name);
		System.out.println("DEPARTMENT :" + dept);

	}
}
