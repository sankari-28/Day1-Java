package demo;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(101);
		s.setName("Rose");
		s.setDept("BCA");
		System.out.println("... 1. Student Details...");
		System.out.println("Id:" + s.getId());
		System.out.println("Name:" + s.getName());
		System.out.println("Department:" + s.getDept());
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("sank");
		s1.setDept("CSE");
		System.out.println("... 2. Student Details...");
		System.out.println("Id:" + s1.getId());
		System.out.println("Name:" + s1.getName());
		System.out.println("Department:" + s1.getDept());

	}

}
