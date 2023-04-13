package codingTest;

import java.util.Scanner;

public class Q1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];	// 출석 불린 사람 배열
		int min = 23;	// 최소값 비교하기위해 그냥 학생 중 가장 높은 번호 넣음
		
		// 출석 배열에 넣기
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		
			// 최소값 비교
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min);
	}
}
