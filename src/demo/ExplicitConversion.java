package demo;

public class ExplicitConversion {

	public static void main(String[] args) {
		int i = 128;
		byte b = (byte)i;
		System.out.println("Int to Byte Conversion:" + b);
		
		double d = 58612.349;
		float f = (float)d;
		System.out.println("Double to Float Conversion:" + f);
		
		long l = 999999999;
		int j = (int)l;
		System.out.println("Long to Int Conversion:" + j);
	}

}
