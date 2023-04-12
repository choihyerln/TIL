package codingTest;

import java.util.Scanner;

public class Q1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;		// 합
		int i=1; // count 값, 구하는 값 (여기까지 더해야 n이랑 같아짐)
		
		for (i=1; i<1000; i++) {
			sum += i;
			
			if (sum>=n)
				break;
		}
		System.out.println(i);
		
	}

}
