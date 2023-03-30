package codingTest;

import java.util.Scanner;

public class Q1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		System.out.println(2*a);
		System.out.printf("%d", a<<1);	//정수를 2배로 곱하거나 나누어 계산해주는 비트단위 시프트연산자<<,>>를 이용
	}
}