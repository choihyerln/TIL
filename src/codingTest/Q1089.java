package codingTest;

import java.util.Scanner;

public class Q1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	// 시작값
		int d = sc.nextInt();	// 등차값
		int n = sc.nextInt();	// 몇 번째 수
		
		int result = a + (d * (n-1));	// 구해야 하는 값, n번째에 위치한 숫자
		
		System.out.println(result);
	}
}