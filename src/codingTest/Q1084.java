package codingTest;

import java.util.Scanner;

public class Q1084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int b = sc.nextInt();
		int g = sc.nextInt();
		
		int sum=0;	// 가짓수
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<b; j++) {
				for (int k=0; k<g; k++) {
					System.out.printf("%d %d %d\n", i,j,k);
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
