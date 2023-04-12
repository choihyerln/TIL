package codingTest;

import java.util.Scanner;

public class Q1071 {

	public static void main(String[] args) {
		int a = 1;
		print(a);
	}
	private static void print(int b) {
		Scanner sc = new Scanner(System.in);
		if (b!=0) {
			b = sc.nextInt();
			System.out.println(b);
			
			print(b);
		}
		
	}
}