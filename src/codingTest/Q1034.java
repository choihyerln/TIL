package codingTest;

import java.util.Scanner;

public class Q1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		// n진수 -> 10진수로 바꿀 때에는 Integer클래스의 .valueOf/.parseInt 사용
		int a = Integer.parseInt(num, 8);
		// int a = Integer.valueOf(num, 8);
		System.out.println(a);
	}
}