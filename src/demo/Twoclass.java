package demo;

class OneClass
{
	void display()
	{
		System.out.println("This is a second class");
	}
}
public class Twoclass {

	public static void main(String[] args) {
		System.out.println("This the first class");
		OneClass oc = new OneClass();
		oc.display();
	}

}

