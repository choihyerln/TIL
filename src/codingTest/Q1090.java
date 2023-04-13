package codingTest;

import java.util.Scanner;

public class Q1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	// 시작값
		int d = sc.nextInt();	// 등비값
		int n = sc.nextInt();	// 몇 번째 수
		
		double result = a * Math.pow(d, n-1);
		
		System.out.println((int)result);
	}
}