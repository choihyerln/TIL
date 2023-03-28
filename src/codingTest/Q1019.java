package codingTest;

import java.util.Scanner;

public class Q1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String today = sc.next();
		String[] arr = today.split("\\.");		// "\\" 넣어주는 이유: 몇개의 특수문자는 코드 내에서 특정 의미를 가지고 있는 것들이라 코드가 돌아가지 않음
		int a = Integer.valueOf(arr[0]);
		int b = Integer.valueOf(arr[1]);
		int c = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", a, b, c);
	}
	
}