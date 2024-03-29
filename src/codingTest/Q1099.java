package codingTest;

import java.util.Scanner;

public class Q1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[11][11];
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 2;
		int y = 2;
		while (true) {
			// 오른쪽으로 이동
			if (arr[x][y] == 0) {
				arr[x][y] = 9;
				y++;
			}
			// 벽에 부딪히면
			if (arr[x][y] == 1) {
				y--;
				x++;
			}
			// 먹이 발견
			if (arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
			}
			// 가장자리면 9로 바꾸고 멈춰!
			else if (arr[x][y+1] == 1 && arr[x+1][y] == 1) {
				if (arr[x][y] == 0) {
					arr[x][y] = 9;
					break;
				}
			}
		}
			
			for (int i=1; i<=10; i++) {
				for (int j=1; j<=10; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
	}
}