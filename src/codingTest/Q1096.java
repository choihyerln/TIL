package codingTest;

import java.util.Scanner;

public class Q1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 흰 돌의 갯수
		
		int[][] arr = new int[19][19];	// 바둑판 배열
		
		for (int a=0; a<n; a++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr[x-1][y-1] = 1;
		}

		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
