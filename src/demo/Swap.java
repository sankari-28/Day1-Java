package demo;

public class Swap {

	void WithTemp(int a, int b) 
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap :"+ "a ="+ a + " " + "b=" + b);
	}
	void WithoutTemp(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap :"+ "a ="+ a + " " + "b=" + b);

	}

	public static void main(String[] args) 
	{
		int a = 10, b=20;
		Swap s = new Swap();
		System.out.println("With Temp variable:" + "a =" + a + " " + "b =" + b );
		s.WithTemp(a, b);
		
		System.out.println("Without Temp variable:" + "a =" + a + " " + "b =" + b );
		s.WithoutTemp(a, b);

	}

}
