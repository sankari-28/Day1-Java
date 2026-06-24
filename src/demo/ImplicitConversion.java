package demo;

public class ImplicitConversion {

	public static void main(String[] args) {
		short s = 48;
		int i = s;
		System.out.println("Short to Int Conversion:" + i);
		
		int j = 80008;
		long l = j;
		System.out.println("Int to Long Conversion:" + l);
		
		float f = 65.21f;
		double d = f;
		System.out.println("Float to Double Conversion:" + d);
	}
}
