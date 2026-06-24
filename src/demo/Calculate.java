package demo;
import java.util.*;
public class Calculate {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter no of Subjects:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter your mark in Subject"+(i+1));
			int marks = sc.nextInt();
			sc.nextLine();
			sum += marks;
		}
		double avg = sum / n;
		double percent = (sum/n) * 100;
		System.out.println("Total Marks:" + sum);
		System.err.println("Average Marks:" + avg);
		System.out.println("Percentage:" + percent);
	}

}
