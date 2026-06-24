package demo;
import java.util.*;
public class EmployeeSalary {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		double basicSalary = sc.nextDouble();
		double hra = basicSalary * 0.20;
		double da = basicSalary * 0.10;
		double tax = basicSalary * 0.05;
		System.out.println("...SALARY SLIP...");
		System.out.println("Basic Salary:" + basicSalary);
		System.out.println("HRA:" + hra);
		System.out.println("DA:" + da);
		System.out.println("Tax:" + tax);
	}

}
