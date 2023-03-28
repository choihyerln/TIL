package codingTest;

import java.util.Scanner;

public class Q1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] a = time.split(":");
		if(a[1].equals("00"))			// 분이 00분이면
			System.out.println("0");		// 00 대신 0으로 출력
		else
			System.out.println(a[1]);
	}
}