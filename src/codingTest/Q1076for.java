package codingTest;

import java.util.Scanner;

public class Q1076for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.nextLine().charAt(0);
		
		for (char a='a'; a<=n; a++) {
			System.out.print(a+" ");
		}
	}
}