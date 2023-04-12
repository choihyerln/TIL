package codingTest;

import java.util.Scanner;

public class Q1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		while(true) {
			System.out.println(a);
			a-=1;
			if (a==0) {
				System.out.println(a);
				break;
			}
		}
		
	}

}
