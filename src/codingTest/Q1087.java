package codingTest;

import java.util.Scanner;

public class Q1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		
		for (int i=1; sum<=a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
