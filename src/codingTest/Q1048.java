package codingTest;

import java.util.Scanner;

public class Q1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d", a<<b);
		
		/** a<<1 = a*2의 1승
		 *  a<<2 = a*2의 2승
		 *  a<<b = a*2의 b승 */
	}
}