package codingTest;

import java.util.Scanner;

public class Q1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		System.out.println(a+1);	// 1증가
//		System.out.println(a++);	// a먼저 출력하고 1증가시킴
//		System.out.println(a);		// a 출력해보면 1증가된 값으로 출력
		System.out.println(++a);	// 증가한 뒤에 a출력 -> 1증가
	}
}