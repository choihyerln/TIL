package codingTest;

import java.util.Scanner;

public class Q1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	// 시작값
		int m = sc.nextInt();	// 곱할값
		int d = sc.nextInt();	// 더할값
		int n = sc.nextInt();	// 몇 번째 수
		int result = a;
		
		// a 다음 나오는 2번째 수를 i=1, 고로 구해야하는 수는 i=n-1
		for(int i=1; i<n; i++) {
			result = result * m + d;
		}
		System.out.println(result);
		
		// a를 처음으로 시작
//		for (int i=1; i<=n; i++) {
//			if (i==1)
//				result = a;
//			else
//				result = result * m + d;
//		}
//		System.out.println(result);
	}

}
