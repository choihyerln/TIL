package codingTest;

import java.util.Scanner;

public class Q1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int k=1; k<=m; k++)
				System.out.println(i+", "+k);
		}
	}
}