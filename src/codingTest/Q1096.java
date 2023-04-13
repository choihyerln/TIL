package codingTest;

import java.util.Scanner;

public class Q1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 흰 돌의 개수
		
		int[][] arr = new int[19][19]; 	// 바둑판 배열
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x-1][y-1] = 1;
			// 배열에 값 안들어간건 자동 0으로 초기화
		}
			
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
