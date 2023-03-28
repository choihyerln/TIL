package codingTest;

import java.util.Scanner;

public class Q1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] f = sc.next().split("\\.");
		int x = Integer.valueOf(f[0]);
		int y = Integer.valueOf(f[1]);
		System.out.printf("%d\n%d", x, y);
	}
}