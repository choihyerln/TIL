package codingTest;

import java.util.Scanner;

public class Q1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a>b ? a:b);	// a가 b보다 클 때 a출력하고 그렇지 않으면 b출력
	}

}
