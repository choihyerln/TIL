package codingTest;

import java.util.Scanner;

public class Q1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int a = Integer.valueOf(num, 16);	// 16진수 num을 10진수 int로 바꾼다
//		System.out.println(Integer.toOctalString(a));	// 8진수로 변환하여 출력
		System.out.printf("%o", a);	// 8진수로 변환하여 출력
	}
}