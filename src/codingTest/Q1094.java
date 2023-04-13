package codingTest;

import java.util.Scanner;

public class Q1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[23];
		
		int n = sc.nextInt();
		
		// 부른 번호를 배열에 넣기
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		// 출석 부른거 배열에서 거꾸로 출력
		for (int i=n-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}

}
