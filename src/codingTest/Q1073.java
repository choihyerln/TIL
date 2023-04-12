package codingTest;

import java.util.Scanner;

public class Q1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			if (a==0) {
				System.out.println("출력을 중단합니다.");
				break;
			}
			System.out.println(a);
		}
	}

}
