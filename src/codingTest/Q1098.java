package codingTest;

import java.util.Scanner;

public class Q1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 격자 세로
		int w = sc.nextInt();	// 격자 가로
		int[][] arr = new int[h+1][w+1];
		int n = sc.nextInt();	// 막대 개수
		
		// 막대 개수 n개 만큼 반복
		for (int i=0; i<n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			// 막대 길이만큼 1 반복
			if (d==0) {			// 가로
				for (int j=0; j<l; j++)
					arr[x][y+j] = 1;
			}
			else if (d==1) {	// 세로
				for (int j=0; j<l; j++)
					arr[x+j][y] = 1;
			}
		}
		
		// 격자 표시
		for (int i=1; i<=h; i++) {
			for (int j=1; j<=w; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}