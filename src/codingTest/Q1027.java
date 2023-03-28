package codingTest;

import java.util.Scanner;

public class Q1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split("\\.");
		System.out.printf(b[2]+"-"+b[1]+"-"+b[0]);
	}
}