package codingTest;

import java.util.Scanner;

public class Q1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(16);
		
		for (int i=1; i<=15; i++) {
			System.out.printf("%x*%x=%x \n", n,i, n*i);
		}
		
	}

}
