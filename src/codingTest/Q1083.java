package codingTest;

import java.util.Scanner;

public class Q1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<10) {
			for (int i=1; i<=n; i++) {
				if (i%3==0)
					System.out.println("X");
				else
					System.out.println(i);
			}
		}
		else 
			System.out.println("10보다 작은 수를 입력하세요.");
	}
}
