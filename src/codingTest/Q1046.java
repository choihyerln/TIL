package codingTest;

import java.util.Scanner;

public class Q1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		double avg = (double)sum/3;
		System.out.printf("%d%n%.1f", sum, avg);		
	}

}
